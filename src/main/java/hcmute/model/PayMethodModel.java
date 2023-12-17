package hcmute.model;


import lombok.*;

public class PayMethodModel{
	private String idPayMethod;
	private String name;
	private OrderModel orders;
	private Boolean isEdit = false;

    public PayMethodModel(String idPayMethod, String name, OrderModel orders, Boolean isEdit) {
		super();
		this.idPayMethod = idPayMethod;
		this.name = name;
		this.orders = orders;
		this.isEdit = isEdit;
	}
	public PayMethodModel() {
		super();
	}
	public String getIdPayMethod() {
		return idPayMethod;
	}
	public void setIdPayMethod(String idPayMethod) {
		this.idPayMethod = idPayMethod;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public OrderModel getOrders() {
		return orders;
	}
	public void setOrders(OrderModel orders) {
		this.orders = orders;
	}
	public Boolean getIsEdit() {
		return isEdit;
	}
	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}
}
