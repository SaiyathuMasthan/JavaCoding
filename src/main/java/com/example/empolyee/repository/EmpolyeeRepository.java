package com.example.empolyee.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.empolyee.entity.Empolyee;

@Repository
public interface EmpolyeeRepository extends JpaRepository<Empolyee, Long> {
	 
	Empolyee findByEmpolyeeId(Long id);

}
