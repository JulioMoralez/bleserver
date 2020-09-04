package pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pack.model.Device;

@Repository
public interface DeviceRepo extends JpaRepository<Device, Long> {

//    @Query("select s from Device s")
//    List<Device> findAll2();
}
