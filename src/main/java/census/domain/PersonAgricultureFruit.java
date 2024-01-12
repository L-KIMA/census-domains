package census.domain;

import census.domain.lib.AgricultureFruitType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person_agriculture_fruits", schema = "census")
public class PersonAgricultureFruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "person_agriculture_land_id")
    private Long personAgricultureLandId;

    @ManyToOne
    @JoinColumn(name = "agriculture_fruit_type_id")
    private AgricultureFruitType agricultureFruitType;

    @Column(name = "total_amount")
    private Integer totalAmount;

    @Column(name = "bearing_fruit_amount")
    private Integer bearingFruitAmount;

    @Column(name = "stand_alone_fruit_amount")
    private Integer standAloneFruitAmount;

    @Column(name = "stand_alone_bearing_fruit_amount")
    private Integer standAloneBearingFruitAmount;
}
