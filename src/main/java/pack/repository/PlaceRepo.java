package pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pack.model.Place;

@Repository
public interface PlaceRepo extends JpaRepository<Place, Long> {
}
