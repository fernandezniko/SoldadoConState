package soldado;

public class Muerto extends EstadoSoldado{

	private Soldado soldadoMuerto ;
	
	public Muerto(Soldado s){
		
		this.soldadoMuerto = s ;
	}
	
	@Override
	public void recibirDisparo() {
		
		int balas = soldadoMuerto.getAgujerosBalas() ;
		soldadoMuerto.setAgujerosBalas(balas++);
		
		soldadoMuerto.setSangre(soldadoMuerto.getSangre()-100);
	}

	@Override
	public void curarse() {
		
		soldadoMuerto.setEstado( new Saludable(soldadoMuerto) );
		soldadoMuerto.setSangre(5000);
		soldadoMuerto.setAgujerosBalas(0);
	}
	
	@Override
	public void mostrarEstado() {
		
		System.out.println("Estoy muerto");
		
	}

}
