class An{
	void ride() {
		System.out.println("A can ride his bike");
	}
	void stunt() {
		System.out.println("A can do stunts");
	}
}
	class Be extends An{
		@Override
		void ride() {
			System.out.println("B is not a rider");
		}
		void Stunt() {
			System.out.println("B can't do stunt");
		}
	}
public class Singleinheritance {

	public static void main(String[] args) {
		Be b = new Be();
		b.ride();
		b.Stunt();

	}

}
