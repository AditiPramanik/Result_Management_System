package com.example.rms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.rms.entity.Result_entity;

@Repository
public interface Result_repository extends JpaRepository<Result_entity, String>{

}
