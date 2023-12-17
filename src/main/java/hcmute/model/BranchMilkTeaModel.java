package hcmute.model;
import javax.persistence.Column;

import hcmute.embeddedId.BranchMilkTeaId;
import hcmute.entity.BranchEntity;
import hcmute.entity.MilkTeaEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class BranchMilkTeaModel {
	private BranchMilkTeaId branchMilkTeaId;
	private BranchEntity branchByBranchMilkTea;
	private MilkTeaEntity milkTeaByBranchMilkTea;
	private int remainQuantity;
	private Boolean isEdit = false;
	private int idBranch;
	private int idMilkTea;
	private String size;

    public BranchMilkTeaId getBranchMilkTeaId() {
		return branchMilkTeaId;
	}
	public void setBranchMilkTeaId(BranchMilkTeaId branchMilkTeaId) {
		this.branchMilkTeaId = branchMilkTeaId;
	}
	public BranchEntity getBranchByBranchMilkTea() {
		return branchByBranchMilkTea;
	}
	public void setBranchByBranchMilkTea(BranchEntity branchByBranchMilkTea) {
		this.branchByBranchMilkTea = branchByBranchMilkTea;
	}
	public MilkTeaEntity getMilkTeaByBranchMilkTea() {
		return milkTeaByBranchMilkTea;
	}
	public void setMilkTeaByBranchMilkTea(MilkTeaEntity milkTeaByBranchMilkTea) {
		this.milkTeaByBranchMilkTea = milkTeaByBranchMilkTea;
	}
	public int getRemainQuantity() {
		return remainQuantity;
	}
	public void setRemainQuantity(int remainQuantity) {
		this.remainQuantity = remainQuantity;
	}
	public Boolean getIsEdit() {
		return isEdit;
	}
	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}
	public int getIdBranch() {
		return idBranch;
	}
	public void setIdBranch(int idBranch) {
		this.idBranch = idBranch;
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
	public BranchMilkTeaModel(BranchMilkTeaId branchMilkTeaId, BranchEntity branchByBranchMilkTea,
			MilkTeaEntity milkTeaByBranchMilkTea, int remainQuantity, Boolean isEdit, int idBranch, int idMilkTea,
			String size) {
		super();
		this.branchMilkTeaId = branchMilkTeaId;
		this.branchByBranchMilkTea = branchByBranchMilkTea;
		this.milkTeaByBranchMilkTea = milkTeaByBranchMilkTea;
		this.remainQuantity = remainQuantity;
		this.isEdit = isEdit;
		this.idBranch = idBranch;
		this.idMilkTea = idMilkTea;
		this.size = size;
	}
	public BranchMilkTeaModel() {
		super();
	}
}
