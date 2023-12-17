package hcmute.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class OrderData {
	 private String address;
	    private String phoneNumber;
	    private String note;
	    private int totalPrice;
	    private int totalProduct;
	    private int finalPrice;
	    private String orderDay;
	    private String shipDay;
	    private String idPayMethod;
	    private List<OrderItem> list;
	    private int orderState;
	    private int idBranch;
	    private int fee;

        public OrderData() {
			super();
		}



		public OrderData(String address, String phoneNumber, String note, int totalPrice, int totalProduct,
				int finalPrice, String orderDay, String shipDay, String idPayMethod, List<OrderItem> list,
				int orderState, int idBranch, int fee) {
			super();
			this.address = address;
			this.phoneNumber = phoneNumber;
			this.note = note;
			this.totalPrice = totalPrice;
			this.totalProduct = totalProduct;
			this.finalPrice = finalPrice;
			this.orderDay = orderDay;
			this.shipDay = shipDay;
			this.idPayMethod = idPayMethod;
			this.list = list;
			this.orderState = orderState;
			this.idBranch = idBranch;
			this.fee = fee;
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



		public String getNote() {
			return note;
		}



		public void setNote(String note) {
			this.note = note;
		}



		public int getTotalPrice() {
			return totalPrice;
		}



		public void setTotalPrice(int totalPrice) {
			this.totalPrice = totalPrice;
		}



		public int getTotalProduct() {
			return totalProduct;
		}



		public void setTotalProduct(int totalProduct) {
			this.totalProduct = totalProduct;
		}



		public int getFinalPrice() {
			return finalPrice;
		}



		public void setFinalPrice(int finalPrice) {
			this.finalPrice = finalPrice;
		}



		public String getOrderDay() {
			return orderDay;
		}



		public void setOrderDay(String orderDay) {
			this.orderDay = orderDay;
		}



		public String getShipDay() {
			return shipDay;
		}



		public void setShipDay(String shipDay) {
			this.shipDay = shipDay;
		}



		public String getIdPayMethod() {
			return idPayMethod;
		}



		public void setIdPayMethod(String idPayMethod) {
			this.idPayMethod = idPayMethod;
		}



		public List<OrderItem> getList() {
			return list;
		}



		public void setList(List<OrderItem> list) {
			this.list = list;
		}



		public int getOrderState() {
			return orderState;
		}



		public void setOrderState(int orderState) {
			this.orderState = orderState;
		}



		public int getIdBranch() {
			return idBranch;
		}



		public void setIdBranch(int idBranch) {
			this.idBranch = idBranch;
		}



		public int getFee() {
			return fee;
		}



		public void setFee(int fee) {
			this.fee = fee;
		}

        
	    public static class OrderItem {
	        private int idMilkTea;
	        private String size;
	        private int quantity;
	        private int price;

            public OrderItem(int idMilkTea, String size, int quantity, int price) {
				super();
				this.idMilkTea = idMilkTea;
				this.size = size;
				this.quantity = quantity;
				this.price = price;
			}
			public OrderItem() {
				super();
			}
			public int getIdMilkTea() {
				return idMilkTea;
			}
			public void setIdMilkTea(int idMilkTea) {
				this.idMilkTea = idMilkTea;
			}
			public String getSize() {
				return size;
			}
			public void setSize(String size) {
				this.size = size;
			}
			public int getQuantity() {
				return quantity;
			}
			public void setQuantity(int quantity) {
				this.quantity = quantity;
			}
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
	    }
}
