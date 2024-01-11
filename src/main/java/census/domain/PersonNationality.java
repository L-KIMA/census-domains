package census.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person_nationalities", schema = "census")
public class PersonNationality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "person_id")
    private Long personId;

    @Column(name = "nationality_id")
    private Integer nationalityId;

    @Column(name = "nationality_name")
    private String nationalityName;
}
