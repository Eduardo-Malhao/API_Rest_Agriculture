package com.betrybe.agrix.ebytr.staff.controller.dto;

import com.betrybe.agrix.ebytr.staff.entity.Person;
import com.betrybe.agrix.ebytr.staff.security.Role;

public record FromPersonDto(Long id, String username, Role role) {

  public static FromPersonDto from(Person person) {
    return new FromPersonDto(
        person.getId(),
        person.getUsername(),
        person.getRole()
    );
  }
}

