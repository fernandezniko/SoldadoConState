package soldado;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestSoldado {

	
	@Test
	public void testSoldadoSaludable(){
		
		Soldado s1 = new Soldado() ;
		
		s1.mostrarEstado();
		
		Assert.assertEquals(s1.getAgujerosBalas(), 0);
		Assert.assertEquals(s1.getSangre(), 5000);
		
		s1.recibirDisparo();

		Assert.assertEquals(s1.getAgujerosBalas(), 1);
		Assert.assertEquals(s1.getSangre(), 4900);
		
		s1.mostrarEstado();
		
	}
	
	@Test 
	public void testSoldadoHerido(){
		
		Soldado s1 = new Soldado() ;
		
		s1.recibirDisparo();
		
		s1.mostrarEstado();
		
		s1.recibirDisparo();
	}
	
	@Test
	public void testSoldadoMuerto(){
		
		Soldado s1 = new Soldado() ;
		
		s1.recibirDisparo();
		s1.recibirDisparo();
		
		s1.mostrarEstado();
		
		s1.curarse();
		
		Assert.assertEquals(s1.getAgujerosBalas(),0) ;
		Assert.assertEquals(s1.getSangre(), 5000);
		
		s1.mostrarEstado();
	}
	
	
	@Test
	public void testCuracionSoldadoHerido(){
		
		Soldado s1 = new Soldado() ;
		
		s1.curarse();
		
		s1.recibirDisparo();
		
		s1.mostrarEstado();
		
		s1.curarse();
		
		s1.mostrarEstado();
	}
	

}
