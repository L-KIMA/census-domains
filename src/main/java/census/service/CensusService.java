package census.service;

import census.domain.CensusAddress;
import census.repository.CensusAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CensusService {

    private CensusAddressRepository censusAddressRepository;

    public List<CensusAddress> getAddress() {
        return censusAddressRepository.getAddress();
    }

    public List<CensusAddress> getAdd() {
        return censusAddressRepository.getCensusAdd();
    }

    @Autowired
    public void setCensusAddressRepository(CensusAddressRepository censusAddressRepository) {
        this.censusAddressRepository = censusAddressRepository;
    }
}
