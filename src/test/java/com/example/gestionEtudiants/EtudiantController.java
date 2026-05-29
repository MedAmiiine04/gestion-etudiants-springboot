package com.example.gestionEtudiants;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtudiantController {
private  EtudiantServices etudiantServices;
public EtudiantController(EtudiantServices etudiantServices)
{
    this.etudiantServices=etudiantServices;

}
@GetMapping("/etudiants")
        public String listEtudiants(Model model)
    {
        model.addAttribute("etudiant",etudiantServices.getAllEtudtiants());

        return "students";
    }


}
