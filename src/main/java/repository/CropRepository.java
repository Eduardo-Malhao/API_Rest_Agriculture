package repository;

import entity.Crop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Java Doc Type.
 */
@Repository
public interface CropRepository extends JpaRepository<Crop, Integer> {

}
