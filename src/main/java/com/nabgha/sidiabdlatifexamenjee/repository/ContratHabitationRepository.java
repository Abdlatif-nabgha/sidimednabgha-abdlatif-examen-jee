package com.nabgha.sidiabdlatifexamenjee.repository;

import com.nabgha.sidiabdlatifexamenjee.entity.ContratHabitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratHabitationRepository extends JpaRepository<ContratHabitation, Long> {
}
