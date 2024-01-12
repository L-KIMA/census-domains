package census.domain;

import census.domain.lib.ImmigrationArrivedReason;
import census.domain.lib.MigrationLivingReason;
import census.domain.lib.MigrationSettlementType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person_migration_informations", schema = "census")
public class PersonMigrationInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "person_id")
    private Long personId;

    @Column(name = "lived_another_state_in_georgia")
    private Boolean livedAnotherStateInGeorgia;

    @Column(name = "georgia_another_state_lived_address")
    private String georgiaAnotherStateLivedAddress;

    @ManyToOne
    @JoinColumn(name = "settlement_type_id")
    private MigrationSettlementType settlementType;

    @Column(name = "starting_living_year")
    private Integer startingLivingYear;

    @ManyToOne
    @JoinColumn(name = "migration_living_reason_id")
    private MigrationLivingReason migrationLivingReason;

    @Column(name = "migration_living_reason_name")
    private String migrationLivingReasonName;

    @Column(name = "lived_another_state_in_foreign")
    private Boolean livedAnotherStateInForeign;

    @Column(name = "foreign_state_lived_address")
    private String foreignStateLivedAddress;

    @Column(name = "immigration_arrived_year")
    private Integer immigrationArrivedYear;

    @ManyToOne
    @JoinColumn(name = "immigration_arrived_reason_id")
    private ImmigrationArrivedReason immigrationArrivedReason;

    @Column(name = "immigration_arrived_reason_name")
    private String immigrationArrivedReasonName;

    @Column(name = "refugee_status")
    private Boolean refugeeStatus;

    @Column(name = "refugee_from_country")
    private String refugeeFromCountry;

    @Column(name = "refugee_from_address")
    private String refugeeFromAddress;
}
