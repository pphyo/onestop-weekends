package com.jdc.rsm;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	@Column(nullable = false, length = 100)
	private String name;
	@Column(length = 15)
	private String phone;
	
//	@MapsId
//	@OneToOne(optional = false)
//	@PrimaryKeyJoinColumn
//	private Address address;
	
	@OneToMany
	@JoinColumn(name = "customer_id")
	private List<Voucher> vouchers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
//	public Address getAddress() {
//		return address;
//	}
//	
//	public void setAddress(Address address) {
//		this.address = address;
////		setId(address.getId());
//	}
	
	public List<Voucher> getVouchers() {
		return vouchers;
	}
	
	public void setVouchers(List<Voucher> vouchers) {
		this.vouchers = vouchers;
	}

}
