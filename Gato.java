package pratica;

public class Gato extends Mamifero implements AnimalDomestico {
	
	private String ra�a;

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}


	
	

	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Brincar() {
		System.out.println("*voc� brinca com  "+nome);
		
	}

	@Override
	public void cortarPelos() {
		System.out.println( "seu gato " +nome+ " foi tosado");
		
	}

	@Override
	public void obterInfo() {
		System.out.println("Nome:"+nome+"\nRa�a:"+ra�a);
		
	}

	@Override
	public void fazerSons() {
		System.out.println("meow");
		
	}

}
