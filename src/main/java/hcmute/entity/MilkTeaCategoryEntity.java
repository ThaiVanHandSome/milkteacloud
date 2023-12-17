package hcmute.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "milk_tea_category")
public class MilkTeaCategoryEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_category")
	private int idCategory;
	
	@Column(name = "name",columnDefinition = "nvarchar(100)")
	private String name;	
	
	@OneToMany(mappedBy = "milkTeaCategoryByMilkTeaType")
	private Set<MilkTeaTypeEntity> milkTeaTypes;

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

	public Set<MilkTeaTypeEntity> getMilkTeaTypes() {
		return milkTeaTypes;
	}

	public void setMilkTeaTypes(Set<MilkTeaTypeEntity> milkTeaTypes) {
		this.milkTeaTypes = milkTeaTypes;
	}

	public MilkTeaCategoryEntity(int idCategory, String name, Set<MilkTeaTypeEntity> milkTeaTypes) {
		super();
		this.idCategory = idCategory;
		this.name = name;
		this.milkTeaTypes = milkTeaTypes;
	}

	public MilkTeaCategoryEntity() {
		super();
	}

}
