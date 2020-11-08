/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package builder_design_pattern_integu;

/**
 * @author fluxmeister
 *
 */
public class Main {

	public static void main(String[] args) {
		BurgerResuturant burgerResuturant = new BurgerResuturant();
		burgerResuturant.setBuilder(new CheeseBurgerBuilder());
		buildBurger(burgerResuturant);
		burgerResuturant.setBuilder(new VeganBurgerBuilder());
		buildBurger(burgerResuturant);
	}

	private static void buildBurger(BurgerResuturant burgerResuturant) {
		Burger burger = burgerResuturant.buildBurger();
		burger.print();
	}

}
