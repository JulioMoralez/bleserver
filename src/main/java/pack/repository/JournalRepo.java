package pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pack.model.Journal;

@Repository
public interface JournalRepo  extends JpaRepository<Journal, Long> {
}
