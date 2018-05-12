package soldado;

public class Soldado {
	
	private int sangre ;
	private int agujerosBalas ;
	private EstadoSoldado estado ;
	
	public final static int SANGRE_PROMEDIO = 5000 ;
	
	public Soldado(){
	
		this.sangre = SANGRE_PROMEDIO ;
		this.agujerosBalas = 0 ;
		this.estado = new Saludable(this) ;
	}
	
	
	public void recibirDisparo(){
		
		this.estado.recibirDisparo();
	}
	
	
	public void curarse(){
		
		this.estado.curarse();
	}

	public void mostrarEstado(){
		
		this.estado.mostrarEstado();
	}
	
	public EstadoSoldado getEstado() {
		return estado;
	}

	public void setEstado(EstadoSoldado estado) {
		this.estado = estado;
	}
	

	public int getSangre() {
		return sangre;
		
	}

	public void setSangre(int sangre) {
		this.sangre = sangre;
	}

	public int getAgujerosBalas() {
		return agujerosBalas;
	}

	public void setAgujerosBalas(int agujerosBalas) {
		this.agujerosBalas = agujerosBalas;
	}
}
