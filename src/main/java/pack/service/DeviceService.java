package pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.model.Beacon;
import pack.model.Device;
import pack.repository.BeaconRepo;
import pack.repository.DeviceRepo;

import java.util.List;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepo deviceRepo;

    public Device findById(Long id){
        return deviceRepo.findById(id).orElse(null);
    }

    public List<Device> findAll() {
        return deviceRepo.findAll();
    }

    public Device save(Device device){
        return deviceRepo.save(device);
    }

    public Long deleteById(Long id) {
        if (deviceRepo.findById(id).isPresent()) {
            deviceRepo.deleteById(id);
            return id;
        }
        return -1L;
    }
}
