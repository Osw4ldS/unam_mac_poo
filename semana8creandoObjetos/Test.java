package semana8creandoObjetos;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner ent= new Scanner(System.in);
		
      Computador c1= new Computador();
      System.out.print("Ingrese la marca: ");
       c1.setMarca(ent.nextLine());
      System.out.print("\n Ingrese el precio: ");
       c1.setPrecio(ent.nextInt());
      System.out.print("\n Ingrese el numero de serie: ");
       c1.setSerie(ent.next());
      
      System.out.println(c1.getMarca());
      System.out.println(c1.getPrecio());
      System.out.println(c1.getSerie());
	}

}
