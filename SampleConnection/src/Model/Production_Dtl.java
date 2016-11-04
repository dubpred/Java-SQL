package Model;

public class Production_Dtl {
	
	private int ProdDtlId;
	private int ProductionId;
	private int Product;
	
	
	
	public int getProdDtlId() {
		return ProdDtlId;
	}
	public void setProdDtlId(int prodDtlId) {
		ProdDtlId = prodDtlId;
	}
	public int getProductionId() {
		return ProductionId;
	}
	public void setProductionId(int productionId) {
		ProductionId = productionId;
	}
	public int getProduct() {
		return Product;
	}
	public void setProduct(int product) {
		Product = product;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Production_Dtl [ProdDtlId=");
		builder.append(ProdDtlId);
		builder.append(", ProductionId=");
		builder.append(ProductionId);
		builder.append(", Product=");
		builder.append(Product);
		builder.append("]");
		return builder.toString();
	}
	

}
