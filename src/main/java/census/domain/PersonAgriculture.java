package census.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

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

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_agriculture_id")
    private Set<PersonAgricultureAnimal> personAgricultureAnimals = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_agriculture_id")
    private Set<PersonAgricultureLands> personAgricultureLands = new HashSet<>();
}
