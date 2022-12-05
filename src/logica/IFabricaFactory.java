package logica;

public class IFabricaFactory {
	
	   public IFabrica getIFabrica(String elemento){
	      if(elemento == null)
	      {
	         return null;
	      }		
	      if(elemento.equalsIgnoreCase("CIRCULO"))
	      {
	         return new Circulo();	         
	      } 
	      else if(elemento.equalsIgnoreCase("RECTANGULO"))
	      {
	         return new Rectangulo();         
	      } 
	      else if(elemento.equalsIgnoreCase("CUADRADO"))
	      {
	         return new Cuadrado();
	      }
	      
	      return null;
	   }
}
