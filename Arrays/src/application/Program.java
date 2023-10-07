package application;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o comprimento do array: ");

        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextDouble();
        };
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double avg = sum/n;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
        sc.close();
    }

}
