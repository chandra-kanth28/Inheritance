class parent{
	void eat()
{
	System.out.println("parents eats");
}
	void sleep() {
		System.out.println("parents sleeps early");
	}
	void run() {
		System.out.println("parents runs briskly");
	}
}
	class child extends parent{
		@Override
		void sleep() {
			System.out.println("child sleeps late");
		}
		void Swim() {
			System.out.println("child swims");
		}
	}
public class Inheritance {

	public static void main(String[] args) {
		child c = new child();
		c.eat();
		c.sleep();
		c.run();
		c.Swim();

	}

}
