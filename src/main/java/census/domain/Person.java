package census.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "persons", schema = "census")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "house_id")
    private Long houseId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "gender_id")
    private Integer genderId;

    @Column(name = "personal_no")
    private String personalNo;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "birth_place_georgia")
    private String birthPlaceGeorgia;

    @Column(name = "birth_place_foreign")
    private String birthPlaceForeign;

    @Column(name = "religion_id")
    private Integer religionId;

    @Column(name = "religion_name")
    private String religionName;

    @Column(name = "marriage_status_id")
    private Integer marriageStatusId;

    @Column(name = "number_of_children")
    private Integer numberOfChildren;

    @Column(name = "alive_number_of_children")
    private Integer aliveNumberOfChildren;

    @Column(name = "serial_no")
    private String serialNo;

    @Column(name = "household_number")
    private String householdNumber;

    @Column(name = "parent_serial_no")
    private String parentSerialNo;

    @Column(name = "relation_serial_no")
    private String relationSerialNo;

    @Column(name = "temporarily_absent")
    private Boolean temporarilyAbsent;

    @Column(name = "temporary_stay")
    private Boolean temporaryStay;
}
