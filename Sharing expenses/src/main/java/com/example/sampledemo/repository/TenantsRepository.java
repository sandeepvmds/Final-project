package com.example.sampledemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sampledemo.Entity.Tenants;

@Repository
public interface TenantsRepository extends JpaRepository<Tenants, Integer> {

}
