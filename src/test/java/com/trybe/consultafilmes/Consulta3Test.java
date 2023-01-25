package com.trybe.consultafilmes;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptySet;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Consulta3Test {

  @Test
  @DisplayName("Consulta 3 - consulta com base em coleção vazia deve retornar uma lista vazia")
  public void consultaComBaseEmColecaoVazia() {
    testarConsulta(emptySet(), emptyList());
  }

  @Test
  @DisplayName(
      "Consulta 3 - consulta deve retornar uma lista vazia quando nenhum filme atende ao requisito"
  )
  public void nenhumFilmeAtendeAoRequisito() {
    testarConsulta(
        Set.of(Filmes.spaceJam2021, Filmes.homemAranhaSemVoltaParaCasa, Filmes.djangoLivre),
        emptyList()
    );
  }

  @Test
  @DisplayName("Consulta 3 - consulta deve retornar resultados corretos na ordem correta")
  public void algunsFilmesAtendemAoRequisito() {
    testarConsulta(
        Filmes.todos(),
        List.of(Filmes.coracaoValente, Filmes.rockyII, Filmes.oGrandeDitador)
    );
  }

  @Test
  @DisplayName("Consulta 3 - nenhum filme deve aparecer mais de uma vez na lista de resultados")
  public void itensDuplicados() {
    List<Filme> filmes = List.of(Filmes.coracaoValente, Filmes.coracaoValente);
    Consultas consultas = new Consultas(filmes);
    List<Filme> resultados = consultas.filmesEmQuePeloMenosUmDiretorAtuouMaisRecentesPrimeiro();

    long contagemCoracaoValente = resultados.stream()
        .filter(filme -> filme.equals(Filmes.coracaoValente))
        .count();

    assertEquals(1, contagemCoracaoValente);
  }

  private static void testarConsulta(Collection<Filme> filmes, List<Filme> saidasEsperadas) {
    Consultas consultas = new Consultas(filmes);
    List<Filme> saidasReais = consultas.filmesEmQuePeloMenosUmDiretorAtuouMaisRecentesPrimeiro();
    assertEquals(saidasEsperadas, saidasReais);
  }
}
