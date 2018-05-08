package test;
public class A extends B{
	  public void B(){
	    System.out.println("A");
	  }
	  public void B2(){
	    System.out.println("son");
	  }
	  public static void main(String[] args) {
		B b = new A();
		b.B();
		b.B2();
	  }
	}