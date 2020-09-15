package Module04;

abstract class AnonymousInnerClass {
	   public abstract void display();
	}


public class AnonymousInnerClassDemo {

	public static void main(String[] args) {
		AnonymousInnerClass i = new AnonymousInnerClass() {
			
	         public void display() {
	            System.out.println("Anonymous Class");
	         }
	      };
	      i.display();	
	   }
	}
