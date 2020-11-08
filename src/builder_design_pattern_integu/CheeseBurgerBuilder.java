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
public class CheeseBurgerBuilder extends BurgerBuilder {

	@Override
	public void buildBun() {
		burger.setBun("White Bread");
	}

	@Override
	public void buildMeat() {
		burger.setMeat("Beef");
	}

	@Override
	public void buildSalad() {
		burger.setSalad("Iceberg");
	}

	@Override
	public void buildCheese() {
		burger.setCheese("American Cheese");
	}

	@Override
	public void buildSauce() {
		burger.setSauce("Secret Sauce");
	}

}
