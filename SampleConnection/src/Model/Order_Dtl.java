package Model;

public class Order_Dtl {
	
	private int OrderDtlId;
	private int OrderNo;
	private int ProductId;
	private long SalesCost;
	public int getOrderDtlId() {
		return OrderDtlId;
	}
	public void setOrderDtlId(int orderDtlId) {
		OrderDtlId = orderDtlId;
	}
	public int getOrderNo() {
		return OrderNo;
	}
	public void setOrderNo(int orderNo) {
		OrderNo = orderNo;
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public long getSalesCost() {
		return SalesCost;
	}
	public void setSalesCost(long salesCost) {
		SalesCost = salesCost;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order_Dtl [OrderDtlId=");
		builder.append(OrderDtlId);
		builder.append(", OrderNo=");
		builder.append(OrderNo);
		builder.append(", ProductId=");
		builder.append(ProductId);
		builder.append(", SalesCost=");
		builder.append(SalesCost);
		builder.append("]");
		return builder.toString();
	}
	

}
