package census.domain.lib;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "educations", schema = "lib")
public class Education {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;
}