package com.example.sampledemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sampledemo.Entity.Expenses;


@Repository
public interface ExpensesRepository extends JpaRepository<Expenses, Integer> {

}
