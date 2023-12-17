package hcmute.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnore;

import hcmute.model.AuthProvider;
@Entity
@Table(name = "users")
public class UserEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String email;

    @Enumerated(EnumType.STRING) 
    private AuthProvider provider;
    private Boolean enabled;
    private String verify_code;
    private String reset_pwd_token;
    
    @Column(name = "surname",columnDefinition = "nvarchar(50)")
	private String surname;
	
	@Column(name = "name",columnDefinition = "nvarchar(50)")
	private String name;
	
	@Column(name = "birthday")
	private LocalDate birthday;
	
	@Column(name = "phone_number",columnDefinition = "varchar(50)")
	private String phoneNumber;
	
	@Column(name = "image_url", columnDefinition = "varchar(255)")
	private String imageUrl;
	
	@Column(name = "gender")
	private int gender;
    
    @JsonIgnore
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<UserRoleEntity> authorities;
    
    @ManyToOne
	@JoinColumn(name = "id_branch")
	private BranchEntity branchByUser;
    
    @OneToOne(mappedBy = "customerByCart")
	private CartEntity cart;
	
	@OneToMany(mappedBy = "customerByOrder")
	private Set<OrderEntity> orders;

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

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
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

	public CartEntity getCart() {
		return cart;
	}

	public void setCart(CartEntity cart) {
		this.cart = cart;
	}

	public Set<OrderEntity> getOrders() {
		return orders;
	}

	public void setOrders(Set<OrderEntity> orders) {
		this.orders = orders;
	}

	public UserEntity(int id, String username, String password, String email, AuthProvider provider, Boolean enabled,
			String verify_code, String reset_pwd_token, String surname, String name, LocalDate birthday,
			String phoneNumber, String imageUrl, int gender, List<UserRoleEntity> authorities,
			BranchEntity branchByUser, CartEntity cart, Set<OrderEntity> orders) {
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
		this.cart = cart;
		this.orders = orders;
	}

	public UserEntity() {
		super();
	}
}
