package census.domain.lib;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "address", schema = "lib")
public class Address {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "location_code")
    private String locationCode;

    @Column(name = "location_name")
    private String locationName;

    @Column(name = "location_type_id")
    private Integer locationTypeId;

    @Column(name = "urban_type_id")
    private Integer urbanTypeId;

    @Column(name = "inactive")
    private Integer inactive;

    @Column(name = "rec_user_id")
    private Integer recUserId;

    @Column(name = "rec_date")
    private LocalDateTime recDate;

    @Column(name = "rec_type")
    private Integer recType;

    @Column(name = "level")
    private Integer level;

    @Column(name = "location_root_id")
    private Integer locationRootId;

    @Column(name = "location_munic_id")
    private Integer locationMunicId;

    @Column(name = "true_parent_id")
    private Integer trueParentId;
}
