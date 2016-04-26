package day2.inhert;

class Animal {

	public void speak() {
		System.out.println("Animal Speak");
	}

}

class Tiger extends Animal {
	public void speak() {
		System.out.println("Tiger Speak");
	}
}
class Cow extends Animal {
	public void speak() {
		System.out.println("Cow Speak");
	}
}

public class Test {
	public static void main(String[] args) {
		
		Animal animal = new Cow();
		animal.speak();
		
		Tiger tiger = (Tiger)animal;
		tiger.speak();
		

	}
}
