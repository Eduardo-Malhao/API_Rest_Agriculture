package com.betrybe.agrix.ebytr.staff.models.services;

import com.betrybe.agrix.ebytr.staff.models.entities.Fertilizer;
import com.betrybe.agrix.ebytr.staff.models.repositories.FertilizerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Java Doc Method.
 */
@Service
public class FertilizerService {

  private final FertilizerRepository fertilizerRepository;

  @Autowired
  private FertilizerService(FertilizerRepository fertilizerRepository) {
    this.fertilizerRepository = fertilizerRepository;
  }

  public Fertilizer insertFertilizer(Fertilizer fertilizer) {
    return fertilizerRepository.save(fertilizer);
  }

  public List<Fertilizer> getAllFertilizers() {
    return fertilizerRepository.findAll();
  }

  public Optional<Fertilizer> getFertilizerById(Integer id) {
    return fertilizerRepository.findById(id);
  }
}
