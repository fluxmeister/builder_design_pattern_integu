/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package builder_design_pattern_integu;

/**
 * Builder super class *
 * The builder’s job is to manage the different building procedures 
 * associated with each of the different variations of objects.
 * 
 * The builder pattern consists of two classes, a sub- and super class.
 * The different builder class all have different variations of the elements which an object consists of.
 * But when it comes to everything else, they are all alike since they extend the same super class.
 *
 */
//public abstract class BurgerBuilder {
//	
//	Burger burger = new Burger();
//
//	abstract void buildBun();
//
//	abstract void buildMeat();
//
//	abstract void buildSalad();
//
//	abstract void buildCheese();
//
//	abstract void buildSauce();
//
//	Burger build() {
//		return burger;
//	};
//}
