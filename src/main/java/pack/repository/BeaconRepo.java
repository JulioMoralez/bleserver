package pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pack.model.Beacon;

@Repository
public interface BeaconRepo extends JpaRepository<Beacon, Long> {
}
