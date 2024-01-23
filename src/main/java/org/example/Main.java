package org.example;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        calculadora();

    }
    static void calculadora(){
        // Separando a parte do menu do código da calculadora pra não deixar a classe muito cheia
        String escolha = menu();

        // Usando switch case pra fazer a logica do calculo

        switch (escolha){
            case "+" :
                double[] addNumbers = sendNumbers();
                double adicao = addNumbers[0] + addNumbers[1];
                System.out.printf("O resultado é %.2f\n", adicao);
                calculadora();
                break;
            case "-":
                double[] subtractNumbers = sendNumbers();
                double subtracao = subtractNumbers[0] - subtractNumbers[1];
                System.out.printf("O resultado é %.2f\n", subtracao);
                calculadora();
                break;
            case "*":
                double[] multiplyNumbers = sendNumbers();
                double multi = multiplyNumbers[0] * multiplyNumbers[1];
                System.out.printf("O resultado é %.2f\n", multi);
                calculadora();
                break;
            case "/":
                double[] divideNumbers = sendNumbers();
                double divisao = divideNumbers[0] / divideNumbers[1];
                System.out.printf("O resultado é %.2f\n", divisao);
                calculadora();
                break;
            case "0":
                System.out.println("Saindo da aplicação...");
                System.exit(0);
            default:
                System.out.println("A opção escolhida é invalida, tente novamente\n");
                break;
        }
    }
    static String menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha a operação que deseja:\n" +
                "+ : Adição" +
                "\n- : Subtração" +
                "\n* : Multiplicação" +
                "\n/ : Divisão" +
                "\n0 : Sair");
        String escolha = scan.nextLine();
        return escolha;
    }

    // Fazendo uma função para detectar os numeros a serem calculados, armazenando eles em um array e enviando para a aplicação
    static double[] sendNumbers(){
        double[] numbers = new double[2];
        System.out.println("Digite o primeiro numero: ");
        numbers[0] = scan.nextDouble();
        System.out.println("Digite o segundo numero: ");
        numbers[1] = scan.nextDouble();
        return numbers;
    }
}


