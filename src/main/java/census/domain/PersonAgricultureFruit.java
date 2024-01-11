package census.domain;

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

    @Column(name = "person_agriculture_id")
    private Long personAgricultureId;

    @Column(name = "agriculture_fruit_type_id")
    private Integer agricultureFruitTypeId;

    @Column(name = "total_amount")
    private Integer totalAmount;

    @Column(name = "bearing_fruit_amount")
    private Integer bearingFruitAmount;

    @Column(name = "stand_alone_fruit_amount")
    private Integer standAloneFruitAmount;

    @Column(name = "stand_alone_bearing_fruit_amount")
    private Integer standAloneBearingFruitAmount;
}
