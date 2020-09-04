package pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.model.Beacon;
import pack.model.Place;
import pack.repository.BeaconRepo;
import pack.repository.PlaceRepo;

import java.util.Arrays;
import java.util.List;

@Service
public class BeaconService {

    @Autowired
    private BeaconRepo beaconRepo;

    public Beacon findById(Long id){
        return beaconRepo.findById(id).orElse(null);
    }

    public List<Beacon> findAll() {
        return beaconRepo.findAll();
    }

    public Beacon save(Beacon beacon){
        return beaconRepo.save(beacon);
    }

    public Long deleteById(Long id) {
        if (beaconRepo.findById(id).isPresent()) {
            beaconRepo.deleteById(id);
            return id;
        }
        return -1L;
    }
}
