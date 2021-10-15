package pratica;

public class Cachorro extends Mamifero implements AnimalDomestico {

	private int idade;
	private String ra�a;

	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}

	
		
		
	

	@Override
	public void fazerSons() {
		System.out.println("woof woof");
		
		
	}

	@Override
	public void levarPassear() {
		System.out.println("*voc� passeou com o "+nome);
	}

	@Override
	public void Brincar() {
		System.out.println("*voc� brinca com o "+nome);
		
	}

	@Override
	public void cortarPelos() {
		System.out.println( "seu cachorro " +nome+ " foi tosado");
		
	}

	@Override
	public void obterInfo() {
		System.out.println("Nome:"+nome+"\nidade:"+idade+"\nRa�a:"+ra�a);
		
	}

}
