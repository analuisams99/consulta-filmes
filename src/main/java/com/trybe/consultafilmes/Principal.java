package com.trybe.consultafilmes;

import java.util.Set;

/**Classe Principal. */
public class Principal {

  /**
   * Função utilizada apenas para validação da solução do desafio.
   *
   * @param args Não utilizado.
   */
  public static void main(String[] args) {
    Consultas consultas = new Consultas(Filmes.todos());
    Set<String> resultados = consultas.atoresQueInterpretaramSiProprios();
    System.out.println(resultados);
    System.out.println(consultas
        .atoresQueAtuaramEmFilmesDoDiretorEmOrdemAlfabetica("Lana Wachowski"));
    System.out.println(consultas.filmesEmQuePeloMenosUmDiretorAtuouMaisRecentesPrimeiro());

  }
}
