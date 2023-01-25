package com.trybe.consultafilmes;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Filme {

  public final String titulo;
  public final int anoDeLancamento;
  public final Set<String> categorias;
  public final Set<String> diretores;
  public final Set<String> atores;
  public final Set<String> personagens;
  public final Map<String, Set<String>> atoresPorPersonagem;

  /**
   * Constroi um objeto que representa um filme.
   *
   * @param titulo Título do filme.
   * @param anoDeLancamento Ano de lançamento do filme.
   * @param categorias Conjunto de categorias a que pertence o filme (ação, comédia, drama, etc).
   * @param diretores Conjunto de diretores do filme.
   * @param atoresPorPersonagem Mapa que associa o nome de cada personagem do filme ao conjunto
   *                            de atores que o interpretaram.
   */
  public Filme(
      String titulo,
      int anoDeLancamento,
      Collection<String> categorias,
      Collection<String> diretores,
      Map<String, Set<String>> atoresPorPersonagem
  ) {
    this.titulo = titulo;
    this.anoDeLancamento = anoDeLancamento;
    this.categorias = Set.copyOf(categorias);
    this.diretores = Set.copyOf(diretores);
    this.atoresPorPersonagem = Collections.unmodifiableMap(atoresPorPersonagem);

    this.personagens = Collections.unmodifiableSet(atoresPorPersonagem.keySet());
    this.atores = atoresPorPersonagem.values().stream()
        .flatMap(Collection::stream)
        .collect(Collectors.toUnmodifiableSet());
  }

  @Override
  public String toString() {
    return String.format("%s (%d)", titulo, anoDeLancamento);
  }
}
