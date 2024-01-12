package census.domain;

import census.domain.lib.HealthConditionType;
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

    @ManyToOne
    @JoinColumn(name = "vision_condition_type_id")
    private HealthConditionType visionConditionType;

    @ManyToOne
    @JoinColumn(name = "movement_condition_type_id")
    private HealthConditionType movementConditionType;

    @ManyToOne
    @JoinColumn(name = "hearing_condition_type_id")
    private HealthConditionType hearingConditionType;

    @ManyToOne
    @JoinColumn(name = "memory_condition_type_id")
    private HealthConditionType memoryConditionType;

    @ManyToOne
    @JoinColumn(name = "self_care_condition_type_id")
    private HealthConditionType selfCareConditionType;
}
