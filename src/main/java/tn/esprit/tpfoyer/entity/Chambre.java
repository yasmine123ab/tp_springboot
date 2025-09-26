package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "T_CHAMBRE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    @Column(nullable = true, unique = true, name = "Chambre_NumeroChambre")
    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
}
