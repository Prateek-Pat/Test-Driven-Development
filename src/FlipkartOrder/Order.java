package FlipkartOrder;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Order {

	@BeforeMethod()
	public void orderSuccess()
	{
		System.out.println("Order are being booked successfully");
	}
	
	
	@Test(groups={"Sanity"})
	public void OrderNumber()
	{
		System.out.println("Valid Product Number is Assigned");
	}
	
	@Test(groups={"Sanity"},dependsOnMethods={"OrderNumber"})
	public void OrderDeliveryDate()
	{
		System.out.println("Valid Product Order Delivery Date is Assigned");
	}
}
