package comunicacion;

public class Alfabeto extends Pictograma {
	private static String[] letras ;
	private String interpretacion;
	
	public Alfabeto( String origen, String[] letras,String interpretacion) {
		super(origen);
		Alfabeto.letras=letras;
		this.interpretacion=interpretacion;
	}

	public static String[] getLetras() {
		return letras;
	}

	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	public int cantidadLetras() {
		return letras.length;
	}
	@Override
	public String interpretacion() {
		return interpretacion;
	}
	@Override
	public String toString() {
		 return String.join(", ", letras);
	}
	
	
	
	
	
	
	
	
	

}
