# Consulta Filmes (Coleções - streams)

    Este projeto foi realizado com o objetivo de aprimorar o conhecimento na linguagem Java.

## :zap: Descrição

**Meu objetivo foi implementar os métodos da classe Consultas** por meio da API `java.util.stream`, chamando os métodos: 
   - `stream`, `filter`, `map`, `flatMap` e `collect`.

:pushpin: Neles realizei as seguintes consultas sobre uma dada coleção de filmes:

  1. Atores que interpretaram a si próprios.
  2. Atores que atuaram em filmes de um determinado diretor, por ordem alfabética.
  3. Filmes em que o diretor atuou (ou pelo menos um deles), por ordem de lançamento (mais recentes primeiro).
  4. Filmes lançados em um determinado ano, agrupados por categoria.

```
public class Consultas {

  private final Collection<Filme> filmes;

  public Consultas(Collection<Filme> filmes) {
    this.filmes = filmes;
  }

  public Set<String> atoresQueInterpretaramSiProprios() {}

  public List<String> atoresQueAtuaramEmFilmesDoDiretorEmOrdemAlfabetica(String diretor) {}

  public List<Filme> filmesEmQuePeloMenosUmDiretorAtuouMaisRecentesPrimeiro() {}

  public Map<String, Set<Filme>> filmesLancadosNoAnoAgrupadosPorCategoria(int ano) {}
}
```

:pushpin: **Cada método equivale a uma das consultas.**

- A primeira consulta retorna um `Set<>`, pois os resultados não têm uma ordem definida.
- A segunda consulta retorna `List<>`, pois os resultados são dispostos em ordem alfabética.
- A terceira consulta retorna `List<>`, pois os resultados são dispostos em ordem de lançamento.
- A quarta consulta retorna um `Map<String, Set<Filme>>`. As chaves (`String`) do Map representam uma categoria, enquanto os valores (`Set<Filme>`) representam o conjunto de filmes que se encaixam nessa categoria.


## Instalação do projeto em sua máquina
  1. Clone o repositório
   
     `git@github.com:analuisams99/consulta-filmes.git`
    
  2. Entre no diretório do repositório que você acabou de clonar:
  
     `cd consulta-filmes`

  3. Instale as dependências:
    
     `mvn install`

## Para testar o projeto
  1. digite o comando no seu terminal
      
      `mvn test`
      
    Os códigos de testes, da pasta src/test/java/com/trybe/acc/java/consultafilmes, foram desenvolvidos pela Trybe.
    
---

-- Projeto desenvolvido por Ana Luisa Marques Simões, para fins didáticos. 2023
