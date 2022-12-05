package logica;

public class Cuadrado implements IFabrica {

	   @Override
	   public void calcularArea() {
		   int lado = 5;
		   int resultado = lado * lado;
	      System.out.println("El area del cuadrado es: " + resultado);
	   }
}
