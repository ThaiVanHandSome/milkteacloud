package hcmute.model;
import lombok.*;

public class MilkTeaTypeModel{
	private int idType;
	private String name;
	private MilkTeaCategoryModel milkTeaCategoryByMilkTeaType;
	private MilkTeaModel milkTeas;
	private int idCategory;
	private Boolean isEdit = false;

    public MilkTeaTypeModel(int idType, String name, MilkTeaCategoryModel milkTeaCategoryByMilkTeaType,
			MilkTeaModel milkTeas, int idCategory, Boolean isEdit) {
		super();
		this.idType = idType;
		this.name = name;
		this.milkTeaCategoryByMilkTeaType = milkTeaCategoryByMilkTeaType;
		this.milkTeas = milkTeas;
		this.idCategory = idCategory;
		this.isEdit = isEdit;
	}
	public MilkTeaTypeModel() {
		super();
	}
	public int getIdType() {
		return idType;
	}
	public void setIdType(int idType) {
		this.idType = idType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MilkTeaCategoryModel getMilkTeaCategoryByMilkTeaType() {
		return milkTeaCategoryByMilkTeaType;
	}
	public void setMilkTeaCategoryByMilkTeaType(MilkTeaCategoryModel milkTeaCategoryByMilkTeaType) {
		this.milkTeaCategoryByMilkTeaType = milkTeaCategoryByMilkTeaType;
	}
	public MilkTeaModel getMilkTeas() {
		return milkTeas;
	}
	public void setMilkTeas(MilkTeaModel milkTeas) {
		this.milkTeas = milkTeas;
	}
	public int getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}
	public Boolean getIsEdit() {
		return isEdit;
	}
	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}
	
	
}
