package patos;
import comportamentosDuck.FlyBehavior;
import comportamentosDuck.FlyWithWings;
import comportamentosDuck.Quack;
import comportamentosDuck.QuickBehavior;


public class MallardDuck extends Duck{
		
	
	
	public MallardDuck(){
		
		quickBehavior = new Quack ();
		flyBehavior = new FlyWithWings();
		
	}

	
	public void display(){
		System.out.println("" +
				"EU SOU UM MALLARD DUCK");
	}
	
}
