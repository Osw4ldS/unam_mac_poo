package semana3;

import java.util.Scanner;

public class Matrix_nxn {
    public static void main(String[] args) {
        int matrixSize = 15;
        int num = 1;
        int i = 0;
        int j = 0;
        boolean validSize = false;
        Integer[][] matrix = null;
        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese un número positivo impar para definir el tamaño de la matriz: ");

        do {
            matrixSize = read.nextInt();

            if(matrixSize % 2 != 0) validSize = true;
            else System.out.print("Ingrese un número positivo impar: ");
        } while(!validSize);

        System.out.printf("\nMatriz %dx%d:\n",matrixSize,matrixSize);
        matrix = new Integer[matrixSize][matrixSize];

        j = matrixSize/2;

        matrix[i][j] = num;
        num ++;

        while(num <= (matrixSize*matrixSize)) {
            if((num-1) % matrixSize == 0) i += 1;
            else {
                if(i == 0) i = matrixSize - 1;
                else i -= 1;

                if(j == (matrixSize-1)) j = 0;
                else j += 1;
            }

            matrix[i][j] = num;
            num++;
        }

        for(i = 0; i < matrixSize; i++) {
            for(j = 0; j < matrixSize; j++) {
                System.out.printf("[%d]",matrix[i][j]);
            }
            System.out.print("\n");
        }
    }
}
