package hcmute.embeddedId;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
public class BranchMilkTeaId implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "id_branch")
	private int idBranch;
	
	@Column(name = "id_milk_tea")
	private int idMilkTea;
	
	@Column(name = "size", columnDefinition = "nvarchar(50)")
	private String size;

    public BranchMilkTeaId(int idBranch, int idMilkTea, String size) {
		super();
		this.idBranch = idBranch;
		this.idMilkTea = idMilkTea;
		this.size = size;
	}

	public BranchMilkTeaId() {
		super();
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
}
