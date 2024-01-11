package census.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

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

    @Column(name = "house_category_id")
    private Integer houseCategoryId;

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
}
