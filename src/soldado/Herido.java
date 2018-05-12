package soldado;

public class Herido extends EstadoSoldado{

	private Soldado soldadoHerido ;
	
	public Herido(Soldado s){
	
		this.soldadoHerido = s ;
	}
	
	
	@Override
	public void recibirDisparo()
	{
		System.out.println("AHHHHHHHH");
		
		soldadoHerido.setSangre(soldadoHerido.getSangre()-100);
		
		int b = soldadoHerido.getAgujerosBalas();
		soldadoHerido.setAgujerosBalas(b+1);
		
		if(soldadoHerido.getAgujerosBalas() == 2)
			soldadoHerido.setEstado( new Muerto(soldadoHerido) );
		
	}

	@Override
	public void curarse() {

		soldadoHerido.setEstado( new Saludable(soldadoHerido) );
		soldadoHerido.setAgujerosBalas(soldadoHerido.getAgujerosBalas() - 1);
		
	}
	
	@Override
	public void mostrarEstado() {
		
		System.out.println("Estoy herido");
		
	}

}