package ex3;

import org.junit.Test;

public class AppTest {
	App appTest = new App();
	String[] miArray = { "Blanc", "Negre" };

	@Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPrintItems() {
        
        App.altreMetode();
	}
}
