package com.trybe.consultafilmes;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConstrutorDeFilme {

  private final String titulo;
  private final int anoDeLancamento;
  private final Set<String> categorias = new HashSet<>();
  private final Set<String> diretores = new HashSet<>();
  private final Map<String, Set<String>> atoresPorPersonagem = new HashMap<>();

  public ConstrutorDeFilme(String titulo, int anoDeLancamento) {
    this.titulo = titulo;
    this.anoDeLancamento = anoDeLancamento;
  }

  public Filme construir() {
    return new Filme(titulo, anoDeLancamento, categorias, diretores, atoresPorPersonagem);
  }

  public ConstrutorDeFilme categorias(String... tags) {
    Collections.addAll(this.categorias, tags);
    return this;
  }

  public ConstrutorDeFilme diretores(String... diretores) {
    Collections.addAll(this.diretores, diretores);
    return this;
  }

  public ConstrutorDeFilme personagem(String personagem, String... atores) {
    atoresPorPersonagem.put(personagem, Set.of(atores));
    return this;
  }
}
