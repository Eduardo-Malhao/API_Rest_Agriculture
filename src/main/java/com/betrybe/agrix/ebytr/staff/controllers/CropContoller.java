package com.betrybe.agrix.ebytr.staff.controllers;

import com.betrybe.agrix.ebytr.staff.controllers.dto.CropDto;
import com.betrybe.agrix.ebytr.staff.entity.Crop;
import com.betrybe.agrix.ebytr.staff.entity.Fertilizer;
import com.betrybe.agrix.ebytr.staff.service.CropService;
import com.betrybe.agrix.ebytr.staff.service.FertilizerService;
import com.betrybe.agrix.ebytr.staff.utils.Utils;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Java Type Method.
 */

@RestController
@RequestMapping(value = "/crops")
public class CropContoller {

  private final CropService cropService;
  private final FertilizerService fertilizerService;
  private Utils utils;

  @Autowired
  public CropContoller(CropService cropService, FertilizerService fertilizerService) {
    this.cropService = cropService;
    this.fertilizerService = fertilizerService;
  }

  /**
   * Resumo.
   *
   * @return - return
   */
  @GetMapping
  public List<CropDto> getAllCrops() {
    List<Crop> allCrops = cropService.getAllCrop();
    return allCrops.stream()
        .map((crop) -> new CropDto(
            crop.getId(),
            crop.getName(),
            crop.getPlantedArea(),
            crop.getPlantedDate(),
            crop.getHarvestDate(),
            crop.getFarm().getId()))
        .collect(Collectors.toList());
  }

  /**
   * Resumo.
   *
   * @param id - id.
   * @return - return.
   */
  @GetMapping("/{id}")
  public ResponseEntity<?> getCropById(@PathVariable Integer id) {
    Optional<Crop> optionalCrop = cropService.getCropById(id);

    if (optionalCrop.isEmpty()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Plantação não encontrada!");
    }
    return ResponseEntity.ok(
        CropDto.from(optionalCrop.get(), optionalCrop.get().getFarm().getId()));
  }

  /**
   * Resumo.
   *
   * @param start - start
   * @param end   - end
   * @return - return
   */
  @GetMapping("/search")
  public ResponseEntity<?> getCropsByHarvestDate(
      @RequestParam(name = "start") LocalDate start,
      @RequestParam(name = "end") LocalDate end) {
    List<Crop> allCrops = cropService.getAllCrop();
    List<CropDto> filteredCrops = allCrops.stream()
        .filter(crop -> Utils.isWithinDateRange(crop.getHarvestDate(), start, end))
        .map((crop) -> new CropDto(
            crop.getId(),
            crop.getName(),
            crop.getPlantedArea(),
            crop.getPlantedDate(),
            crop.getHarvestDate(),
            crop.getFarm().getId()))
        .collect(Collectors.toList());

    return ResponseEntity.ok(filteredCrops);
  }

  /**
   * Resumo.
   *
   * @param cropId       - cropId
   * @param fertilizerId - fertilizerId
   * @return - return
   */
  @PostMapping("/{cropId}/fertilizers/{fertilizerId}")
  public ResponseEntity<?> insertFertilizerToCrop(
      @PathVariable Integer cropId,
      @PathVariable Integer fertilizerId
  ) {

    Optional<Crop> optionalCrop = cropService.getCropById(cropId);
    Optional<Fertilizer> optionalFertilizer = fertilizerService.getFertilizerById(fertilizerId);

    if (optionalCrop.isEmpty()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Plantação não encontrada!");
    }
    if (optionalFertilizer.isEmpty()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Fertilizante não encontrado!");
    }

    Crop crop = optionalCrop.get();
    Fertilizer fertilizer = optionalFertilizer.get();

    if (!crop.getFertilizers().contains(fertilizer)) {
      crop.getFertilizers().add(fertilizer);
      cropService.insertCrop(crop);

      return ResponseEntity.status(HttpStatus.CREATED)
          .body("Fertilizante e plantação associados com sucesso!");
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body("Fertilizante já associado à plantação!");
    }
  }

  /**
   * Resumo.
   *
   * @param cropId - cropId
   * @return - return
   */
  @GetMapping("/{cropId}/fertilizers")
  public ResponseEntity<?> getCropFertilizers(@PathVariable Integer cropId) {
    Optional<Crop> optionalCrop = cropService.getCropById(cropId);

    if (optionalCrop.isEmpty()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Plantação não encontrada!");
    }

    Crop crop = optionalCrop.get();
    List<Fertilizer> fertilizers = crop.getFertilizers();

    return ResponseEntity.status(HttpStatus.OK).body(fertilizers);
  }
}
