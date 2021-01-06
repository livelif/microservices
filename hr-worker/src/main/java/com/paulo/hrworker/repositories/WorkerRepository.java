package com.paulo.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
