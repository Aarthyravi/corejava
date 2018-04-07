package example;

public class InterfaceEx {

	public static void main(String[] args) {
		B b = new B();
		b.display();
	    System.out.println("Interface data : "+A.data);
	}
}

interface A {
	int data = 12; //public const static int data = 12(fixed data) 
    void display();  // public abstract void display(); 
}

class B implements A {

	@Override
	public void display() {
		System.out.println("Inside child class");
	}
	
}
