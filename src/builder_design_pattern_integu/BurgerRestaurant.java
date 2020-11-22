/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package builder_design_pattern_integu;

/**
 * Director class *
 * The director’s job is to invoke the building process of the builder.
 * The director will ensure that we build the correct object based on which builder we provide it with.
 * This is because inside the director, we set its builder object field (setBuilder-method) 
 * and afterwards ask it to build the object based on the provided builder (build-method).
 */
public class BurgerRestaurant {

	private BurgerBuilder burgerBuilder;

	/* inside the director, we set its builder object field (setBuilder-method) and afterwards ask it 
	 * to build the object based on the provided builder (build-method).
	 */
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
