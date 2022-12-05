package logica;

public class Rectangulo implements IFabrica {

	   @Override
	   public void calcularArea() {
		   //Rectangulo
		   int a = 1, b = 3;
		   int resultado = a * b;
	      System.out.println("El area del rectangulo es: " + resultado);
	   }
}
