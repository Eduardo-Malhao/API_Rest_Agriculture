package service;

import entity.Crop;
import repository.CropRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Java Type Method.
 */

@Service
public class CropService {

  private final CropRepository cropRepository;

  @Autowired
  public CropService(CropRepository cropRepository) {
    this.cropRepository = cropRepository;
  }

  public List<Crop> getAllCrop() {
    return cropRepository.findAll();
  }

  public Optional<Crop> getCropById(int id) {
    return cropRepository.findById(id);
  }

  public Crop insertCrop(Crop crop) {
    return cropRepository.save(crop);
  }

}
