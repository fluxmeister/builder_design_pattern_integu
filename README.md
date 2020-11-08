<h1>Builder design pattern as seen on <a href="https://integu.net/builder-pattern/" target="_blank">integu's site</a></h1>

For this tutorial we will set the objective of making a burger restaurant, which can make different variations of burgers.

The only thing we know is that all burgers share the same structure and contain the same five basic elements in some form. The five elements being: bun, meat, salad, cheese and sauce.

However, each of the elements should be seen as a complex process (e.g. making the secret sauce) and it would therefore be desirable to have these processes hidden away when making different variations of burgers.

Secondly it would also be preferable to have defined instructions for how to build each of the different variations of burgers (e.g. cheeseburger), so that we do not have to provide all the ingredients each time when we are making a burger.

Before we investigate how the builder design pattern will be able to solve these issues, we will start by seeing how this system could be build based on construction of the burger object in the main context.

<img src="https://integu.net/wp-content/uploads/2020/11/INTEGU-builder-objective-768x432.png">

The basic problem that we want to solve is to have a way of making burger objects with the possibility of making different variations in each of the five elements which all burgers consist of.

The simplest way of achieving this is to create a POJO (Plain Old Java Object – Link), which represent the basic functions and fields of a burger object.

This solves the basic objective of being able to create any variation of burgers on the menu card (e.g. cheeseburger), but it does not hide the processes away or define instructions for how to repeatably build the same burger object simply.

Constructing the burger object in the main context, as seen below, is neither the builder pattern, nor clean code.

Let’s try and see how the builder pattern can solve the same objective, and at the same time handle the additional objectives.

<img src="https://integu.net/wp-content/uploads/2019/04/builder-disadvantages-768x432.png">


<pre><code>public class Main {</br>
    public static void main(String[] args) {</br>
        Burger cheeseBurger = new Burger();</br>
        cheeseBurger.setBun("White Bread");</br>
        cheeseBurger.setMeat("Beef");</br>
        cheeseBurger.setSalad("Iceberg");</br>
        cheeseBurger.setCheese("American Chesse");</br>
        cheeseBurger.setSauce("Secret Sauce");</br>
        cheeseBurger.print();</br>
    }</code></pre>




When talking about the builder design pattern, it is important to understand the concept of the Director and the Builder.

The director’s job is to invoke the building process of the builder. The builder’s job is to manage the different building procedures associated with each of the different variations of objects, in this case the burgers.

The builder pattern consists of two classes, a sub- and super class.
</br>
</br>
<b>The super class is an abstract class which only declares the concrete methods and fields which all sub class have in common</b>.</br>
 In this case, that would be the print method and the burger object fields. Additionally, the super class also states the expected process methods that any builder sub class should implement.
</br>
</br>
<i>The sub class, then implements the declared process methods, and uses the super classes’ burger object field to set the five different elements to what is expected from that specific sub class builder.</i>
</br>
Continuing this pattern makes it possible to create multiple different builder classes, which all know exactly how to build their specific variation of burger, meanwhile still following the common rules of the builder super class.
</br></br>
<i><b>By invoking the builder through the director, it is thereby possible to swap between builder instances, which is what makes the builder pattern both flexible and practical.</b></i>
</br></br>
Utilizing the builder design pattern solves the main objective as well as hide the process method and clearly defines how each of the burger builders should work.
That all sounds great! So, let’s dive into the class diagram and code to see how we actually implement the builder pattern.

<img src="https://integu.net/wp-content/uploads/2020/11/INTEGU-builder-advantages-768x432.png">

As we learn from the previous section, the builder pattern consists of two main class types: the builder and the director. Seen from the context of the program which will be using the builder pattern, we actually only want to be interacting with the director.

The director will ensure that we build the correct burger object based on which builder we provide it with. This is because inside the director, we set its builder object field (setBuilder-method) and afterwards ask it to build the object based on the provided builder (build-method).

As previously explained, the different builder classes all have different variations in terms of the five elements which a burger consists of. But when it comes to everything else, they are all alike since they extend the same super class.

<img src="https://integu.net/wp-content/uploads/2020/11/INTEGU-builder-class-diagram-768x432.png">



