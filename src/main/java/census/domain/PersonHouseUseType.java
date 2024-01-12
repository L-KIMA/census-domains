package census.domain;

import census.domain.lib.HouseUseType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person_house_use_types", schema = "census")
public class PersonHouseUseType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "person_id")
    private Long personId;

    @ManyToOne
    @JoinColumn(name = "house_use_type_id")
    private HouseUseType houseUseType;

    @Column(name = "roms_number")
    private Integer romsNumber;

    @Column(name = "total_area")
    private Double totalArea;
}
