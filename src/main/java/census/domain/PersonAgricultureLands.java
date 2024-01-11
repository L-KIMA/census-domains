package census.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person_agriculture_lands", schema = "census")
public class PersonAgricultureLands {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "person_agriculture_id")
    private Long personAgricultureId;

    @Column(name = "cadastral_code")
    private String cadastralCode;

    @Column(name = "land_name")
    private String landName;

    @Column(name = "location_code")
    private String locationCode;

    @Column(name = "address_id")
    private Integer addressId;

    @Column(name = "land_area")
    private Double landArea;

    @Column(name = "land_property_type_id")
    private Integer landPropertyTypeId;
}
