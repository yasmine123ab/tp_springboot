package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

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
}
