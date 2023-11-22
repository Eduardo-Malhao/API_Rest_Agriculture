package com.betrybe.agrix.ebytr.staff.models.repositories;

import com.betrybe.agrix.ebytr.staff.models.entities.Crop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Java Doc Type.
 */
@Repository
public interface CropRepository extends JpaRepository<Crop, Integer> {

}
