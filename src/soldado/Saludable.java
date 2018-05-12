package soldado;

public class Saludable extends EstadoSoldado{

	private Soldado soldadoSaludable ;
	
	public Saludable(Soldado s){
		
		this.soldadoSaludable = s ;
		
	}
	
	@Override
	public void recibirDisparo() {
		
		System.out.println("AHHH");
		
		soldadoSaludable.setSangre(soldadoSaludable.getSangre()-100);
		
		int b = soldadoSaludable.getAgujerosBalas();
		soldadoSaludable.setAgujerosBalas(b+1);
		
		soldadoSaludable.setEstado(new Herido(soldadoSaludable));	
		
	}

	@Override
	public void curarse() {

		System.out.println("Gracias pero ya estoy saludable");
		
	}

	@Override
	public void mostrarEstado() {
		
		System.out.println("Estoy saludable");
		
	}

}