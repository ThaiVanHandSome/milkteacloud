package hcmute.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "milk_tea")
public class MilkTeaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_milk_tea")
	private int idMilkTea;

	@Column(name = "name", columnDefinition = "nvarchar(100)")
	private String name;

	@Column(name = "cost")
	private int cost;

	@Column(name = "description", columnDefinition = "nvarchar(1000)")
	private String description;

	@Column(name = "image", columnDefinition = "varchar(1000)")
	private String image;

	@ManyToOne
	@JoinColumn(name = "id_type")
	private MilkTeaTypeEntity milkTeaTypeByMilkTea;

	@OneToMany(mappedBy = "milkTeaByCartDetail")
	private Set<CartDetailEntity> cartDetails;

	@OneToMany(mappedBy = "milkTeaByOrderDetail")
	private Set<OrderDetailEntity> orderDetails;
	
	@OneToMany(mappedBy = "milkTeaByBranchMilkTea")
	private Set<BranchMilkTea> branchMilkTeas;

    public int getIdMilkTea() {
		return idMilkTea;
	}

	public void setIdMilkTea(int idMilkTea) {
		this.idMilkTea = idMilkTea;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public MilkTeaTypeEntity getMilkTeaTypeByMilkTea() {
		return milkTeaTypeByMilkTea;
	}

	public void setMilkTeaTypeByMilkTea(MilkTeaTypeEntity milkTeaTypeByMilkTea) {
		this.milkTeaTypeByMilkTea = milkTeaTypeByMilkTea;
	}

	public Set<CartDetailEntity> getCartDetails() {
		return cartDetails;
	}

	public void setCartDetails(Set<CartDetailEntity> cartDetails) {
		this.cartDetails = cartDetails;
	}

	public Set<OrderDetailEntity> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Set<OrderDetailEntity> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Set<BranchMilkTea> getBranchMilkTeas() {
		return branchMilkTeas;
	}

	public void setBranchMilkTeas(Set<BranchMilkTea> branchMilkTeas) {
		this.branchMilkTeas = branchMilkTeas;
	}

	public MilkTeaEntity(int idMilkTea, String name, int cost, String description, String image,
			MilkTeaTypeEntity milkTeaTypeByMilkTea, Set<CartDetailEntity> cartDetails,
			Set<OrderDetailEntity> orderDetails, Set<BranchMilkTea> branchMilkTeas) {
		super();
		this.idMilkTea = idMilkTea;
		this.name = name;
		this.cost = cost;
		this.description = description;
		this.image = image;
		this.milkTeaTypeByMilkTea = milkTeaTypeByMilkTea;
		this.cartDetails = cartDetails;
		this.orderDetails = orderDetails;
		this.branchMilkTeas = branchMilkTeas;
	}

	public MilkTeaEntity() {
		super();
	}
}