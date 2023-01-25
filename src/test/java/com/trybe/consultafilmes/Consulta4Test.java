package com.trybe.consultafilmes;

import static java.util.Collections.emptyMap;
import static java.util.Collections.emptySet;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Consulta4Test {

  @Test
  @DisplayName("Consulta 4 - consulta com base em coleção vazia deve retornar um Map vazio")
  public void consultaComBaseEmColecaoVazia() {
    testarConsulta(emptySet(), 2021, emptyMap());
  }

  @Test
  @DisplayName(
      "Consulta 4 - consulta deve retornar um Map vazio quando nenhum filme atende ao requisito"
  )
  public void nenhumFilmeAtendeAoRequisito() {
    testarConsulta(
        Set.of(Filmes.coracaoValente, Filmes.bastardosInglorios, Filmes.vingadoresUltimato),
        2021,
        emptyMap()
    );
  }

  @Test
  @DisplayName("Consulta 4 - consulta deve retornar resultados corretos")
  public void algunsFilmesAtendemAoRequisito() {
    testarConsulta(
        Filmes.todos(),
        2021,
        Map.of(
            "Ficção científica", Set.of(
                Filmes.naoOlheParaCima,
                Filmes.matrixResurrections,
                Filmes.homemAranhaSemVoltaParaCasa,
                Filmes.spaceJam2021),
            "Comédia", Set.of(
                Filmes.naoOlheParaCima,
                Filmes.spaceJam2021),
            "Ação", Set.of(
                Filmes.matrixResurrections,
                Filmes.homemAranhaSemVoltaParaCasa),
            "Drama", Set.of(
                Filmes.naoOlheParaCima),
            "Animação", Set.of(
                Filmes.spaceJam2021),
            "Aventura", Set.of(
                Filmes.matrixResurrections,
                Filmes.homemAranhaSemVoltaParaCasa),
            "Família", Set.of(
                Filmes.spaceJam2021)
        )
    );
  }

  @Test
  @DisplayName(
      "Consulta 4 - filme que atende os requisitos e pertence a mais de uma categoria deve aparecer"
          + " em todas elas"
  )
  public void multiplasCategorias() {
    Set<Filme> filmes = Set.of(Filmes.homemAranhaSemVoltaParaCasa);
    Consultas consultas = new Consultas(filmes);
    Map<String, Set<Filme>> saidasReais = consultas.filmesLancadosNoAnoAgrupadosPorCategoria(2021);

    Map<String, Set<Filme>> saidasEsperadas = Map.of(
        "Ação", Set.of(Filmes.homemAranhaSemVoltaParaCasa),
        "Aventura", Set.of(Filmes.homemAranhaSemVoltaParaCasa),
        "Ficção científica", Set.of(Filmes.homemAranhaSemVoltaParaCasa)
    );

    assertEquals(saidasEsperadas, saidasReais);
  }

  private static void testarConsulta(
      Collection<Filme> filmes,
      int anoDeLancamento,
      Map<String, Set<Filme>> saidasEsperadas) {

    Consultas consultas = new Consultas(filmes);

    Map<String, Set<Filme>> saidasReais =
        consultas.filmesLancadosNoAnoAgrupadosPorCategoria(anoDeLancamento);

    assertEquals(saidasEsperadas, saidasReais);
  }
}
