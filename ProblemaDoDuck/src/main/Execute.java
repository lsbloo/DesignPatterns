package main;

import patos.Duck;
import patos.MallardDuck;
public class Execute {
	
	
	public static void main(String[] args){
		
		Duck mallard = new MallardDuck();

		mallard.performFly();
		mallard.performQuack();
		mallard.display();
		
	}

}
