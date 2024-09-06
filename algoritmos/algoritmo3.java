package algoritmos;

import java.util.Scanner;

public class algoritmo3 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        String symbol;
        boolean validSymbol = false;
        Scanner read = new Scanner(System.in);

        System.out.print("Seleccione una operación:" +
                "\n- Suma (+)" +
                "\n- Resta(-)" +
                "\n- Multiplicación (x)" +
                "\n- División (/)" +
                "\nSu opción: ");

        do {
            symbol = read.next();
            if(symbol.equals("+") || symbol.equals("-") || symbol.equals("x") || symbol.equals("/")) validSymbol = true;
            else System.out.print("Seleccione una opción válida.\nSu opción: ");
        } while(!validSymbol);

        System.out.print("Ingrese el primer valor entero: ");
        num1 = read.nextInt();
        System.out.print("Ingrese el segundo valor entero: ");
        num2 = read.nextInt();

        switch (symbol) {
            case "+": {
                result = num1 + num2;
                System.out.printf("%d+%d = %d",num1,num2,result);
                break;
            }
            case "-": {
                result = num1 - num2;
                System.out.printf("%d-%d = %d",num1,num2,result);
                break;
            }
            case "x": {
                result = num1 * num2;
                System.out.printf("%dx%d = %d",num1,num2,result);
                break;
            }
            default: {
                if (num2 == 0) {
                    System.out.println("La división entre 0 es indeterminada.");
                    break;
                }
                else {
                    result = num1 / num2;
                    System.out.printf("%d/%d = %d",num1,num2,result);
                    break;
                }
            }
        }
    }
}
