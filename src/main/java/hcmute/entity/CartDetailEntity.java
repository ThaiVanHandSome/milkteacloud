package hcmute.entity;

import java.io.Serializable;

import javax.persistence.*;

import hcmute.embeddedId.CartDetailId;
import lombok.*;
import java.util.Set;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "cart_detail")
public class CartDetailEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private CartDetailId idCartDetail;
	
	@ManyToOne
	@JoinColumn(name = "id_cart",insertable = false, updatable = false)
	private CartEntity cartByCartDetail;
	
	@ManyToOne
	@JoinColumn(name = "id_milk_tea",insertable = false, updatable = false)
	private MilkTeaEntity milkTeaByCartDetail;

    public CartDetailId getIdCartDetail() {
		return idCartDetail;
	}

	public void setIdCartDetail(CartDetailId idCartDetail) {
		this.idCartDetail = idCartDetail;
	}

	public CartEntity getCartByCartDetail() {
		return cartByCartDetail;
	}

	public void setCartByCartDetail(CartEntity cartByCartDetail) {
		this.cartByCartDetail = cartByCartDetail;
	}

	public MilkTeaEntity getMilkTeaByCartDetail() {
		return milkTeaByCartDetail;
	}

	public void setMilkTeaByCartDetail(MilkTeaEntity milkTeaByCartDetail) {
		this.milkTeaByCartDetail = milkTeaByCartDetail;
	}

	public CartDetailEntity(CartDetailId idCartDetail, CartEntity cartByCartDetail, MilkTeaEntity milkTeaByCartDetail) {
		super();
		this.idCartDetail = idCartDetail;
		this.cartByCartDetail = cartByCartDetail;
		this.milkTeaByCartDetail = milkTeaByCartDetail;
	}

	public CartDetailEntity() {
		super();
	}
}
