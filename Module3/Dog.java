package Assignment1;

class Animal
{
	void print()
	{
		System.out.println("Sound");
	}
}
public class Dog extends Animal
{
	void sound()
	{
		System.out.println("bark");
	}
	public static void main(String[] args)
	{
		Dog ob=new Dog();
		ob.print();
		ob.sound();
	}
}

