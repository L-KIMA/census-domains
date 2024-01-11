package census.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person_employment_informations", schema = "census")
public class PersonEmploymentInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "person_id")
    private Long person_id;

    @Column(name = "work_completed_in_own_agriculture")
    private Boolean workCompletedInOwnAgriculture;

    @Column(name = "has_any_agriculture")
    private Boolean hasAnyAgriculture;

    @Column(name = "organization_name")
    private String organizationName;

    @Column(name = "position_name")
    private String positionName;

    @Column(name = "organization_service_type")
    private String organizationServiceType;

    @Column(name = "employment_type_id")
    private Integer employmentTypeId;

    @Column(name = "employment_type_name")
    private String employmentTypeName;

    @Column(name = "self_employment_type_id")
    private Integer selfEmploymentTypeId;

    @Column(name = "agriculture_refuse_reason_id")
    private Integer agricultureRefuseReasonId;

    @Column(name = "product_type_id")
    private Integer productTypeId;

    @Column(name = "work_completed_for_compensation")
    private Boolean workCompletedForCompensation;

    @Column(name = "personal_job_unable_do")
    private Boolean personalJobUnableDo;

    @Column(name = "traying_to_finde_payd_work_answer_id")
    private Integer trayingToFindePaydWorkAnswerId;

    @Column(name = "could_you_start_working")
    private Boolean could_you_start_working;
}
