package census.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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

    @Column(name = "living_category_id")
    private Integer livingCategoryId;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "reason")
    private String reason;
}
