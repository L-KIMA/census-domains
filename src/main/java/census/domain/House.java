package census.domain;

import census.domain.lib.HouseCategory;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "houses", schema = "census")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "housing_no")
    private String housingNo;

    @Column(name = "apartment_no")
    private String apartmentNo;

    @ManyToOne
    @JoinColumn(name = "house_category_id")
    private HouseCategory houseCategory;

    @Column(name = "built_date")
    private LocalDate builtDate;

    @Column(name = "number_of_rooms")
    private Integer numberOfRooms;

    @Column(name = "total_area")
    private Double totalArea;

    @Column(name = "rooms_total_area")
    private Double roomsTotalArea;

    @Column(name = "census_address_id")
    private Long censusAddressId;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "house_id")
    private Set<Person> persons = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "house_id")
    private Set<HouseImprovement> houseImprovements = new HashSet<>();
}
