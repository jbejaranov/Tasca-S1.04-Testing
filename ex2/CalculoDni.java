package ex2;

import java.util.ArrayList;

public class CalculoDni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<Integer> llistaNum = new ArrayList<Integer>(); // llista amb num

//		llistaNum.add(96587458);
//		llistaNum.add(12345678);
//		llistaNum.add(87654321);
//		llistaNum.add(14725836);
//		llistaNum.add(36925814);
//		llistaNum.add(74815926);
//		llistaNum.add(32615948);
//		llistaNum.add(98751486);
//		llistaNum.add(75122685);
//
//		System.out.println(buscaLletra(llistaNum));
	}

	public static ArrayList<String> buscaLletra(ArrayList<Integer> llistaNum) {

		ArrayList<String> llistaDNIs = new ArrayList<String>(); // llista amb num+lletra

		int modul;
		char lletra = ' ';
		String dni;

		for (int i = 0; i < llistaNum.size(); i++) {

			modul = llistaNum.get(i) % 23;

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

			dni = "" + llistaNum.get(i) + lletra;
			llistaDNIs.add(dni);

		}

		return llistaDNIs;
	}

}
