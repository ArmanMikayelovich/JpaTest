package am.aca.repository;

import am.aca.entity.ClarificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClarificationRepository extends JpaRepository<ClarificationEntity, Integer> {

}