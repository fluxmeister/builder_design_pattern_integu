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
public class VeganBurgerBuilder extends BurgerBuilder {

	@Override
	void buildBun() {
		burger.setBun("Vegan bread");

	}

	@Override
	void buildMeat() {
		burger.setMeat("Soya meat");

	}

	@Override
	void buildSalad() {
		burger.setSalad("Green salad");

	}

	@Override
	void buildCheese() {
		burger.setCheese("Soya cheese");

	}

	@Override
	void buildSauce() {
		burger.setSauce("Veg sauce");

	}

}
