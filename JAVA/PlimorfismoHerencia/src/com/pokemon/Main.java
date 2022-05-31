package com.pokemon;

public class Main {

	public static void main(String[] args) {
		
		//instanciando
	//Pokemon chikorita = new Pokemon(152,1,20,"chikorita",false);
    //utilizando metodos de instancia
	
//	chikorita.comer();
//	chikorita.atacar();
//	chikorita.dormir();
	System.out.println("_______________________________________________________");
	
	//instanciando
	TipoPlanta chikorita2 = new TipoPlanta(152,1,20,"chikorita",false,1);
	//utilizando metodos de instancia 
	
	chikorita2.comer();
	chikorita2.atacar();
	chikorita2.dormir();	
	chikorita2.envenenar();
	chikorita2.paralizar();
	
	System.out.println("_______________________________________________________");
	
	//instanciar
	Chikorita chikorita3 = new Chikorita(152,1,20,"Chikorita2",false,1);
	
	chikorita3.comer();
	

	
	chikorita3.atacar();
	chikorita3.dormir();	
	chikorita3.envenenar();
	chikorita3.paralizar();
	chikorita3.latigazo();	
	
	System.out.println("_______________________________________________________");
	
	Charmander charmander = new Charmander(4,3,50,"Charmander",false);
	
	
charmander.comer();
	

	
	charmander.atacar();
	charmander.dormir();	
	charmander.lanzaLlamas();
	charmander.Volar();
		
	
	
	
	
	}

}
