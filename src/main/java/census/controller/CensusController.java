package census.controller;

import census.domain.CensusAddress;
import census.service.CensusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/census")
public class CensusController {

    private CensusService censusService;

    @GetMapping("getAddress")
    public List<CensusAddress> getAddress() {
        return censusService.getAddress();
    }

    @Autowired
    public void setCensusService(CensusService censusService) {
        this.censusService = censusService;
    }
}