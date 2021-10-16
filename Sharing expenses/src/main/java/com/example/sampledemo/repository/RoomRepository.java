package com.example.sampledemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.sampledemo.Entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
	
	
	@Query(value = "select r.id as room_id,\r\n"
			+ "(select count(t.tenant_id) from ROOM r \r\n"
			+ " INNER JOIN TENANTS t on r.id = t.roomid_fk \r\n"
			+ " where r.id = :rid) as no_of_tenants,sum(e.expense_price) as total_expenses from ROOM r\r\n"
			+ " INNER JOIN EXPENSES e on e.roomid_fk = r.id\r\n"
			+ " where r.id= :rid\r\n"
			+ " group by e.roomid_fk;", nativeQuery = true)
	List<Object[]> getExpensesPerPerson(@Param("rid") Integer rid);
	

}
