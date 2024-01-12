package census.domain;

import census.domain.lib.LivingCategory;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "person_living_categories", schema = "census")
public class PersonLivingCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "person_id")
    private Long personId;

    @ManyToOne
    @JoinColumn(name = "living_category_id")
    private LivingCategory livingCategory;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "reason")
    private String reason;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_living_category_id")
    private Set<PersonLivingCategoryTemporaryAddress> personLivingCategoryTemporaryAddresses = new HashSet<>();
}
