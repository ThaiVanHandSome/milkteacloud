package hcmute.embeddedId;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
public class CartDetailId implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "id_cart")
	private int idCart;
	
	@Column(name = "id_milk_tea")
	private int idMilkTea;
	
	@Column(name = "size", columnDefinition = "nvarchar(50)")
	private String size;

    public int getIdCart() {
		return idCart;
	}

	public void setIdCart(int idCart) {
		this.idCart = idCart;
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

	public CartDetailId(int idCart, int idMilkTea, String size) {
		super();
		this.idCart = idCart;
		this.idMilkTea = idMilkTea;
		this.size = size;
	}

	public CartDetailId() {
		super();
	}
	
}
