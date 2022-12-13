import java.io.*;
class Product implements Serializable
{
	String productName;
	int productId;
	double productCost;
	char productType;	
	int count = 1;
	public Product(){}
	public Product(String productName,double productCost,char productType)
	{
		this.productName = productName;
		this.productId = count++;
		this.productCost = productCost;
		this.productType = productType;
	}
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	public String getProductName()
	{
		return productName;	
	}
	public void setProductId(int productId)
	{
		this.productId = productId;	
	}
	public int getProductId()
	{
		return productId;	
	}
	public void setProductCost(double productCost)
	{
		this.productCost = productCost;
	}
	public double getProductCost()
	{
		return productCost;
	}
	public void setProductType(char productType)
	{
		this.productType = productType;
	}
	public char getProductType()
	{
		return productType;
	}
}
