# Factory Method - Arena RPG

Laboratório de Padrões de Projeto em Java (FACOM/UFU). Evolução de um projeto
com Simple Factory para **Factory Method**, integrado com **Strategy** e **Adapter**.

## Estrutura
- `ArenaRPG` (abstrata) declara o Factory Method `criarPersonagem(tipo, nome)`.
- `ArenaClassica` e `ArenaSombriaRPG` decidem quais personagens criar.
- `EstrategiaAtaque` (`AtaqueNormal`, `AtaqueEspecial`): Strategy para o ataque.
- `MonstroAdaptado` adapta `MonstroAntigo` (Adapter).

## Como executar
Abra o projeto no NetBeans (ou outra IDE com suporte a Maven) e execute a
classe `com.mycompany.trab7.Trab7`. Digite os nomes dos personagens quando
o programa pedir.

## Diagrama UML
[Diagrama UML](UML.pdf)
