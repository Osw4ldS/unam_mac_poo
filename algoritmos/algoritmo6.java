package algoritmos;

import java.util.Scanner;

public class algoritmo6 {
    public static void main(String[] args) {
        int option = 0;
        int nGrades = 0;
        int worstGrade = 10;
        int bestGrade = 0;
        int count = 0;
        int avg = 0;
        boolean validOption = false;
        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese el número de calificaciones: ");
        nGrades = read.nextInt();

        int[] grades = new int[nGrades];

        for(int i = 0; i < grades.length; i++) {
            System.out.printf("Ingrese la calificación %d: ",(i+1));
            grades[i] = read.nextInt();
        }

        System.out.print("\nSeleccione una opción:" +
                "\n1) Obtener la calificación más baja." +
                "\n2) Obtener la calificación más alta." +
                "\n3) Calcular el promedio." +
                "\nSu opción: ");

        do {
            option = read.nextInt();
            if(1 <= option && option <= 3) validOption = true;
            else System.out.print("\nSeleccione una opción válida.\nSu opción: ");
        } while(!validOption);

        switch(option) {
            case 1: {
                for(int grade : grades) {
                    if (grade < worstGrade) worstGrade = grade;
                }
                System.out.printf("\nLa calificación más baja es: %d.",worstGrade);
                break;
            }
            case 2: {
                for(int grade : grades) {
                    if (grade > bestGrade) bestGrade = grade;
                }
                System.out.printf("\nLa calificación más alta es: %d.",bestGrade);
                break;
            }
            default: {
                for(int grade : grades) {
                    count += grade;
                }
                avg = count / grades.length;
                System.out.printf("\nEl promedio es: %d.",avg);
                break;
            }
        }
    }
}
