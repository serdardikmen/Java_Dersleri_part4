package javadersleri.ders4;

public class araba {
	
	
	private String renk;
	private int kapýlar;
	private int tekerlekler;
	private String motor;
	private String model;
	
	
	public void setModel(String model ) {
	
	
	
	this.model = model;
	

	}
	public String getModel() {
		return this.model;

	}
	
	
	public void Setkapýlar( int kapýlar) {
		
		if (kapýlar < 0 ) {
			System.out.println("Kapý sayýsý 0'dan küçük olamaz ");
		}
		else 
			this.kapýlar = kapýlar;
	}
	
}
	

