package logica;

public class FactoryProducto {

	public static FactoryAbstracta getIFabrica(boolean rounded)
	{
		if(rounded)
		{
			return new RoundedIFabricaFactory();
		}
		else
		{
			return new IFactory();
		}
	}
}
