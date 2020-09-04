package pack.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pack.model.Device;
import pack.model.Journal;
import pack.service.DeviceService;
import pack.service.JournalService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/journal")
public class JournalController {

    @Autowired
    private JournalService journalService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Journal> findAll() {
        return journalService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Journal getById(@PathVariable Long id) {
        return journalService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public Journal create(@RequestBody Journal journal) {
        return journalService.save(journal);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public void deleteById(@PathVariable Long id) {
        journalService.deleteById(id);
    }
}
