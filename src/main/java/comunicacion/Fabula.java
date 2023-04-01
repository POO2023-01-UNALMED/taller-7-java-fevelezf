package comunicacion;

public class Fabula extends Escrito {
	private String enseñanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas,String enseñanza,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.enseñanza=enseñanza;
		this.interpretacion=interpretacion;
		
	}
	public void setEnseñanza(String enseñanza) {
		this.enseñanza = enseñanza;
	}
	public String getEnseñanza() {
		return enseñanza;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	@Override
	int palabrasTotales(int palabrasPagina) {
		return getPaginas()*palabrasPagina*1;
	}

	@Override
	String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + getEnseñanza();
	}
}
