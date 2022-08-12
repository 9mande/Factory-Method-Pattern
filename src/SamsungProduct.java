/* Class of the object the factory will create
 * Implements Product (DIP)
 */

public class SamsungProduct implements Product {
	public void name() {
		System.out.println("Samsung product");
	}
}
