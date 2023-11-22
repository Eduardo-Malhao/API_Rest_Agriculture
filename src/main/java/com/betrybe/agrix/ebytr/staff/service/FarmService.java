package com.betrybe.agrix.ebytr.staff.service;

import com.betrybe.agrix.ebytr.staff.entity.Crop;
import com.betrybe.agrix.ebytr.staff.entity.Farm;
import com.betrybe.agrix.ebytr.staff.repository.FarmRepository;
import com.betrybe.agrix.ebytr.staff.service.CropService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Java Doc Type.
 */
@Service
public class FarmService {

  private final FarmRepository farmRepository;
  private final CropService cropService;

  @Autowired
  public FarmService(FarmRepository farmRepository, CropService cropService) {
    this.farmRepository = farmRepository;
    this.cropService = cropService;
  }
  
  public List<Farm> getAllFarms() {
    return farmRepository.findAll();
  }

  public Farm insertFarm(Farm farm) {
    return farmRepository.save(farm);
  }

  public Optional<Farm> getFarmById(Integer id) {
    return farmRepository.findById(id);
  }

  /**
   * Resumo.
   *
   * @param crop - crop
   * @param id   - id
   * @return - return
   */
  public Crop insertCrops(Crop crop, Integer id) {
    Optional<Farm> farm = getFarmById(id);

    crop.setFarm(farm.get());
    return cropService.insertCrop(crop);
  }
}