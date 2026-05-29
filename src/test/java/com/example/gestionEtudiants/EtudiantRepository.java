package com.example.gestionEtudiants;

import com.example.gestionEtudiants.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
}
