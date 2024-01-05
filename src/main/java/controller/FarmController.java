package controller;

import dto.CropDto;
import dto.FarmDto;
import entity.Crop;
import entity.Farm;
import service.FarmService;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Java Type Method.
 */
@RestController
@RequestMapping("/farms")
public class FarmController {

  private final FarmService farmService;

  @Autowired
  public FarmController(FarmService farmService) {
    this.farmService = farmService;
  }

  /**
   * Resumo.
   *
   * @return - return
   */
  @GetMapping
  @Secured({"ROLE_USER", "ROLE_MANAGER", "ROLE_ADMIN"})
  public List<Farm> getAllFarms() {
    return farmService.getAllFarms();
  }

  /**
   * Resumo.
   *
   * @param farmDto - dto
   * @return - return
   */
  @PostMapping
  public ResponseEntity<Farm> insertFarm(@RequestBody FarmDto farmDto) {
    Farm newFarm = farmService.insertFarm(FarmDto.toFarm(farmDto));

    return ResponseEntity.status(HttpStatus.CREATED).body(newFarm);
  }

  /**
   * Resumo.
   *
   * @param id      - id
   * @param cropDto - dto
   * @return - return
   */
  @PostMapping("/{id}/crops")
  public ResponseEntity<?> insertCrops(
      @PathVariable Integer id,
      @RequestBody CropDto cropDto) {
    Crop crop;

    if (farmService.getFarmById(id).isEmpty()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Fazenda não encontrada!");
    }

    Crop newCrop = farmService.insertCrops(CropDto.to(cropDto), id);

    return ResponseEntity.status(HttpStatus.CREATED).body(CropDto.from(newCrop, id));
  }

  /**
   * Resumo.
   *
   * @param id - id
   * @return - return
   */
  @GetMapping("/{id}/crops")
  public ResponseEntity<?> getCrops(@PathVariable Integer id) {
    Optional<Farm> optionalFarm = farmService.getFarmById(id);

    if (optionalFarm.isEmpty()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Fazenda não encontrada!");
    }

    Farm farm = optionalFarm.get();
    List<Crop> crops = farm.getCrops();

    List<CropDto> cropDtos = crops.stream()
        .map(crop -> CropDto.from(crop, id))
        .collect(Collectors.toList());

    return ResponseEntity.status(HttpStatus.OK).body(cropDtos);
  }
}
