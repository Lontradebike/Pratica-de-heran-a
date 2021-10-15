package pratica;

public class Cachorro extends Mamifero implements AnimalDomestico {

	private int idade;
	private String raça;

	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	
		
		
	

	@Override
	public void fazerSons() {
		System.out.println("woof woof");
		
		
	}

	@Override
	public void levarPassear() {
		System.out.println("*você passeou com o "+nome);
	}

	@Override
	public void Brincar() {
		System.out.println("*você brinca com o "+nome);
		
	}

	@Override
	public void cortarPelos() {
		System.out.println( "seu cachorro " +nome+ " foi tosado");
		
	}

	@Override
	public void obterInfo() {
		System.out.println("Nome:"+nome+"\nidade:"+idade+"\nRaça:"+raça);
		
	}

}
