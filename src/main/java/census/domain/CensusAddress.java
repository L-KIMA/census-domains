package census.domain;

import census.domain.lib.CensusStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "census_addresses", schema = "census")
public class CensusAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sector_no")
    private String sectorNo;

    @Column(name = "district_no")
    private String districtNo;

    @Column(name = "registration_area_no")
    private String registrationAreaNo;

    @Column(name = "building_no")
    private String buildingNo;

    @Column(name = "district")
    private String district;

    @Column(name = "street")
    private String street;

    @Column(name = "street_no")
    private String streetNo;

    @Column(name = "micro_district_no")
    private String microDistrictNo;

    @Column(name = "quarter_no")
    private String quarterNo;

    @Column(name = "corpus_no")
    private String corpusNo;

    @Column(name = "address_id")
    private Long addressId;

    @Column(name = "location_code")
    private String locationCode;

    @ManyToOne
    @JoinColumn(name = "census_status_id")
    private CensusStatus status;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    @Column(name = "update_date")
    private LocalDateTime updateDate;

    @Column(name = "external_user_id")
    private Long externalUserId;

    @Column(name = "user_mapping_id")
    private Long userMappingId;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "census_address_id")
    private Set<House> houses = new HashSet<>();
}
