package ed2.projeto.algoritmosordenacao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros;
        try {
            List<Integer> lista = new ArrayList<>();
            for (String linha : Files.readAllLines(Paths.get("numeros.txt"))) {
                for (String parte : linha.trim().split("[,;\\s]+")) {
                    if (!parte.isEmpty()) {
                        lista.add(Integer.parseInt(parte));
                    }
                }
            }
            if (lista.isEmpty()) {
                System.out.println("O arquivo numeros.txt está vazio.");
                return;
            }
            numeros = new int[lista.size()];
            for (int i = 0; i < lista.size(); i++) numeros[i] = lista.get(i);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Erro ao ler numeros.txt: " + e.getMessage());
            return;
        }

        while (true) {
            System.out.println("\n1 - Bubble Sort");
            System.out.println("2 - Insertion Sort");
            System.out.println("3 - Selection Sort");
            System.out.println("4 - Merge Sort");
            System.out.println("5 - Quick Sort");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Opção inválida.");
                scanner.nextLine();
                continue;
            }
            int opcao = scanner.nextInt();
            if (opcao == 0) break;
            IAlgoritmoOrdenacao algoritmo;
            switch (opcao) {
                case 1: algoritmo = new BubbleSort(); break;
                case 2: algoritmo = new InsertionSort(); break;
                case 3: algoritmo = new SelectionSort(); break;
                case 4: algoritmo = new MergeSort(); break;
                case 5: algoritmo = new QuickSort(); break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }
            int[] vetor = numeros.clone();
            System.out.println("Entrada:");
            imprimirPrimeirosCem(vetor);
            algoritmo.ordenarVetor(vetor);
            System.out.println("Saída (" + algoritmo + "):");
            imprimirPrimeirosCem(vetor);
        }
    }

    private static void imprimirPrimeirosCem(int[] vetor) {
        int limite = Math.min(vetor.length, 100);
        for (int i = 0; i < limite; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(vetor[i]);
        }
        System.out.println();
    }
}
