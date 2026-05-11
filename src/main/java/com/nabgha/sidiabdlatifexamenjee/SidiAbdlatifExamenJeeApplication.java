package com.nabgha.sidiabdlatifexamenjee;

import com.nabgha.sidiabdlatifexamenjee.entity.*;
import com.nabgha.sidiabdlatifexamenjee.enums.*;
import com.nabgha.sidiabdlatifexamenjee.repository.ClientRepository;
import com.nabgha.sidiabdlatifexamenjee.repository.ContratAssuranceRepository;
import com.nabgha.sidiabdlatifexamenjee.repository.PaiementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class SidiAbdlatifExamenJeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SidiAbdlatifExamenJeeApplication.class, args);
    }
}
