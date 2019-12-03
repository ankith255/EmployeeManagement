package com.management.employee.EmployeeManagement.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class AddressType {
	
	@Id
	private Long addressTypeId;
	@Enumerated(EnumType.STRING)
	private AddressTypes addressTypes;
	public Long getAddressTypeId() {
		return addressTypeId;
	}
	public void setAddressTypeId(Long addressTypeId) {
		this.addressTypeId = addressTypeId;
	}
	public AddressTypes getAddressTypes() {
		return addressTypes;
	}
	public void setAddressTypes(AddressTypes addressTypes) {
		this.addressTypes = addressTypes;
	}
}
