# Parrot Refactoring Kata
A execução do exercício Parrot Refactoring Kata faz parte do conjunto de TPs da disciplina Refatoração do curso de Engenharia de Software do INFNET. O objetivo é refatorar partes desse sistema utilizando boas práticas de engenharia de software, sempre com apoio de testes automatizados para garantir que o comportamento do sistema seja preservado, utilizando como versão a linguagem Java.

## Etapas
### 1 - Verificação Inicial e Testes Automatizados
Após análise da classe Parrot, observamos a existências de dois principais métodos: getSpeed() e getCry(), além de outros dois getters que estabelecem valores constantes - getLoadFactor() e getBaseSpeed() - e, por fim, um último getter que retorna o valor base de speed a partir de um cálculo: getBaseSpeed().

Os métodos getSpeed() e getCry() sofrem variações de acordo com algumas condições e valores de variáveis, todas executadas nos próprios métodos, sem a utilização de nenhum método auxiliar externo. Quanto aos testes, parecem ser suficientes para validar todos os casos possíveis iniciais, com taxa de cobertura de código de 100%.

### 2 - Reestruturando Métodos Complexos & 3 - Expressividade e Clareza com Variáveis

Como foi constatada a presença de dois métodos principais, decidi abordá-los diretamente. Como eles variavam de acordo com a espécie do papagaio, decidi reestruturar a classe de modo a permitir que cada classe fique responsável por seu próprio método, acabando com o compartilhamento de responsabilidades.

Para isso, criei uma interface de nome Parrot e com aquelas propriedades e métodos que eram presentes em todos os tipos de papagaios: getSpeed(), getCry() e baseSpeed. Então, criei classes específicas para cada espécie de papagaio, separando as responsabilidades.

### 3 - Expressividade e Clareza com Variáveis
Como muitas mudanças nesse sentido foram feitas nas etapas anteriores, aqui apenas tornei as variáveis com valores constantes estáticas e no formato UPPER_SNAKE_CASE, além de remover os magic numbers que estavam no código.

### 4 - Melhorando Assinaturas e Encapsulamento
Acredito que as mudanças necessárias foram feitas nas outras etapas, especialemtne a etapa 2.

### 5 - Reorganizando Classes e Processos
Criação da classe ParrotFactory e a implementação desse método para centralizar e organizar a criação de cada tipo de papagaio. 
