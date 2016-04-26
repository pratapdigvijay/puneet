package day2.problem;


 class Drink {
	int waterContent;

//	public Drink(){}
	public Drink(int waterContent) {
		super();
		this.waterContent = waterContent;
	}
	
}

public class Coffee extends Drink{
	
	String flavor;
	String sugar;
	
	public Coffee(int waterContent, String flavor){
		super(waterContent);
		this.flavor = flavor;
	}
	
	
	public Coffee(int waterContent, String flavor, String sugar) {
		this(waterContent,flavor);
		this.sugar = sugar;
	}
	
	public String toString(){
		return this.flavor + "coffee in " + this.sugar + " sugar";
	}
	
	public static void main(String[] args) {
		int a = 2 + 3;
		
		
		Coffee coffee = new Coffee("Mocha", "Mild");
		System.out.println(coffee);
		System.out.println(a);
	}
	
	

}
