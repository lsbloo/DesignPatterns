package patos;
import comportamentosDuck.FlyBehavior;
import comportamentosDuck.QuickBehavior;



public abstract class Duck {
	
	FlyBehavior flyBehavior;
	
	/*
	 * Cada duck tem uma referencia a algo que implementa
	 * a interface QuickBehavior
	 */
	
	 QuickBehavior quickBehavior;
	
	
	public Duck(){
	}
	
	public void performQuack(){
		/*
		 * Em vez de listar com o comportamento
		 * de grasnar em si, o objecto Duck
		 * delega esse comportanto ao objeto
		 * relacionado por quackBehavior
		 * 
		 * nao importa o tipo de objeto, o que importa
		 * é se ele sabe grasnar(quack());
		 */
		quickBehavior.quack();
	}
	public void performFly(){
		
		flyBehavior.fly();
		
	}
	
	
	public void quack(){
		
	}
	
	public void swim(){
		
	}
	public void display(){
		
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		this.flyBehavior=fb;
	}
	public void setQuackBehavior(QuickBehavior quack){
		this.quickBehavior=quack;
	}

}
