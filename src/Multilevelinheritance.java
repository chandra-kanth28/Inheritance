class one{
	public void print_one() {
		System.out.println("one");
	}
}
class two extends one{
	public void print_two() {
		System.out.println("two");
	}
}
class three extends two{
	public void print_three() {
		System.out.println("three");
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		three t = new three();
		t.print_one();
		t.print_two();
		t.print_three();

	}

}
