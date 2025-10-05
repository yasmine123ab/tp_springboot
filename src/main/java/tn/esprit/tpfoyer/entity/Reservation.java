package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    private String idReservation;

    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;

    private boolean estValide;

    @ManyToMany
    private List<Chambre> chambres;

    @ManyToMany(mappedBy = "reservations")
    private List<Etudiant> etudiants;
}
