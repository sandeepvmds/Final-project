package com.example.sampledemo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tenants {
	
	@Id
	private Integer tenantId;
	
	@Column(length = 15)
	private String tenantName;
	
	
	public Tenants() {}

	public Integer getTenantId() {
		return tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}


	public Tenants(Integer tenantId, String tenantName, Room room) {
		super();
		this.tenantId = tenantId;
		this.tenantName = tenantName;
	}

	@Override
	public String toString() {
		return "Tenants [tenantId=" + tenantId + ", tenantName=" + tenantName + "]";
	}
	
	
	
	
	

}
