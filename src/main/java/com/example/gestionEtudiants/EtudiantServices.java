package com.example.gestionEtudiants;

import com.example.gestionEtudiants.model.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Etudiant getEtudiantById(int id ){return etudiantRepository.findById(id).get();}
    public void updateEtudiant(Etudiant etudiant)
    {
        etudiantRepository.save(etudiant);
    }
    public void supprimerEtudniant(Etudiant etudiant ) { etudiantRepository.delete(etudiant); }
}
