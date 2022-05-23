package com.pokemon;

public class Main {

	public static void main(String[] args) {
		
		//instanciando
	Pokemon chikorita = new Pokemon(152,1,20,"chikorita",false);
	
	//utilizando metodos de instancia
	
	chikorita.comer();
	chikorita.atacar();
	chikorita.dormir();
	
	TipoPlanta chikorita2 = new TipoPlanta(152,1,20,"chikorita",false,1);
	
	chikorita2.comer();
	chikorita2.atacar();
	chikorita2.dormir();
	
	chikorita2.envenenar();
	chikorita2.paralizar();
	
	
	}

}
