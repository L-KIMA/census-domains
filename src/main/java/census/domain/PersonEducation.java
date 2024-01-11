package census.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person_educations", schema = "census")
public class PersonEducation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "person_id")
    private Long personId;

    @Column(name = "native_language_id")
    private Integer nativeLanguageId;

    @Column(name = "native_language_name")
    private String nativeLanguageName;

    @Column(name = "language_speaking_level_id")
    private Integer languageSpeakingLevelId;

    @Column(name = "language_read_writing_level_id")
    private Integer languageReadWritingLevelId;

    @Column(name = "pre_school")
    private Boolean preSchool;

    @Column(name = "school")
    private Boolean school;

    @Column(name = "education_code")
    private String educationCode;
}
