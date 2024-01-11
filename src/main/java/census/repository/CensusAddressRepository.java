package census.repository;

import census.domain.CensusAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CensusAddressRepository extends JpaRepository<CensusAddress, Long> {

    @Query("select distinct address from CensusAddress address " +
            "left join fetch address.houses hous " +
            "left join fetch hous.persons person " +
            "left join fetch hous.houseImprovements improvement " +
            "left join fetch person.personCitizenships citizenship " +
            "left join fetch person.personEducations education " +
            "left join fetch person.personEmploymentInformations employmentInformation " +
            "left join fetch person.personHealthConditions healthCondition " +
            "left join fetch person.personHouseUseTypes houseUseType " +
            "left join fetch person.personLivingCategories livingCategorie " +
            "left join fetch person.personMigrationInformations migrationInformation " +
            "left join fetch person.personNationalities nationalitie " +
            "left join fetch person.personAgricultures agriculture " +
            "left join fetch agriculture.personAgricultureAnimals agricultureAnimal " +
            "left join fetch agriculture.personAgricultureLands agricultureLand ")
    List<CensusAddress> getAddress();
}
