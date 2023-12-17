package hcmute.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import hcmute.entity.BranchEntity;
import hcmute.entity.CartEntity;
import hcmute.entity.OrderEntity;
import hcmute.entity.UserRoleEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UserModel {
    private int id;
    private String username;
    private String password;
    private String email;
    private AuthProvider provider;
    private Boolean enabled;
    private String verify_code;
    private String reset_pwd_token;
	private String surname;
	private String name;
	private String birthday;
	private String phoneNumber;
	private String imageUrl;
	private int gender;
    private List<UserRoleEntity> authorities;
	private BranchEntity branchByUser;
	private Set<CartEntity> carts;
	private Set<OrderEntity> orders;
	private Boolean isEdit;

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AuthProvider getProvider() {
		return provider;
	}
	public void setProvider(AuthProvider provider) {
		this.provider = provider;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public String getVerify_code() {
		return verify_code;
	}
	public void setVerify_code(String verify_code) {
		this.verify_code = verify_code;
	}
	public String getReset_pwd_token() {
		return reset_pwd_token;
	}
	public void setReset_pwd_token(String reset_pwd_token) {
		this.reset_pwd_token = reset_pwd_token;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public List<UserRoleEntity> getAuthorities() {
		return authorities;
	}
	public void setAuthorities(List<UserRoleEntity> authorities) {
		this.authorities = authorities;
	}
	public BranchEntity getBranchByUser() {
		return branchByUser;
	}
	public void setBranchByUser(BranchEntity branchByUser) {
		this.branchByUser = branchByUser;
	}
	public Set<CartEntity> getCarts() {
		return carts;
	}
	public void setCarts(Set<CartEntity> carts) {
		this.carts = carts;
	}
	public Set<OrderEntity> getOrders() {
		return orders;
	}
	public void setOrders(Set<OrderEntity> orders) {
		this.orders = orders;
	}
	public Boolean getIsEdit() {
		return isEdit;
	}
	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}
	public UserModel(int id, String username, String password, String email, AuthProvider provider, Boolean enabled,
			String verify_code, String reset_pwd_token, String surname, String name, String birthday,
			String phoneNumber, String imageUrl, int gender, List<UserRoleEntity> authorities,
			BranchEntity branchByUser, Set<CartEntity> carts, Set<OrderEntity> orders, Boolean isEdit) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.provider = provider;
		this.enabled = enabled;
		this.verify_code = verify_code;
		this.reset_pwd_token = reset_pwd_token;
		this.surname = surname;
		this.name = name;
		this.birthday = birthday;
		this.phoneNumber = phoneNumber;
		this.imageUrl = imageUrl;
		this.gender = gender;
		this.authorities = authorities;
		this.branchByUser = branchByUser;
		this.carts = carts;
		this.orders = orders;
		this.isEdit = isEdit;
	}
	public UserModel() {
		super();
	}
}
