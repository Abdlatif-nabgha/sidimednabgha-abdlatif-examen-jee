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
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class SidiAbdlatifExamenJeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SidiAbdlatifExamenJeeApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ClientRepository clientRepository,
                            ContratAssuranceRepository contratRepository,
                            PaiementRepository paiementRepository) {
        return args -> {
            // 1. Create a Client
            Client client = Client.builder()
                    .nom("Abdellatif Nabgha")
                    .email("nabgha@gmail.com")
                    .build();
            clientRepository.save(client);

            // 2. Create a Contrat Automobile
            ContratAutomobile auto = new ContratAutomobile();
            auto.setDateSouscription(LocalDate.now());
            auto.setStatus(ContratStatus.VALIDE);
            auto.setMontantCotisation(1200.0);
            auto.setDureeContrat(12);
            auto.setTauxCouverture(0.85);
            auto.setClient(client);
            auto.setNumeroImmatriculation("1234-A-1");
            auto.setMarkVehicule("BMW");
            auto.setModeleVehicule("M4");
            contratRepository.save(auto);

            // 3. Create a Contrat Habitation
            ContratHabitation habitat = new ContratHabitation();
            habitat.setDateSouscription(LocalDate.now());
            habitat.setStatus(ContratStatus.ENCOURS);
            habitat.setMontantCotisation(2500.0);
            habitat.setDureeContrat(24);
            habitat.setTauxCouverture(0.95);
            habitat.setClient(client);
            habitat.setTypeLogement(TypeLogement.APPARTEMENT);
            habitat.setAddresse("Casablanca, Maarif");
            habitat.setSuperficie("90m2");
            contratRepository.save(habitat);

            // 4. Create a Contrat Sante
            ContratSante sante = new ContratSante();
            sante.setDateSouscription(LocalDate.now());
            sante.setStatus(ContratStatus.VALIDE);
            sante.setMontantCotisation(500.0);
            sante.setDureeContrat(6);
            sante.setTauxCouverture(1.0);
            sante.setClient(client);
            sante.setConverture(NiveauConverture.PREMIUM);
            sante.setNombrePersonne(1);
            contratRepository.save(sante);

            // 5. Create some Paiements
            Paiement p1 = Paiement.builder()
                    .date(LocalDate.now())
                    .montant(1200.0)
                    .type(PaiementType.PAIEMENT_ANNUEL)
                    .contratAssurance(auto)
                    .build();
            paiementRepository.save(p1);

            Paiement p2 = Paiement.builder()
                    .date(LocalDate.now())
                    .montant(500.0)
                    .type(PaiementType.MENSUALITE)
                    .contratAssurance(sante)
                    .build();
            paiementRepository.save(p2);

            System.out.println("Data initialization completed successfully!");
        };
    }
}
