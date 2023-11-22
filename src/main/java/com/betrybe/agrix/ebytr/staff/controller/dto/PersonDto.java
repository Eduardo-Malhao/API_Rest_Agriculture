package com.betrybe.agrix.ebytr.staff.controller.dto;

import com.betrybe.agrix.ebytr.staff.entity.Person;
import com.betrybe.agrix.ebytr.staff.security.Role;

/**
 * Resumo.
 *
 * @param username - username
 * @param password - password
 * @param role     - role
 */
public record PersonDto(String username, String password, Role role) {

  /**
   * Resumo.
   *
   * @return - return
   */
  public Person toPerson() {
    Person person = new Person();
    person.setUsername(username);
    person.setPassword(password);
    person.setRole(role);

    return person;
  }
}
