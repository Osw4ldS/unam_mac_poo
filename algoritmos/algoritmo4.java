package algoritmos;

import java.util.Scanner;

public class algoritmo4 {
    public static void main(String[] args) {
        int grade = 0;
        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese la calificación: ");
        grade = read.nextInt();

        if(grade < 6){
            System.out.print("No lo lograste.");
        } else if(grade < 8) {
            System.out.print("Puedes hacerlo mejor.");
        } else if(grade == 8) {
            System.out.print("Bien hecho.");
        } else if(grade == 9) {
            System.out.print("Muy bien hecho.");
        } else {
            System.out.print("Excelente.");
        }
    }
}
