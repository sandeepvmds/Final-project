package com.example.sampledemo.runner;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.sampledemo.repository.RoomRepository;


@Component
public class MyCommandLineRunner  implements CommandLineRunner {
	
	@Autowired
	RoomRepository roomRepository;

	@Override
	public void run(String... args) throws Exception {
		
		/*
		Tenants t1 = new Tenants();t1.setTenantId(111);t1.setTenantName("sanjeev");
		Tenants t2 = new Tenants();t2.setTenantId(222);t2.setTenantName("muchu");
		
		Expenses e1 = new Expenses();e1.setExpenseId(123);e1.setExpenseName("InternetBill");e1.setExpensePrice(2000);
		Expenses e2 = new Expenses();e2.setExpenseId(234);e2.setExpenseName("powerBill");e2.setExpensePrice(1000);
		
		HashSet<Tenants> tenantsSet = new HashSet<Tenants>();
		tenantsSet.add(t1);tenantsSet.add(t2);
		
		HashSet<Expenses> expensesSet = new HashSet<Expenses>();
		expensesSet.add(e1);expensesSet.add(e2);
		
		Room r1 = new Room();
		r1.setId(1);
		r1.setName("Singlebedroom");
		r1.setTenants(tenantsSet);
		r1.setExpenses(expensesSet);
		
		roomRepository.save(r1); 
		
		*/
		
		
		
		/*
		Tenants t1 = new Tenants();t1.setTenantId(333);t1.setTenantName("ravi");
		Tenants t2 = new Tenants();t2.setTenantId(444);t2.setTenantName("mani");
		
		Expenses e1 = new Expenses();e1.setExpenseId(456);e1.setExpenseName("InternetBill");e1.setExpensePrice(3000);
		Expenses e2 = new Expenses();e2.setExpenseId(678);e2.setExpenseName("powerBill");e2.setExpensePrice(3000);
		
		HashSet<Tenants> tenantsSet = new HashSet<Tenants>();
		tenantsSet.add(t1);tenantsSet.add(t2);
		
		HashSet<Expenses> expensesSet = new HashSet<Expenses>();
		expensesSet.add(e1);expensesSet.add(e2);
		
		Room r2 = new Room();
		r2.setId(2);
		r2.setName("Double bedroom");
		r2.setTenants(tenantsSet);
		r2.setExpenses(expensesSet);
		
		roomRepository.save(r2); 
		
		*/
		
		List<Object[]> expensesPerPerson = roomRepository.getExpensesPerPerson(2);
		
				expensesPerPerson.forEach(val -> { 
					System.out.println("room_id = "+val[0]+" "+"no_of_tenants = "+val[1]+" "+"total_expenses = "+val[2]);
				});
				
				Object[] object = expensesPerPerson.get(expensesPerPerson.size()-1);
				BigInteger noOfTenants = (BigInteger)object[1];
				BigDecimal totalExpenses = (BigDecimal)object[2];
				 
		
				System.out.println("Share per person is : "+totalExpenses.intValue()/noOfTenants.intValue());
		
		
	}

}
