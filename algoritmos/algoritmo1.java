package algoritmos;

import java.util.Scanner;

public class algoritmo1 {
    public static void main(String[] args) {
        int number = 0;
        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese un valor numérico entero positivo: ");
        number = read.nextInt();

        if(number % 2 == 0) System.out.printf("%d es par.",number);
        else System.out.printf("%d no es par.",number);
    }
}
