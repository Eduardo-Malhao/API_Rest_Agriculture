package controller;

import dto.FromPersonDto;
import dto.PersonDto;
import entity.Person;
import service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Java Doc Method.
 */
@RestController
@RequestMapping(value = "/persons")
public class PersonController {

  private final PersonService personService;

  @Autowired
  public PersonController(PersonService personService) {
    this.personService = personService;
  }

  /**
   * Resumo.
   *
   * @param personDto - personDto
   * @return - return
   */
  @PostMapping
  public ResponseEntity<?> create(@RequestBody PersonDto personDto) {

    Person newPerson = personService.create(personDto.toPerson());
    FromPersonDto response = FromPersonDto.from(newPerson);

    return ResponseEntity.status(HttpStatus.CREATED).body(response);
  }
}
