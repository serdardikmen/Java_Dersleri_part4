package javadersleri.ders4;

public class arabatest {
	
	public static void main (String [] args) {
		
		araba araba1 = new araba();
	
		araba1.setModel("Mercedes;");
				
				System.out.println("Araban�n Modeli "  + araba1.getModel());
				
		araba1.Setkap�lar(-4);
	}

}
