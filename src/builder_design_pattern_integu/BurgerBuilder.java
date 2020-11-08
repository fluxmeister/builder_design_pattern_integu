/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package builder_design_pattern_integu;

/**
 * Builder
 *
 */
public abstract class BurgerBuilder {
	
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
