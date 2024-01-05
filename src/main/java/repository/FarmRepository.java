package repository;

import entity.Farm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Java Doc Type.
 */
@Repository
public interface FarmRepository extends JpaRepository<Farm, Integer> {

}
