# Parrot Refactoring Kata
A execução do exercício Parrot Refactoring Kata faz parte do conjunto de TPs da disciplina Refatoração do curso de Engenharia de Software do INFNET. O objetivo é refatorar partes desse sistema utilizando boas práticas de engenharia de software, sempre com apoio de testes automatizados para garantir que o comportamento do sistema seja preservado, utilizando como versão a linguagem Java.

## Etapas
### 1 - Verificação Inicial e Testes Automatizados
Após análise da classe Parrot, observamos a existências de dois principais métodos: getSpeed() e getCry(), além de outros dois getters que estabelecem valores constantes - getLoadFactor() e getBaseSpeed() - e, por fim, um último getter que retorna o valor base de speed a partir de um cálculo: getBaseSpeed().

Os métodos getSpeed() e getCry() sofrem variações de acordo com algumas condições e valores de variáveis, todas executadas nos próprios métodos, sem a utilização de nenhum método auxiliar externo. Quanto aos testes, parecem ser suficientes para validar todos os casos possíveis iniciais, com taxa de cobertura de código de 100%.


