package example;

public class InheritExample {

	public static void main(String[] args) {
	    
	    ChildClass child  = new ChildClass();

        child.print();
        child.display();
    }
	
}	
	abstract class ParentClass
    {
        public ParentClass()
        {
            System.out.println("Parent Constructor.");
        }

        public void print()
        {
            System.out.println("I'm a Parent Class.");
        }
        abstract void display();
    }

    class ChildClass extends ParentClass {
        public ChildClass()
        {
            System.out.println("Child Constructor.");
        }
        
       void display(){
    	   System.out.println("Abstract Class");
       }
    }


