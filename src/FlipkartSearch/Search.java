package FlipkartSearch;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Search {

	@BeforeMethod
	public void productPresent()
	{
		System.out.println("Product is present in Warehouse");
	}
	@Test(groups = {"Sanity"})
	public void ProductSearch()
	{
		System.out.println("Product Successfully Searched");
	}
	@Test(groups ={"Sanity"},dependsOnMethods={"ProductSearch"})
	public void ProductClicked()
	{
		System.out.println("Product Successfully Seleccted");
	}
}
