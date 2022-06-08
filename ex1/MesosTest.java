package ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MesosTest {

	@Test
	public void mesosTest() {

		Mesos mesos = new Mesos();

//Verifiquem que té 12 posicions
		equals(mesos.metodeMesos().size() == 12);
//Verifiquem que la posició 8 no és nul·la	
		assertNotNull(mesos.metodeMesos().get(8 - 1));
//Verifiquem que a la posició 8 tenim Agost	
		assertEquals("Agost", mesos.metodeMesos().get(8 - 1));

	}

}
