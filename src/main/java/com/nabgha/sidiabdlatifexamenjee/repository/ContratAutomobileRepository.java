package com.nabgha.sidiabdlatifexamenjee.repository;

import com.nabgha.sidiabdlatifexamenjee.entity.ContratAutomobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratAutomobileRepository extends JpaRepository<ContratAutomobile, Long> {
}
