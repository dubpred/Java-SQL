package Model;

import java.sql.Date;
import java.sql.Timestamp;


public class Order_Hdr {

	private int OrderNo;
	private int UserId;
	private Timestamp OrderDateTime;
	private Date DeliveryDate;
	private String DeliveredBy;
	private int OrderQty;
	public int getOrderNo() {
		return OrderNo;
	}
	public void setOrderNo(int orderNo) {
		OrderNo = orderNo;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public Timestamp getOrderDateTime() {
		return OrderDateTime;
	}
	public void setOrderDateTime(Timestamp orderDateTime) {
		OrderDateTime = orderDateTime;
	}
	public Date getDeliveryDate() {
		return DeliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		DeliveryDate = deliveryDate;
	}
	public String getDeliveredBy() {
		return DeliveredBy;
	}
	public void setDeliveredBy(String deliveredBy) {
		DeliveredBy = deliveredBy;
	}
	public int getOrderQty() {
		return OrderQty;
	}
	public void setOrderQty(int orderQty) {
		OrderQty = orderQty;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order_Hdr [OrderNo=");
		builder.append(OrderNo);
		builder.append(", UserId=");
		builder.append(UserId);
		builder.append(", OrderDateTime=");
		builder.append(OrderDateTime);
		builder.append(", DeliveryDate=");
		builder.append(DeliveryDate);
		builder.append(", DeliveredBy=");
		builder.append(DeliveredBy);
		builder.append(", OrderQty=");
		builder.append(OrderQty);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
