package census.domain;

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

    @Column(name = "agriculture_animal_type_id")
    private Integer agricultureAnimalTypeId;

    @Column(name = "amount")
    private Integer amount;
}
