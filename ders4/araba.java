package javadersleri.ders4;

public class araba {
	
	
	private String renk;
	private int kap�lar;
	private int tekerlekler;
	private String motor;
	private String model;
	
	
	public void setModel(String model ) {
	
	
	
	this.model = model;
	

	}
	public String getModel() {
		return this.model;

	}
	
	
	public void Setkap�lar( int kap�lar) {
		
		if (kap�lar < 0 ) {
			System.out.println("Kap� say�s� 0'dan k���k olamaz ");
		}
		else 
			this.kap�lar = kap�lar;
	}
	
}
	

