package com.example.demo.repository;

import com.example.demo.model.DatabaseEntrace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NbpRepository extends JpaRepository<DatabaseEntrace, Long> {

}

