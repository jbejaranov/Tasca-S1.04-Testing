package ex2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculoDniTest {

	

	
	
	
	
	@Test
	public void testCalculaLletra() {
		
		System.out.println(testCalculaLletra(96587458));
//		System.out.println(testCalculaLletra(12345678));
//		System.out.println(testCalculaLletra(87654321));
//		System.out.println(testCalculaLletra(14725836));
//		System.out.println(testCalculaLletra(36925814));
//		System.out.println(testCalculaLletra(74815926));
//		System.out.println(testCalculaLletra(32615948));
//		System.out.println(testCalculaLletra(98751486));
//		System.out.println(testCalculaLletra(75122685));

		int num = 96587458;
		CalculoDni.calculaLletra(num);

		int modul = 96587458 % 23;

		String lletra = "";
		String dni;

		int modul = num % 23;
		char lletra = ' ';
		String dni;

		if (modul == 0) {
			lletra = 'T';
		} else if (modul == 1) {
			lletra = 'R';
		} else if (modul == 2) {
			lletra = 'W';
		} else if (modul == 3) {
			lletra = 'A';
		} else if (modul == 4) {
			lletra = 'G';
		} else if (modul == 5) {
			lletra = 'M';
		} else if (modul == 6) {
			lletra = 'Y';
		} else if (modul == 7) {
			lletra = 'F';
		} else if (modul == 8) {
			lletra = 'P';
		} else if (modul == 9) {
			lletra = 'D';
		} else if (modul == 10) {
			lletra = 'X';
		} else if (modul == 11) {
			lletra = 'B';
		} else if (modul == 12) {
			lletra = 'N';
		} else if (modul == 13) {
			lletra = 'J';
		} else if (modul == 14) {
			lletra = 'Z';
		} else if (modul == 15) {
			lletra = 'S';
		} else if (modul == 16) {
			lletra = 'Q';
		} else if (modul == 17) {
			lletra = 'V';
		} else if (modul == 18) {
			lletra = 'H';
		} else if (modul == 19) {
			lletra = 'L';
		} else if (modul == 20) {
			lletra = 'C';
		} else if (modul == 21) {
			lletra = 'K';
		} else if (modul == 22) {
			lletra = 'E';
		}
		
		
	}

}
