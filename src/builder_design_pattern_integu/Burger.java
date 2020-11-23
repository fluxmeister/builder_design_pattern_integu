/**
 * Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.

 * There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.

 * Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time, the type of arguments are same and from client side its hard to maintain the order of the argument.
 * Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional parameters need to send as NULL.
 * If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.
 * We can solve the issues with large number of parameters by providing a constructor with required parameters and then different setter methods to set the optional parameters. The problem with this approach is that the Object state will be inconsistent until unless all the attributes are set explicitly.
	
 * Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final Object.
 * 
 */
package builder_design_pattern_integu;

/**
 * Object Class *
 *
 */
public class Burger {
	
	// class arguments
	private String bun = "No Bun";
	private String meat = "No Meat";
	private String salad = "No Salad";
	private String cheese = "No Cheese";
	private String sauce = "No Sauce";

	
	private Burger(String bun, String meat, String salad, String cheese, String sauce) {
		this.bun = bun;
		this.meat = meat;
		this.salad = salad;
		this.cheese = cheese;
		this.sauce = sauce;
	}

	public String getBun() {
		return bun;
	}

	public String getMeat() {
		return meat;
	}

	public String getSalad() {
		return salad;
	}

	public String getCheese() {
		return cheese;
	}

	public String getSauce() {
		return sauce;
	}

	public void print() {
		System.out.println("Burger is finished! " + "\n - Bun: " + bun + "\n - Meat: " + meat + "\n - Cheese: " + cheese
				+ "\n - Salad: " + salad + "\n - Sauce: " + sauce);
	}
	
	/*
	 * Static nested class. - Builder super class *
	 * Copy all the arguments from the outer class to the Builder class.
	 * 
	 * The builder’s job is to manage the different building procedures 
	 * associated with each of the different variations of objects.
	 * 
	 * The builder pattern consists of two classes, a sub- and super class.
	 * The different builder class all have different variations of the elements which an object consists of.
	 * But when it comes to everything else, they are all alike since they extend the same super class.
	 */
	public static abstract class BurgerBuilder {
		// Java Builder class should have a public constructor with all the required attributes as parameters.
		/* Java Builder class should have methods to set the optional parameters and it should 
		return the same Builder object after setting the optional attribute. */
		private String bun = "No Bun";
		private String meat = "No Meat";
		private String salad = "No Salad";
		private String cheese = "No Cheese";
		private String sauce = "No Sauce";
		
		public BurgerBuilder(String bun, String meat, String salad, String cheese, String sauce) {
			this.bun = bun;
			this.meat = meat;
			this.salad = salad;
			this.cheese = cheese;
			this.sauce = sauce;
		}
		
		Burger burger = new Burger();
		
			abstract void buildBun();
		
			abstract void buildMeat();
		
			abstract void buildSalad();
		
			abstract void buildCheese();
		
			abstract void buildSauce();
		
			Burger build() {
				return burger;
			};
		
		
		
		
	}
	
	
}
