package br.com.danilobetelli;

import java.util.Scanner;

public class NotaFinalAluno {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Vamos ver o que vai contecer? ");
        System.out.print("Digite a primeira nota: ");
        double primeiraNota = s.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double segundaNota = s.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double terceiraNota = s.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double quartaNota = s.nextDouble();

        double notaFinal = calcNotaFinal(primeiraNota, segundaNota, terceiraNota, quartaNota);
        System.out.println("Sua nota final é: " + notaFinal);

        if (notaFinal >= 7 && notaFinal <= 10) {
            System.out.println("Aprovado!");
        } else if (notaFinal >= 5 && notaFinal < 7) {
            System.out.println("Recuperação!");
        } else if (notaFinal >= 0 && notaFinal < 5) {
            System.out.println("Não aprovado.");
        } else {
            System.out.println("Nota inválida!");
        }
    }

    private static double calcNotaFinal(double primeiraNota, double segundaNota, double terceiraNota, double quartaNota) {
        double notaFinal = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
        return notaFinal;
    }
}
