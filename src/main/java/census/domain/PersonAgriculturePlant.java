package census.domain;

import census.domain.lib.AgriculturePlantType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person_agriculture_plants", schema = "census")
public class PersonAgriculturePlant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "person_agriculture_land_id")
    private Long personAgricultureLandId;

    @ManyToOne
    @JoinColumn(name = "agriculture_plant_type_id")
    private AgriculturePlantType agriculturePlantType;

    @Column(name = "area_amount")
    private Double areaAmount;
}
