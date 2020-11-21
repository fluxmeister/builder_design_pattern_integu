/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package builder_design_pattern_integu;

/**
 * Builder sub class *
 * The different builder class all have different variations of the elements which an object consists of.
 * But when it comes to everything else, they are all alike since they extend the same super class.
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
