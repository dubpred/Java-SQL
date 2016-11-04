package Model;

public class Product {
	
	private int ProductId;
	private String ProductDesc;
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductDesc() {
		return ProductDesc;
	}
	public void setProductDesc(String productDesc) {
		ProductDesc = productDesc;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [ProductId=");
		builder.append(ProductId);
		builder.append(", ProductDesc=");
		builder.append(ProductDesc);
		builder.append("]");
		return builder.toString();
	}
	

}
