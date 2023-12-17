package hcmute.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.*;

import hcmute.entity.BranchEntity;
import hcmute.entity.PayMethodEntity;
import hcmute.entity.UserEntity;
import lombok.*;

public class OrderModel{
	private int idOrder;
	private int totalProduct;
	private int totalPrice;
	private int finalPrice;
	private LocalDateTime orderDay;
	private int orderState;
	private LocalDateTime shipDay;
	private String note;
	private String address;
	private String phoneNumber;
	private int fee;
	private PayMethodEntity payMethodByOrder;
	private UserEntity customerByOrder;
	private BranchEntity branchByOrder;
	private Boolean isEdit;

    public int getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}
	public int getTotalProduct() {
		return totalProduct;
	}
	public void setTotalProduct(int totalProduct) {
		this.totalProduct = totalProduct;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(int finalPrice) {
		this.finalPrice = finalPrice;
	}
	public LocalDateTime getOrderDay() {
		return orderDay;
	}
	public void setOrderDay(LocalDateTime orderDay) {
		this.orderDay = orderDay;
	}
	public int getOrderState() {
		return orderState;
	}
	public void setOrderState(int orderState) {
		this.orderState = orderState;
	}
	public LocalDateTime getShipDay() {
		return shipDay;
	}
	public void setShipDay(LocalDateTime shipDay) {
		this.shipDay = shipDay;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public PayMethodEntity getPayMethodByOrder() {
		return payMethodByOrder;
	}
	public void setPayMethodByOrder(PayMethodEntity payMethodByOrder) {
		this.payMethodByOrder = payMethodByOrder;
	}
	public UserEntity getCustomerByOrder() {
		return customerByOrder;
	}
	public void setCustomerByOrder(UserEntity customerByOrder) {
		this.customerByOrder = customerByOrder;
	}
	public BranchEntity getBranchByOrder() {
		return branchByOrder;
	}
	public void setBranchByOrder(BranchEntity branchByOrder) {
		this.branchByOrder = branchByOrder;
	}
	public Boolean getIsEdit() {
		return isEdit;
	}
	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}
	public OrderModel(int idOrder, int totalProduct, int totalPrice, int finalPrice, LocalDateTime orderDay,
			int orderState, LocalDateTime shipDay, String note, String address, String phoneNumber, int fee,
			PayMethodEntity payMethodByOrder, UserEntity customerByOrder, BranchEntity branchByOrder, Boolean isEdit) {
		super();
		this.idOrder = idOrder;
		this.totalProduct = totalProduct;
		this.totalPrice = totalPrice;
		this.finalPrice = finalPrice;
		this.orderDay = orderDay;
		this.orderState = orderState;
		this.shipDay = shipDay;
		this.note = note;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.fee = fee;
		this.payMethodByOrder = payMethodByOrder;
		this.customerByOrder = customerByOrder;
		this.branchByOrder = branchByOrder;
		this.isEdit = isEdit;
	}
	public OrderModel() {
		super();
	}
	
}
