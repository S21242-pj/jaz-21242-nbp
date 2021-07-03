package com.example.demo.repository;

import com.example.demo.model.EntryToDatabase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NbpRepository extends JpaRepository<EntryToDatabase, Long> {

}

