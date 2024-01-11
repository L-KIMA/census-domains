package census.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person_citizenships", schema = "census")
public class PersonCitizenship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "person_id")
    private Long person_id;

    @Column(name = "has_geo_citizenship")
    private Boolean hasGeoCitizenship;

    @Column(name = "has_other_citizenship")
    private Boolean hasOtherCitizenship;

    @Column(name = "other_citizenship_country")
    private String otherCitizenshipCountry;

    @Column(name = "has_no_citizenship")
    private Boolean hasNoCitizenship;
}
