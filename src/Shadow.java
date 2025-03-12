class Animal{
	private String Name;
	private String size;
	private String color;
	private int age;
	Animal(String name,String size,String color,int age){
		Name = Name;
		size = size;
		color = color;
		age = age;
	}
	public String getName() {
		return Name;
	}
	public String getsize() {
		return size;
	}
	public String getcolor() {
		return color; 
	}
	public int getage() {
		return age;
	}
}
public class Shadow {

	public static void main(String[] args) {
		Animal a= new Animal("tiger","big","orange",15);
		System.out.println(a.getName());
		System.out.println(a.getsize());
		System.out.println(a.getcolor());
		System.out.println(a.getage());
	}

}
