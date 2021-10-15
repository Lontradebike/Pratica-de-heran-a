package pratica;

public class Vaca extends Mamifero implements AnimalDaFazenda {

	
	@Override
	public void fazerSons() {
		
		System.out.println("muuuuu");
		
	}

	@Override
	public void alimentar() {
	System.out.println("*Você alimentou o animal");
	
		
	}

	@Override
	public void pastar() {
		// TODO Auto-generated method stub
			System.out.println("*Você colocou o animal pra pastar ");
	}

	@Override
	public void cortarPelos() {
		System.out.println("*Você aparou os pelos do animal");
		
	}

}
