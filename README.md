# Algoritmos de Ordenação em Java

Projeto desenvolvido para a disciplina de **Estrutura de Dados II**, com o objetivo de implementar e executar diferentes algoritmos de ordenação utilizando a linguagem Java.

## Algoritmos disponíveis

O projeto contém cinco algoritmos de ordenação:

- **Bubble Sort:** compara elementos adjacentes e realiza trocas quando estão fora de ordem.
- **Insertion Sort:** insere cada elemento na posição correta dentro da parte já ordenada.
- **Selection Sort:** seleciona o menor elemento e o posiciona corretamente.
- **Merge Sort:** utiliza a estratégia de divisão e conquista para ordenar os elementos.
- **Quick Sort:** utiliza um pivô para particionar e ordenar os elementos.

## Funcionalidades

- Menu interativo para seleção do algoritmo.
- Leitura dos números a partir de um arquivo `.txt`.
- Exibição dos dados antes e depois da ordenação.
- Exibição limitada aos 100 primeiros elementos para entradas grandes.
- Tratamento de erros na leitura dos dados e na escolha das opções.

## Tecnologias utilizadas

- **Linguagem:** Java
- **IDE:** IntelliJ IDEA
- **Controle de versão:** Git
- **Repositório:** GitHub

## Estrutura do projeto

```text
ProjetoOrdenacao_IntelliJ/
├── src/
│   └── ed2/
│       └── projeto/
│           └── algoritmosordenacao/
│               ├── BubbleSort.java
│               ├── InsertionSort.java
│               ├── SelectionSort.java
│               ├── MergeSort.java
│               ├── QuickSort.java
│               ├── IAlgoritmoOrdenacao.java
│               ├── Main.java
│               └── Utils.java
├── numeros.txt
└── .gitignore
```

## Como executar o projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/programmer977/javaOrdena-o.git
```

### 2. Abrir no IntelliJ IDEA

Abra a pasta do projeto no IntelliJ IDEA e configure o **JDK 21**.

### 3. Preparar os dados

O arquivo `numeros.txt` contém os números utilizados na ordenação.

Você pode alterar seu conteúdo para testar diferentes conjuntos de números.

### 4. Executar

Execute o método `main()` da classe `Main.java`.

O programa apresentará o menu:

```text
===== ALGORITMOS DE ORDENAÇÃO =====

1 - Bubble Sort
2 - Insertion Sort
3 - Selection Sort
4 - Merge Sort
5 - Quick Sort
0 - Sair

Escolha um algoritmo:
```

Após a seleção, o programa exibirá os números antes e depois da ordenação.

## Análise de complexidade

| Algoritmo | Melhor caso | Caso médio | Pior caso |
|---|---|---|---|
| Bubble Sort | O(n) | O(n²) | O(n²) |
| Insertion Sort | O(n) | O(n²) | O(n²) |
| Selection Sort | O(n²) | O(n²) | O(n²) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) |
| Quick Sort | O(n log n) | O(n log n) | O(n²) |

## Atividade acadêmica

Este projeto faz parte de uma atividade em equipe da disciplina de **Estrutura de Dados II**.

A atividade contempla a implementação e execução dos algoritmos de ordenação, além da análise comparativa de tempos estimados para diferentes tamanhos de entrada.

A etapa de simulação dos tempos de execução será realizada com auxílio de inteligência artificial, utilizando o **ChatGPT (GPT-6)**, com estimativas baseadas na complexidade computacional dos algoritmos.

## Repositório

[GitHub — javaOrdena-o](https://github.com/programmer977/javaOrdena-o)
