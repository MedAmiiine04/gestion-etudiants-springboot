package com.example.gestionEtudiants;

import com.example.gestionEtudiants.model.Etudiant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Optional;

@Controller
public class EtudiantController {
private  EtudiantServices etudiantServices;
public EtudiantController(EtudiantServices etudiantServices)
{
    this.etudiantServices=etudiantServices;

}
@GetMapping("/etudiants")
        public String listEtudiants(Model model) {
    model.addAttribute("etudiants", etudiantServices.getAllEtudtiants());
    return "etudiants";
    }
@GetMapping("etudiants/new")
    public String creationEtudiant(Model model)
    {
        Etudiant etudiant=new Etudiant();
        model.addAttribute("etudiant",etudiant);
        return "create_etudiant";
    }
@PostMapping("/etudiants")
 public String createEtudiant(@ModelAttribute("etudiant") Etudiant etudiant)
    {   etudiantServices.createEtudiant(etudiant);
        return "redirect:/etudiants";
    }
@GetMapping("etudiants/update/{id}")
public  String updatingEtudiant(@PathVariable int id , Model model)
{
    model.addAttribute("etudiant",etudiantServices.getEtudiantById(id));
    return "edit_etudiant";

}
@PostMapping("/etudiants/{id}")
public String editEtudiant(@PathVariable int id,@ModelAttribute("etudiant" ) Etudiant etudiant)
{
   Etudiant etudianExistant = etudiantServices.getEtudiantById(id);
   etudianExistant.setNom(etudiant.getNom());
   etudianExistant.setPrenom(etudiant.getPrenom());
   etudianExistant.setEmail(etudiant.getEmail());

    etudiantServices.updateEtudiant(etudianExistant);
    return "redirect:/etudiants";
}
@PostMapping("/etudiants/delete/{id}")
    public String deleteEtudiant(@PathVariable int id)
{
    Etudiant etudiantExistant =etudiantServices.getEtudiantById(id);
    etudiantServices.supprimerEtudniant(etudiantExistant);
    return "redirect:/etudiants";
}


}
