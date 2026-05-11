package com.nabgha.sidiabdlatifexamenjee.repository;

import com.nabgha.sidiabdlatifexamenjee.entity.ContratSante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratSanteRepository extends JpaRepository<ContratSante, Long> {
}
