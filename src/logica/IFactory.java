package logica;

public class IFactory extends FactoryAbstracta{

	@Override
	public IFabrica getIFabrica(String elemento)
	{
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
