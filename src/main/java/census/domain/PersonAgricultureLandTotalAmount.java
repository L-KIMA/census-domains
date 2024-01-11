package census.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person_agriculture_land_total_amounts", schema = "census")
public class PersonAgricultureLandTotalAmount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "person_agriculture_id")
    private Long personAgricultureId;

    @Column(name = "land_property_type_id")
    private Integer landPropertyTypeId;

    @Column(name = "area_amount")
    private Double areaAmount;

    @Column(name = "amount")
    private Integer amount;
}
