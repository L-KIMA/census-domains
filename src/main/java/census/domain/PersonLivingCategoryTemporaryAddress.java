package census.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person_living_category_temporary_address", schema = "census")
public class PersonLivingCategoryTemporaryAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "person_living_category_id")
    private Long personLivingCategoryId;

    @Column(name = "country")
    private String country;

    @Column(name = "municipality")
    private String municipality;

    @Column(name = "city")
    private String city;

    @Column(name = "raion")
    private String raion;

    @Column(name = "district")
    private String district;

    @Column(name = "village")
    private String village;

    @Column(name = "street")
    private String street;

    @Column(name = "street_no")
    private String streetNo;

    @Column(name = "micro_district_no")
    private String microDistrictNo;

    @Column(name = "quarter_no")
    private String quarterNo;

    @Column(name = "corpus_no")
    private String corpusNo;

    @Column(name = "apartment_no")
    private String apartmentNo;
}
