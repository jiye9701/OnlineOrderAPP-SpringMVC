package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrdersRepository extends JpaRepository<Orders, String>{

	//each users
	@Query(value = "SELECT * FROM orders where userNo=?1", nativeQuery = true)
    List<Orders> findOrders(int userNo);

//	@Query(value = "SELECT * FROM orders", nativeQuery = true)
//    List<Orders> findOrders2(int userNo);
}
