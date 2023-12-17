package hcmute.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import lombok.*;

public class CityModel{
	private String idCity;
	private String name;
	private BranchModel branches;
	private Boolean isEdit = false;

    public String getIdCity() {
		return idCity;
	}
	public void setIdCity(String idCity) {
		this.idCity = idCity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BranchModel getBranches() {
		return branches;
	}
	public void setBranches(BranchModel branches) {
		this.branches = branches;
	}
	public Boolean getIsEdit() {
		return isEdit;
	}
	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}
	public CityModel(String idCity, String name, BranchModel branches, Boolean isEdit) {
		super();
		this.idCity = idCity;
		this.name = name;
		this.branches = branches;
		this.isEdit = isEdit;
	}
	public CityModel() {
		super();
	}
}
