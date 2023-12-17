package hcmute.model;
import java.util.Set;
import lombok.*;

public class MilkTeaCategoryModel{
	private int idCategory;
	private String name;	
	private Set<MilkTeaTypeModel> milkTeaTypes;
	private Boolean isEdit = false;

    public MilkTeaCategoryModel(int idCategory, String name, Set<MilkTeaTypeModel> milkTeaTypes, Boolean isEdit) {
		super();
		this.idCategory = idCategory;
		this.name = name;
		this.milkTeaTypes = milkTeaTypes;
		this.isEdit = isEdit;
	}
	public MilkTeaCategoryModel() {
		super();
	}
	public int getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<MilkTeaTypeModel> getMilkTeaTypes() {
		return milkTeaTypes;
	}
	public void setMilkTeaTypes(Set<MilkTeaTypeModel> milkTeaTypes) {
		this.milkTeaTypes = milkTeaTypes;
	}
	public Boolean getIsEdit() {
		return isEdit;
	}
	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}
	
}
