package pratica;

public class Pardal extends Ave implements AnimalDomestico, AnimalDaFazenda {

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("*Você alimentou o animal");
	}

	@Override
	public void pastar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Brincar() {
		// TODO Auto-generated method stub
		System.out.println("*Você brincou com "+nome);
	}

	@Override
	public void voar() {
		// TODO Auto-generated method stub
		System.out.println("O"+nome+"esta voando");
	}

	@Override
	public void fazerSons() {
		System.out.println("*canto de passaro");
		
	}

	@Override
	public void obterInfo() {
		System.out.println("Nome"+nome);
		
	}
	

}
