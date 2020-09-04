package pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.model.Device;
import pack.model.Journal;
import pack.repository.DeviceRepo;
import pack.repository.JournalRepo;

import java.util.List;

@Service
public class JournalService {

    @Autowired
    private JournalRepo journalRepo;

    public Journal findById(Long id){
        return journalRepo.findById(id).orElse(null);
    }

    public List<Journal> findAll() {
        return journalRepo.findAll();
    }

    public Journal save(Journal journal){
        return journalRepo.save(journal);
    }

    public Long deleteById(Long id) {
        if (journalRepo.findById(id).isPresent()) {
            journalRepo.deleteById(id);
            return id;
        }
        return -1L;
    }
}
