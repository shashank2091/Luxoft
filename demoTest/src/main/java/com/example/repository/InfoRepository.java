package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.helper.Info;

@Repository
public interface InfoRepository extends JpaRepository<Info, Long> {

}
