package hcmute.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "pay_method")
public class PayMethodEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_pay_method",columnDefinition = "varchar(100)")
	private String idPayMethod;
	
	@Column(name = "name",columnDefinition = "nvarchar(100)")
	private String name;
	
	@OneToMany(mappedBy = "payMethodByOrder")
	private Set<OrderEntity> orders;

    public String getIdPayMethod() {
		return idPayMethod;
	}

	public void setIdPayMethod(String idPayMethod) {
		this.idPayMethod = idPayMethod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<OrderEntity> getOrders() {
		return orders;
	}

	public void setOrders(Set<OrderEntity> orders) {
		this.orders = orders;
	}

	public PayMethodEntity(String idPayMethod, String name, Set<OrderEntity> orders) {
		super();
		this.idPayMethod = idPayMethod;
		this.name = name;
		this.orders = orders;
	}

	public PayMethodEntity() {
		super();
	}
}
