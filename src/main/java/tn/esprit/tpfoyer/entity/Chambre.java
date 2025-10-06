package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Table(name = "T_CHAMBRE")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames=false)
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    Long idChambre;

    @Column(nullable = true, unique = true, name = "Chambre_NumeroChambre")
    public Long numeroChambre;

    @Enumerated(EnumType.STRING)
    TypeChambre typeC;

    @ManyToOne
    private Bloc bloc;

    @ManyToMany
    private List<Reservation> reservations;
}
