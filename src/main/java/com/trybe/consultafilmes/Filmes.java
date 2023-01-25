package com.trybe.consultafilmes;

import java.util.Set;

public class Filmes {

  public static final Filme spaceJam2021 =
      new ConstrutorDeFilme("Space Jam", 2021)
          .categorias("Família", "Animação", "Comédia", "Ficção científica")
          .diretores("Malcolm D. Lee")
          .personagem("LeBron James", "LeBron James", "Stephen Kankole")
          .personagem("AI G", "Don Cheadle")
          .personagem("Dominic 'Dom' James", "Cedric Joe")
          .construir();

  public static final Filme queroSerJohnMalkovich =
      new ConstrutorDeFilme("Quero Ser John Malkovich", 1999)
          .categorias("Comédia", "Drama", "Fantasia")
          .diretores("Spike Jonze")
          .personagem("Craig Schwartz", "John Cusack")
          .personagem("John Malkovich", "John Malkovich")
          .personagem("Lotte Schwartz", "Cameron Diaz")
          .personagem("Maxine Lund", "Catherine Keener")
          .personagem("Floris", "Mary Kay Place")
          .construir();

  public static final Filme homemAranhaSemVoltaParaCasa =
      new ConstrutorDeFilme("Homem-Aranha: Sem Volta Para Casa", 2021)
          .categorias("Ação", "Aventura", "Ficção científica")
          .diretores("Jon Watts")
          .personagem("Peter Parker / Homem Aranha", "Tom Holland")
          .personagem("Michelle 'MJ' Jones", "Zendaya")
          .personagem("Stephen Strange / Doutor Estranho", "Benedict Cumberbatch")
          .personagem("Max Dillon / Electro", "Jamie Foxx")
          .personagem("Dr. Otto Octavius / Doutor Octopus", "Alfred Molina")
          .construir();

  public static final Filme matrixResurrections =
      new ConstrutorDeFilme("Matrix Resurrections", 2021)
          .categorias("Ficção científica", "Ação", "Aventura")
          .diretores("Lana Wachowski")
          .personagem("Thomas A. Anderson / Neo", "Keanu Reeves")
          .personagem("Tiffany / Trinity", "Carrie-Anne Moss")
          .personagem("Morpheus", "Yahya Abdul-Mateen II")
          .personagem("Smith", "Jonathan Groff")
          .personagem("The Analyst", "Neil Patrick Harris")
          .construir();

  public static final Filme naoOlheParaCima =
      new ConstrutorDeFilme("Não Olhe para Cima", 2021)
          .categorias("Comédia", "Drama", "Ficção científica")
          .diretores("Adam McKay")
          .personagem("Kate Dibiasky", "Jennifer Lawrence")
          .personagem("Dr. Randall Mindy", "Leonardo DiCaprio")
          .personagem("President Orlean", "Meryl Streep")
          .personagem("Dr. Teddy Oglethorpe", "Rob Morgan")
          .construir();

  public static final Filme vingadoresUltimato =
      new ConstrutorDeFilme("Vingadores: Ultimato", 2019)
          .categorias("Aventura", "Ficção científica", "Ação")
          .diretores("Joe Russo", "Anthony Russo")
          .personagem("Tony Stark / Homem de Ferro", "Robert Downey Jr.")
          .personagem("Steve Rogers / Capitão América", "Chris Evans")
          .personagem("Bruce Banner / Hulk", "Mark Ruffalo")
          .personagem("Thor Odinson", "Chris Hemsworth")
          .personagem("Natasha Romanoff / Viúva Negra", "Scarlett Johansson")
          .personagem("Clint Barton / Gavião Arqueiro", "Jeremy Renner")
          .personagem("Thanos", "Josh Brolin")
          .construir();

  public static final Filme pulpFiction =
      new ConstrutorDeFilme("Pulp Fiction: Tempo de Violência", 1994)
          .categorias("Thriller", "Crime")
          .diretores("Quentin Tarantino")
          .personagem("Vincent Vega", "John Travolta")
          .personagem("Jules Winnfield", "Samuel L. Jackson")
          .personagem("Mia Wallace", "Uma Thurman")
          .personagem("Butch Coolidge", "Bruce Willis")
          .personagem("Marsellus Wallace", "Ving Rhames")
          .personagem("Winston 'The Wolf' Wolfe", "Harvey Keitel")
          .construir();

  public static final Filme djangoLivre =
      new ConstrutorDeFilme("Django Livre", 2012)
          .categorias("Drama", "Faroeste")
          .diretores("Quentin Tarantino")
          .personagem("Django Freeman", "Jamie Foxx")
          .personagem("Dr. King Schultz", "Christoph Waltz")
          .personagem("Calvin J. Candie", "Leonardo DiCaprio")
          .personagem("Broomhilda von Shaft", "Kerry Washington")
          .personagem("Stephen", "Samuel L. Jackson")
          .construir();

  public static final Filme bastardosInglorios =
      new ConstrutorDeFilme("Bastardos Inglórios", 2009)
          .categorias("Drama", "Ação", "Thriller", "Guerra")
          .diretores("Quentin Tarantino")
          .personagem("First Lieutenant Aldo 'The Apache' Raine", "Brad Pitt")
          .personagem("Shosanna Dreyfus / Emmanuelle Mimieux", "Mélanie Laurent")
          .personagem("SS Colonel Hans 'The Jew Hunter' Landa", "Christoph Waltz")
          .personagem("Staff Sergeant Donny 'The Bear Jew' Donowitz", "Eli Roth")
          .personagem("Lieutenant Archie Hicox", "Michael Fassbender")
          .personagem("Bridget von Hammersmark", "Diane Kruger")
          .construir();

  public static final Filme coracaoValente =
      new ConstrutorDeFilme("Coração Valente", 1995)
          .categorias("Ação", "Drama", "História", "Guerra")
          .diretores("Mel Gibson")
          .personagem("William Wallace", "Mel Gibson")
          .personagem("Murron MacClannough", "Catherine McCormack")
          .personagem("Princess Isabelle", "Sophie Marceau")
          .personagem("King Edward", "Patrick McGoohan")
          .personagem("Robert the Bruce", "Angus Macfadyen")
          .construir();

  public static final Filme rockyII =
      new ConstrutorDeFilme("Rocky II: A Revanche", 1979)
          .categorias("Drama")
          .diretores("Sylvester Stallone")
          .personagem("Robert 'Rocky' Balboa", "Sylvester Stallone")
          .personagem("Adrianna 'Adrian' Balboa", "Talia Shire")
          .personagem("Paulie Pennino", "Burt Young")
          .personagem("Apollo Creed", "Carl Weathers")
          .personagem("Mickey Goldmill", "Burgess Meredith")
          .personagem("Tony 'Duke' Evers", "Tony Burton")
          .construir();

  public static final Filme oGrandeDitador =
      new ConstrutorDeFilme("O Grande Ditador", 1940)
          .categorias("Comédia", "Guerra")
          .diretores("Charlie Chaplin")
          .personagem("Adenoid Hynkel", "Charlie Chaplin")
          .personagem("Benzino Napaloni", "Jack Oakie")
          .personagem("Commander Schultz", "Reginald Gardiner")
          .personagem("Garbitsch", "Henry Daniell")
          .personagem("Field Marshal Herring", "Billy Gilbert")
          .construir();

  /**
   * Fornece um conjunto de filmes. Os dados estão incompletos, mas já são suficientes para testar
   * as consultas do desafio.
   *
   * @return Conjunto de filmes.
   */
  public static Set<Filme> todos() {
    return Set.of(
        spaceJam2021,
        queroSerJohnMalkovich,
        homemAranhaSemVoltaParaCasa,
        matrixResurrections,
        naoOlheParaCima,
        vingadoresUltimato,
        pulpFiction,
        djangoLivre,
        bastardosInglorios,
        coracaoValente,
        rockyII,
        oGrandeDitador);
  }
}
