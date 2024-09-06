package algoritmos;

import java.util.Scanner;

public class algoritmo5 {
    public static void main(String[] args) {
        int year  = 0;
        int remainder1, remainder2, remainder3, remainder4 = 0;
        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        year = read.nextInt();

        if(year < 100) {
            remainder1 = year % 10;

            if(remainder1 % 4 == 0) System.out.printf("%d es año bisiesto.",year);
            else System.out.printf("%d no es año bisiesto.",year);
        } else if(year < 1000) {
            remainder1 = year % 100;
            remainder2 = remainder1 % 10;

            if(remainder2 % 4 == 0) System.out.printf("%d es año bisiesto.",year);
            else System.out.printf("%d no es año bisiesto.",year);
        } else if(year < 10000) {
            remainder1 = year % 1000;
            remainder2 = remainder1 % 100;
            remainder3 = remainder2 % 10;

            if(remainder3 % 4 == 0) System.out.printf("%d es año bisiesto.",year);
            else System.out.printf("%d no es año bisiesto.",year);
        } else if(year < 100000) {
            remainder1 = year % 10000;
            remainder2 = remainder1 % 1000;
            remainder3 = remainder2 % 100;
            remainder4 = remainder3 % 10;

            if(remainder4 % 4 == 0) System.out.printf("%d es año bisiesto.",year);
            else System.out.printf("%d no es año bisiesto.",year);
        } else {
            System.out.printf("Es poco probable que ahora sea necesario saber si el año %d es bisiesto o no.",year);
        }
    }
}
