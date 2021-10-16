package com.example.sampledemo.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Room {
	
@Id
private Integer id;

@Column(length = 15)
private String name;

@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
@JoinColumn(name="ROOMID_FK")
private Set<Tenants> tenants = new HashSet<>();

@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
@JoinColumn(name="ROOMID_FK")
private Set<Expenses> expenses = new HashSet<>();

public Room() {}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Set<Tenants> getTenants() {
	return tenants;
}

public void setTenants(Set<Tenants> tenants) {
	this.tenants = tenants;
}

public Set<Expenses> getExpenses() {
	return expenses;
}

public void setExpenses(Set<Expenses> expenses) {
	this.expenses = expenses;
}

@Override
public String toString() {
	return "Room [id=" + id + ", name=" + name + ", tenants=" + tenants + ", expenses=" + expenses + "]";
}

public Room(Integer id, String name, Set<Tenants> tenants, Set<Expenses> expenses) {
	super();
	this.id = id;
	this.name = name;
	this.tenants = tenants;
	this.expenses = expenses;
}






}
