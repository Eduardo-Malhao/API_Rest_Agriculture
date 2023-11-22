package com.betrybe.agrix.ebytr.staff.models.controllers.dto;

import com.betrybe.agrix.ebytr.staff.models.entities.Farm;

/**
 * Java Type Method.
 *
 * @param name - name
 * @param size - tamanho
 */

public record FarmDto(String name, Double size) {

  /**
   * Resumo.
   *
   * @param farmDto - dto
   * @return - return
   */

  public static Farm toFarm(FarmDto farmDto) {
    return new Farm(
        farmDto.name(),
        farmDto.size()
    );
  }
}
