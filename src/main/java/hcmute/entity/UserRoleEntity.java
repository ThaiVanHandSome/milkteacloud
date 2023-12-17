package hcmute.entity;

import java.io.Serializable;
import javax.persistence.*;


import lombok.*;

@Entity
@Table(name = "user_role", uniqueConstraints = {
        @UniqueConstraint(columnNames = { "id", "role_id" })
})
public class UserRoleEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer role_user_id;
	@ManyToOne
	@JoinColumn(name = "id")
	private UserEntity user;

	@ManyToOne
	@JoinColumn(name = "role_id")
	private RoleEntity role;
	
	 public UserRoleEntity(UserEntity user, RoleEntity role) {
	        this.user = user;
	        this.role = role;
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

	public UserRoleEntity(Integer role_user_id, UserEntity user, RoleEntity role) {
		super();
		this.role_user_id = role_user_id;
		this.user = user;
		this.role = role;
	}

	public UserRoleEntity() {
		super();
	}
}
