package census.domain;

import census.domain.lib.LandPropertyType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

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

    @ManyToOne
    @JoinColumn(name = "land_property_type_id")
    private LandPropertyType landPropertyType;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_agriculture_land_id")
    private Set<PersonAgricultureFruit> personAgricultureFruits = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_agriculture_land_id")
    private Set<PersonAgriculturePlant> personAgriculturePlants = new HashSet<>();
}
