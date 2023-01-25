package com.trybe.consultafilmes;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptySet;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Consulta2Test {

  @Test
  @DisplayName("Consulta 2 - consulta com base em coleção vazia deve retornar uma lista vazia")
  public void consultaComBaseEmColecaoVazia() {
    testarConsulta(emptySet(), "Malcolm D. Lee", emptyList());
  }

  @Test
  @DisplayName(
      "Consulta 2 - consulta deve retornar uma lista vazia quando nenhum ator atende ao requisito"
  )
  public void nenhumAtorAtendeAoRequisito() {
    testarConsulta(Filmes.todos(), "(diretor não incluso)", emptyList());
  }

  @Test
  @DisplayName("Consulta 2 - consulta deve retornar resultados corretos na ordem correta")
  public void algunsAtoresAtendemAoRequisito() {
    testarConsulta(
        Filmes.todos(),
        "Quentin Tarantino",
        List.of(
            "Brad Pitt",
            "Bruce Willis",
            "Christoph Waltz",
            "Diane Kruger",
            "Eli Roth",
            "Harvey Keitel",
            "Jamie Foxx",
            "John Travolta",
            "Kerry Washington",
            "Leonardo DiCaprio",
            "Michael Fassbender",
            "Mélanie Laurent",
            "Samuel L. Jackson",
            "Uma Thurman",
            "Ving Rhames")
    );
  }

  @Test
  @DisplayName("Consulta 2 - nenhum ator deve aparecer mais de uma vez na lista de resultados")
  public void itensDuplicados() {
    Set<Filme> filmes = Set.of(Filmes.pulpFiction, Filmes.djangoLivre);
    Consultas consultas = new Consultas(filmes);
    List<String> resultados =
        consultas.atoresQueAtuaramEmFilmesDoDiretorEmOrdemAlfabetica("Quentin Tarantino");

    long contagemSamuelJackson = resultados.stream()
        .filter(ator -> ator.equals("Samuel L. Jackson"))
        .count();

    assertEquals(1, contagemSamuelJackson);
  }

  private static void testarConsulta(
      Collection<Filme> filmes,
      String diretor,
      List<String> saidasEsperadas) {

    Consultas consultas = new Consultas(filmes);

    List<String> saidasReais =
        consultas.atoresQueAtuaramEmFilmesDoDiretorEmOrdemAlfabetica(diretor);

    assertEquals(saidasEsperadas, saidasReais);
  }
}
