package logica;

public class Circulo implements IFabrica {

	   @Override
	   public void calcularArea() {
		   int radio = 5;
		   double resultado = Math.PI * (radio*radio);
	      System.out.println("El area del circulo es: " + resultado);
	   }
}
