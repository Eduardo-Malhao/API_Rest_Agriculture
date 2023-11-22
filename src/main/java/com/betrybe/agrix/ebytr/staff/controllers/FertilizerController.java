package com.betrybe.agrix.ebytr.staff.controllers;

import com.betrybe.agrix.ebytr.staff.entity.Fertilizer;
import com.betrybe.agrix.ebytr.staff.service.FertilizerService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Java Doc Method.
 */
@RestController
@RequestMapping("/fertilizers")
public class FertilizerController {

  private final FertilizerService fertilizerService;

  @Autowired
  private FertilizerController(FertilizerService fertilizerService) {
    this.fertilizerService = fertilizerService;
  }

  /**
   * Resumo.
   *
   * @param fertilizer - fertilizer
   * @return - return
   */
  @PostMapping
  public ResponseEntity<?> insertFertilizer(@RequestBody Fertilizer fertilizer) {
    Fertilizer response = fertilizerService.insertFertilizer(fertilizer);

    return ResponseEntity.status(HttpStatus.CREATED).body(response);
  }

  /**
   * Resumo.
   *
   * @return - return
   */
  @GetMapping
  public ResponseEntity<?> getAllFertilizers() {
    List<Fertilizer> response = fertilizerService.getAllFertilizers();

    return ResponseEntity.status(HttpStatus.OK).body(response);
  }

  /**
   * Resumo.
   *
   * @param id - id
   * @return - return
   */
  @GetMapping("/{id}")
  public ResponseEntity<?> getFertilizerById(@PathVariable Integer id) {
    Optional<Fertilizer> response = fertilizerService.getFertilizerById(id);

    if (response.isEmpty()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Fertilizante não encontrado!");
    }

    return ResponseEntity.status(HttpStatus.OK).body(response);
  }
}
