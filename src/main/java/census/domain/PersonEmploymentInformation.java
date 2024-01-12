package census.domain;

import census.domain.lib.*;
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

    @ManyToOne
    @JoinColumn(name = "employment_type_id")
    private EmploymentType employmentType;

    @Column(name = "employment_type_name")
    private String employmentTypeName;

    @ManyToOne
    @JoinColumn(name = "self_employment_type_id")
    private SelfEmploymentType selfEmploymentType;

    @ManyToOne
    @JoinColumn(name = "agriculture_refuse_reason_id")
    private AgricultureRefuseReason agricultureRefuseReason;

    @ManyToOne
    @JoinColumn(name = "product_type_id")
    private ProductType productType;

    @Column(name = "work_completed_for_compensation")
    private Boolean workCompletedForCompensation;

    @Column(name = "personal_job_unable_do")
    private Boolean personalJobUnableDo;

    @ManyToOne
    @JoinColumn(name = "traying_to_finde_payd_work_answer_id")
    private TryingToFindPaidWorkAnswers tryingToFindPaidWorkAnswer;

    @Column(name = "could_you_start_working")
    private Boolean could_you_start_working;
}
