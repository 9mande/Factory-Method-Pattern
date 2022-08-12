/* Abstracted Factory class
 * Defines skeleton of Factory Method hoping subclasses to implement specific processes.
 * which is similar with Template Method
 * but Factory Method is a creational pattern, while Template Method is behavioral pattern.
 * 
 * All kind of factories will have and use create(model) method.
 * Factories will implement its own createProduct(model) method.
 */

abstract class Factory {
	public Product create(String model) {
        return this.createProduct(model);
    }

    abstract public Product createProduct(String model);
}
