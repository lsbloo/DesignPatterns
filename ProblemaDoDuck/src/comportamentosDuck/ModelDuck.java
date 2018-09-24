package comportamentosDuck;

import patos.Duck;

public class ModelDuck extends Duck{
	
	public ModelDuck(){
		FlyNoWay flyBehavior = new FlyNoWay();
		Quack quackBehavior = new Quack();
	}
	
	public void display(){
		System.out.println("Modelo de DUck!");
	}

}
