package com.example.sampledemo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Expenses {
	
	@Id
	private int expenseId;
	
	@Column(length = 15)
	private String expenseName;
	
	private Integer expensePrice;
	
	public Expenses() {}

	public Expenses(int expenseId, String expenseName, Integer expensePrice) {
		super();
		this.expenseId = expenseId;
		this.expenseName = expenseName;
		this.expensePrice = expensePrice;
	}

	@Override
	public String toString() {
		return "Expenses [expenseId=" + expenseId + ", expenseName=" + expenseName + ", expensePrice=" + expensePrice
				+ "]";
	}

	public int getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}

	public String getExpenseName() {
		return expenseName;
	}

	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}

	public Integer getExpensePrice() {
		return expensePrice;
	}

	public void setExpensePrice(Integer expensePrice) {
		this.expensePrice = expensePrice;
	}
	
	
	
	

}
