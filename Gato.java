package pratica;

public class Gato extends Mamifero implements AnimalDomestico {
	
	private String raça;

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}


	
	

	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Brincar() {
		System.out.println("*você brinca com  "+nome);
		
	}

	@Override
	public void cortarPelos() {
		System.out.println( "seu gato " +nome+ " foi tosado");
		
	}

	@Override
	public void obterInfo() {
		System.out.println("Nome:"+nome+"\nRaça:"+raça);
		
	}

	@Override
	public void fazerSons() {
		System.out.println("meow");
		
	}

}
