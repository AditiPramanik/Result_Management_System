package com.example.rms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rms.entity.Admin_entity;

@Repository
public interface Admin_repository extends JpaRepository<Admin_entity, String> {

}
