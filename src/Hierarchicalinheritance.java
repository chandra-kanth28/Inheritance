class A{
	void print_A() {
		System.out.println("class A");
	}
}
class B extends A{
	void print_B() {
		System.out.println("class B");
	}
}
class C extends A{
	void print_C() {
		System.out.println("class C");
	}
}
class D extends A{
	void print_D() {
		System.out.println("class D");
	}
}
public class Hierarchicalinheritance {

	public static void main(String[] args) {
		B b = new B ();
		b.print_A();
		b.print_B();
		C c = new C ();
		c.print_A();
		c.print_C();
		D d = new D ();
		d.print_A();
		d.print_D();

	}

}
