package ex1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static java.util.Arrays.asList;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class MesosTest {

	@Test
	void test() {

		List<String> mesos = new ArrayList<String>();

		mesos.add("Gener");
		mesos.add("Febrer");
		mesos.add("Març");
		mesos.add("Abril");
		mesos.add("Maig");
		mesos.add("Juny");
		mesos.add("Juliol");
		mesos.add("Agost");
		mesos.add("Setembre");
		mesos.add("Octubre");
		mesos.add("Novembre");
		mesos.add("Decembre");

//Verifiquem que té 12 posicions
		equals(mesos.size() == 12);
//Verifiquem que la posició 8 no és nul·la		
		assertNotNull(mesos.get(8 - 1));
//Verifiquem que a la posició 8 tenim Agost		
		assertEquals("Agost", mesos.get(8 - 1));
	}
}
