package com.apibibliotheque.biblio.entities;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Livre {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_livre")
    private Long Id;
    @Column(length = 50, nullable = false) @Size(max = 50)
    private String Titre;
    @Column(updatable = false, nullable = false)
    private String MaisonEdition;
    @Temporal(TemporalType.DATE) @Column(nullable = false)
    private Date DateSortie;
    @Column(nullable = false)
    private String Auteur;
    @Column(nullable = false)
    private String NombrePage;
    @Column(unique = true, updatable = false, nullable = false)
    private String ISBN;
    @Temporal(TemporalType.TIMESTAMP) @CreationTimestamp @Column(nullable = false)
    private Date DateDerniereConsultation;
    @Column(name = "disponible", nullable = false)
    private Boolean disponible;
}
