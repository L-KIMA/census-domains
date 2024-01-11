package census.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "house_improvements", schema = "census")
public class HouseImprovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "house_id")
    private Long houseId;

    @Column(name = "has_electric")
    private Boolean hasElectric;

    @Column(name = "has_plumbing")
    private Boolean hasPlumbing;

    @Column(name = "has_toilet")
    private Boolean hasToilet;

    @Column(name = "has_sewage")
    private Boolean hasSewage;

    @Column(name = "has_bath")
    private Boolean hasBath;

    @Column(name = "has_heating")
    private Boolean hasHeating;

    @Column(name = "has_hot_water")
    private Boolean hasHotWater;
}
