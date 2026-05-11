package com.nabgha.sidiabdlatifexamenjee.repository;


import com.nabgha.sidiabdlatifexamenjee.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
