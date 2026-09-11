package com.gtic.lab3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gtic.lab3.entity.Job;
import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, String>{
    List<Job> findAllByOrderByNombreAsc();
}



