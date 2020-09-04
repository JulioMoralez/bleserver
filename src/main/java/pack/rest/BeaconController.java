package pack.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pack.model.Beacon;
import pack.service.BeaconService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/beacon")
public class BeaconController {

    @Autowired
    private BeaconService beaconService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Beacon> findAll() {
        return beaconService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Beacon getById(@PathVariable Long id) {
        return beaconService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public Beacon create(@RequestBody Beacon beacon) {
        return beaconService.save(beacon);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public void deleteById(@PathVariable Long id) {
        beaconService.deleteById(id);
    }
}
