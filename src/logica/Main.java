package logica;

public class Main {
	public static void main(String[] args) {
		
//	      IFabricaFactory fabricaFactory = new IFabricaFactory();
//	  
//	      //Area del circulo
//	      IFabrica areaCirculo = fabricaFactory.getIFabrica("CIRCULO");	      
//	      areaCirculo.calcularArea();
//
//	      //Area del rectangulo    
//	      IFabrica areaRectangulo = fabricaFactory.getIFabrica("RECTANGULO");	     
//	      areaRectangulo.calcularArea();
//
//	      //Area del cuadrado
//	      IFabrica areaCuadrado = fabricaFactory.getIFabrica("CUADRADO");	     
//	      areaCuadrado.calcularArea();
//	      
		
		FactoryAbstracta a1 = FactoryProducto.getIFabrica(false);
		IFabrica fabrica = a1.getIFabrica("RECTANGULO");
		fabrica.calcularArea();
		
		IFabrica fabrica2 = a1.getIFabrica("CUADRADO");
		fabrica2.calcularArea();
		
		
		FactoryAbstracta a2 = FactoryProducto.getIFabrica(true);
		IFabrica fabrica3 = a2.getIFabrica("RECTANGULO");
		fabrica3.calcularArea();
		
		IFabrica fabrica4 = a2.getIFabrica("CUADRADO");
		fabrica4.calcularArea();
		
	   }
}
