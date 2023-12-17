package hcmute.model;

import java.util.Set;

import org.springframework.web.multipart.MultipartFile;

import hcmute.entity.BranchMilkTea;
import hcmute.entity.CartDetailEntity;
import lombok.*;

public class MilkTeaModel {
	private int idMilkTea;
	private String name;
	private int cost;
	private String description;
	private int orderQuantity;
	private String image;
	private MultipartFile imageFile;

	// use for product detail
	private String milkTeaType;
	private String size;
	private int milkTeaTypeId;
	private int branchId;

	private MilkTeaTypeModel milkTeaTypeByMilkTea;
	private Set<CartDetailEntity> cartDetails;;
	private Set<BranchMilkTea> branchMilkTeas;
	private Boolean isEdit = false;

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
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public MultipartFile getImageFile() {
		return imageFile;
	}
	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}
	public String getMilkTeaType() {
		return milkTeaType;
	}
	public void setMilkTeaType(String milkTeaType) {
		this.milkTeaType = milkTeaType;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getMilkTeaTypeId() {
		return milkTeaTypeId;
	}
	public void setMilkTeaTypeId(int milkTeaTypeId) {
		this.milkTeaTypeId = milkTeaTypeId;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public MilkTeaTypeModel getMilkTeaTypeByMilkTea() {
		return milkTeaTypeByMilkTea;
	}
	public void setMilkTeaTypeByMilkTea(MilkTeaTypeModel milkTeaTypeByMilkTea) {
		this.milkTeaTypeByMilkTea = milkTeaTypeByMilkTea;
	}
	public Set<CartDetailEntity> getCartDetails() {
		return cartDetails;
	}
	public void setCartDetails(Set<CartDetailEntity> cartDetails) {
		this.cartDetails = cartDetails;
	}
	public Set<BranchMilkTea> getBranchMilkTeas() {
		return branchMilkTeas;
	}
	public void setBranchMilkTeas(Set<BranchMilkTea> branchMilkTeas) {
		this.branchMilkTeas = branchMilkTeas;
	}
	public Boolean getIsEdit() {
		return isEdit;
	}
	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}
	public MilkTeaModel(int idMilkTea, String name, int cost, String description, int orderQuantity, String image,
			MultipartFile imageFile, String milkTeaType, String size, int milkTeaTypeId, int branchId,
			MilkTeaTypeModel milkTeaTypeByMilkTea, Set<CartDetailEntity> cartDetails, Set<BranchMilkTea> branchMilkTeas,
			Boolean isEdit) {
		super();
		this.idMilkTea = idMilkTea;
		this.name = name;
		this.cost = cost;
		this.description = description;
		this.orderQuantity = orderQuantity;
		this.image = image;
		this.imageFile = imageFile;
		this.milkTeaType = milkTeaType;
		this.size = size;
		this.milkTeaTypeId = milkTeaTypeId;
		this.branchId = branchId;
		this.milkTeaTypeByMilkTea = milkTeaTypeByMilkTea;
		this.cartDetails = cartDetails;
		this.branchMilkTeas = branchMilkTeas;
		this.isEdit = isEdit;
	}
	public MilkTeaModel() {
		super();
	}
}
