package semana1;

import java.util.Scanner;

public class Hola {
    public static void main(String[] args) {
        String name;
        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        name = read.next();
        System.out.println("¡Hola, "+name+"!");
    }
}
