package pratica;

import java.util.Scanner;

public class Main {
      
	public static void main(String[] args) {
	Cachorro cachorro = new Cachorro();
	cachorro.setNome("snopp");
	cachorro.setIdade(4);
	cachorro.setRaça("Husky");

	Gato gato = new Gato();
	gato.setNome("cenoura");
	gato.setRaça("laranja");
	
	Vaca vaca= new Vaca();
	vaca.setNome("mimosa");
	
	Pardal pardal = new Pardal();
	pardal.setNome("zezinho");
	
	
	String sel= null;
	
    System.out.println("Qual o seu animal?\n");
    Scanner tec= new Scanner(System.in);
    System.out.println(" vaca"
 		   +"\n Pardal"
 		   +"\n cachorro"
 		   +"\n gato");
    sel=tec.nextLine();
    switch(sel) {
    case "cachorro":
 	
    	String sela=null;
    	System.out.println("o que deseja fazer?\n");
    	Scanner var = new Scanner(System.in);
    	System.out.println("Falar com "+cachorro.nome+"\n brincar"+"\n tosar"+"\npassear"+"\nobter informações");
    	sela=var.nextLine();
    	switch(sela) {
    	case "falar":
    		
    		cachorro.fazerSons();
    		break;
    	
    case "brincar":
    	cachorro.Brincar();
    	break;
    	
    case "tosar":
    	cachorro.cortarPelos();
    	break;
    case "passear":
    	cachorro.levarPassear();
    	break;
    case "obter informações":
    	cachorro.obterInfo();
    	break;
    	}
 	   
 	 break;
 	    
    
 	   
 	   
    case "gato":
    	String cat=null;
    	System.out.println("o que deseja fazer?\n");
    	Scanner war = new Scanner(System.in);
    	System.out.println("Falar com "+gato.nome+"\nbrincar"+"\ntosar"+"\nobter informações");
    	sela=war.nextLine();
    	switch(sela) {
    	case "falar":
    		gato.fazerSons();
    		break;
    	
    case "brincar":
    	gato.Brincar();
    	break;
    	
    case "tosar":
    	gato.cortarPelos();
    	break;
    case "passear":
    	gato.levarPassear();
    	break;
    case "obter informações":
    	gato.obterInfo();
    	break;
    	}
    	break;
    case "vaca":
    	String vac=null;
    	System.out.println("o que deseja fazer?\n");
    	Scanner bor = new Scanner(System.in);
    	System.out.println("Falar com "+vaca.nome+ "\nalimentar" +"\ntosar" +"\npastar");
    	sela=bor.nextLine();
    	switch(sela) {
    	case "falar":
    		vaca.fazerSons();
    		break;
    	
    case "Alimentar":
    	vaca.alimentar();
    	break;
    	
    case "tosar":
    	vaca.cortarPelos();
    	break;
    case "pastar":
    	vaca.pastar();
    	break;
    
    	}
    	break;
    case "pardal":
    	String pat=null;
    	System.out.println("o que deseja fazer?\n");
    	Scanner par = new Scanner(System.in);
    	System.out.println("Falar com "+pardal.nome+"\nbrincar"+"\nobter informações"+"\ndeixar voar");
    	sela=par.nextLine();
    	switch(sela) {
    	case "falar":
    		pardal.fazerSons();
    		break;
    	
    case "brincar":
    pardal.Brincar();
    	break;
    	
    case "deixar voar":
    	pardal.voar();
    	break;
    	
    	
    
    case "obter informações":
    	gato.obterInfo();
    	break;
    	}
    	
    	
    }} }
	
 