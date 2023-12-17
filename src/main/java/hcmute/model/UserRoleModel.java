package hcmute.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import hcmute.entity.RoleEntity;
import hcmute.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UserRoleModel {
	private Integer role_user_id;
	private UserEntity user;
	private RoleEntity role;
	private int user_id;
	private String role_id;
	private int idBranch;
	private Boolean isEdit;

    public UserRoleModel(Integer role_user_id, UserEntity user, RoleEntity role, int user_id, String role_id,
			int idBranch, Boolean isEdit) {
		super();
		this.role_user_id = role_user_id;
		this.user = user;
		this.role = role;
		this.user_id = user_id;
		this.role_id = role_id;
		this.idBranch = idBranch;
		this.isEdit = isEdit;
	}
	public UserRoleModel() {
		super();
	}
	public Integer getRole_user_id() {
		return role_user_id;
	}
	public void setRole_user_id(Integer role_user_id) {
		this.role_user_id = role_user_id;
	}
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}
	public RoleEntity getRole() {
		return role;
	}
	public void setRole(RoleEntity role) {
		this.role = role;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getRole_id() {
		return role_id;
	}
	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	public int getIdBranch() {
		return idBranch;
	}
	public void setIdBranch(int idBranch) {
		this.idBranch = idBranch;
	}
	public Boolean getIsEdit() {
		return isEdit;
	}
	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}
}
