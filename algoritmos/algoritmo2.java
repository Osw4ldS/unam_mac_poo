package algoritmos;

import java.util.Scanner;

public class algoritmo2 {
    public static void main(String[] args) {
        int nGrades = 0;
        int count = 0;
        int avg = 0;
        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese el número de calificaciones que desea promediar: ");
        nGrades = read.nextInt();

        int[] grades = new int[nGrades];

        for(int i = 0; i < grades.length; i++) {
            System.out.printf("Ingrese el valor entero de la calificación %d: ",(i+1));
            grades[i] = read.nextInt();
        }

        for(int grade : grades) {
            count += grade;
        }

        avg = count / grades.length;
        System.out.printf("El promedio es: %d",avg);
    }
}
