package FlipkartPayment;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cart {

	@BeforeMethod
	public void cartFunctionality()
	{
		System.out.println("Product is being added in cart");
	}
	
	@Test(groups={"Sanity"})
	public void AddToCart()
	{
		System.out.println("User Added Item to Cart Successfully");
	}
	
	@Test
	public void UnableToAddToCart()
	{
		System.out.println("User is Unable to Add Product to Cart");
	}
}
