package pack.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pack.model.Place;
import pack.service.PlaceService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/place")
public class PlaceController {

    @Autowired
    private PlaceService placeService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Place> findAll() {
        return placeService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Place getById(@PathVariable Long id) {
        return placeService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public Place create(@RequestBody Place place) {
        placeService.save(place);
        return place;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public void deleteById(@PathVariable Long id) {
        placeService.deleteById(id);
    }
}
