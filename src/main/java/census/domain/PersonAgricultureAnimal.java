package census.domain;

import census.domain.lib.AgricultureAnimalType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person_agriculture_animals", schema = "census")
public class PersonAgricultureAnimal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "person_agriculture_id")
    private Long personAgricultureId;

    @ManyToOne
    @JoinColumn(name = "agriculture_animal_type_id")
    private AgricultureAnimalType agricultureAnimalType;

    @Column(name = "amount")
    private Integer amount;
}
