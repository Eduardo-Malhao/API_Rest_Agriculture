package repository;

import entity.Fertilizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Java Doc Type.
 */
@Repository
public interface FertilizerRepository extends JpaRepository<Fertilizer, Integer> {

}
