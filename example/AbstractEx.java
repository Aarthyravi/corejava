package example;

public class AbstractEx {

	public static void main(String[] args) {
		Animal animal = null;
		animal = new Rottweiler();
		Dog dog = null;
		dog = new Rottweiler();
		animal.makeASound();
		dog.makeASound();

	}
}	 
	abstract class Animal{  
	    public abstract void makeASound();  
	    public abstract void command();  
	}  
	 
	abstract class Dog extends Animal{  
	    public void makeASound(){  
	        System.out.println("Auuuuuuuuu");  
	    }  
	}
	class Rottweiler extends Dog{  
	    public void makeASound(){
	    	System.out.println("Wolf");
	    }  
	    public void command(){}  
	}


