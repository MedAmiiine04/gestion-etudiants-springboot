package com.example.gestionEtudiants.model;

import jakarta.persistence.*;

@Entity
@Table(name="etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nom")
    String nom;
    @Column(name="prenom")
    String prenom;
    @Column(name="email")
    String email;

}
