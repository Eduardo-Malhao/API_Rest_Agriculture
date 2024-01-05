package dto;

import entity.Crop;
import java.time.LocalDate;

/**
 * Java Type Method.
 *
 * @param id          - id
 * @param name        - nome
 * @param plantedArea - tamanho
 * @param farmId      - farmid
 * @param plantedDate - data
 * @param harvestDate - data
 */
public record CropDto(
    int id,
    String name,
    Double plantedArea,
    LocalDate plantedDate,
    LocalDate harvestDate,
    int farmId
) {

  /**
   * Resumo.
   *
   * @param crop   - crop
   * @param farmId - farmId
   * @return - return
   */
  public static CropDto from(Crop crop, Integer farmId) {
    return new CropDto(
        crop.getId(),
        crop.getName(),
        crop.getPlantedArea(),
        crop.getPlantedDate(),
        crop.getHarvestDate(),
        farmId
    );
  }

  /**
   * Resumo.
   *
   * @param cropDto - dto
   * @return - return
   */
  public static Crop to(CropDto cropDto) {
    Crop toCrop = new Crop();
    toCrop.setName(cropDto.name);
    toCrop.setPlantedArea(cropDto.plantedArea);
    toCrop.setPlantedDate(cropDto.plantedDate);
    toCrop.setHarvestDate(cropDto.harvestDate);

    return toCrop;
  }
}

