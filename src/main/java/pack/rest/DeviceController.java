package pack.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pack.model.Device;
import pack.service.DeviceService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/device")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Device> findAll() {
        return deviceService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Device getById(@PathVariable Long id) {
        return deviceService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public Device create(@RequestBody Device device) {
        return deviceService.save(device);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public void deleteById(@PathVariable Long id) {
        deviceService.deleteById(id);
    }
}
