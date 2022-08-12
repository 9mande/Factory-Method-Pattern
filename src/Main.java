/* Practice using Factory Method Pattern
 * 
 * Features
 * 1. Dependency Inversion Principle : Factory Method defines abstracted super class, and implements at sub classes.
 * 2. 
 * 
 * Result
 * Instantiation occurs at subclasses.
 * 
 * Effect
 * Subclasses can define which class to instantiate.
 */

public class Main {

	public static void main(String[] args) {
		Factory factory = ProductFactory.getInstance();
        Product A = factory.create("Apple");
        A.name();

        Product B = factory.create("Samsung");
        B.name();
	}

}
