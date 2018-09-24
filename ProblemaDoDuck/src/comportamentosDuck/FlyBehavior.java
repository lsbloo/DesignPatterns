package comportamentosDuck;

public interface FlyBehavior {
	/*
	 * Essa interface tem como objetivo criar os 
	 * comportamentos de "voo" dos patos
	 * uma vez que existem patos que podem voar e patos 
	 * que nao podem voar exemplo patos de borracha
	 *  - As classes FlyNoWay e FlyWithWings
	 *  implementação essa interface
	 *  e criam comportamentos diferentes
	 *  	- FlyNoWay: comportamento de não voo!
	 *  	- FlyWithWings: comportamento de voo
	 *  
	 */
	
	
	public void fly();

}
