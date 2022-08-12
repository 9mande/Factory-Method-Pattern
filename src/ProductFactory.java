/* Product Factory class
 * Overrides createProduct(model) method which returns new instances.
 * Uses only one factory instance, no more needed.
 *  -> related to singleton pattern
 */

public class ProductFactory extends Factory {
	private static Factory factory = new ProductFactory();
	
	ProductFactory() { }
	
	public static Factory getInstance() {
		return factory;
	}
	
	@Override
    public Product createProduct(String model) {
        if (model == "Samsung") {
            return new SamsungProduct();
        } else {
            return new AppleProduct();
        }
    }
}
