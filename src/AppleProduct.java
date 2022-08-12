/* Class of the object the factory will create
 * Implements Product (DIP)
 */

public class AppleProduct implements Product {
	public void name() {
		System.out.println("Apple product");
	}
}
