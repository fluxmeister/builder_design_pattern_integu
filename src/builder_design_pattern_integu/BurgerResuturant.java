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
public class BurgerResuturant {

	private BurgerBuilder burgerBuilder;

	public void setBuilder(BurgerBuilder burgerBuilder) {
		this.burgerBuilder = burgerBuilder;
	}

	public Burger buildBurger() {
		burgerBuilder.buildBun();
		burgerBuilder.buildMeat();
		burgerBuilder.buildSalad();
		burgerBuilder.buildCheese();
		burgerBuilder.buildSauce();
		return burgerBuilder.build();
	}
}
