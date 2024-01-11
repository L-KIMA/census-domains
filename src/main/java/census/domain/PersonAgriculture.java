package census.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person_agriculture", schema = "census")
public class PersonAgriculture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "person_id")
    private Long personId;

    @Column(name = "has_any_agriculture")
    private Boolean hasAnyAgriculture;

    @Column(name = "has_any_fruit_trees")
    private Boolean hasAnyFruitTrees;

    @Column(name = "has_any_aqueducts")
    private Boolean hasAnyAqueducts;
}
