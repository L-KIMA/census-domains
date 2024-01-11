package census.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person_health_conditions", schema = "census")
public class PersonHealthCondition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "person_id")
    private Long personId;

    @Column(name = "vision_condition_type_id")
    private Integer visionConditionTypeId;

    @Column(name = "movement_condition_type_id")
    private Integer movementConditionTypeId;

    @Column(name = "hearing_condition_type_id")
    private Integer hearingConditionTypeId;

    @Column(name = "memory_condition_type_id")
    private Integer memoryConditionTypeId;

    @Column(name = "self_care_condition_type_id")
    private Integer selfCareConditionTypeId;
}
