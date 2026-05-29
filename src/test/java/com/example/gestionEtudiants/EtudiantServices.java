package com.example.gestionEtudiants;

import com.example.gestionEtudiants.model.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantServices {
    private EtudiantRepository etudiantRepository;

   public EtudiantServices(EtudiantRepository etudiantRepository)
   {
       this.etudiantRepository=etudiantRepository;
   }

    public List<Etudiant> getAllEtudtiants()
    {
        return etudiantRepository.findAll();
    }
    public void createEtudiant(Etudiant etudiant)
    {
        etudiantRepository.save(etudiant);
    }
}
