package pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.model.Place;
import pack.repository.PlaceRepo;

import java.util.List;

@Service
public class PlaceService {

    @Autowired
    private PlaceRepo placeRepo;

    public Place findById(Long id){
        return placeRepo.findById(id).orElse(null);
    }

    public List<Place> findAll() {
        return placeRepo.findAll();
    }

    public Place save(Place place){
        return placeRepo.save(place);
    }

    public Long deleteById(Long id) {
        if (placeRepo.findById(id).isPresent()) {
            placeRepo.deleteById(id);
            return id;
        }
        return -1L;
    }


}
