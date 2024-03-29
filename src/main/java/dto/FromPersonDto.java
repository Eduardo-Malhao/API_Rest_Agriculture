package dto;

import entity.Person;
import security.Role;

/**
 * Resumo.
 *
 * @param id       - id
 * @param username - username
 * @param role     - role
 */
public record FromPersonDto(Long id, String username, Role role) {

  /**
   * Resumo.
   *
   * @param person - person
   * @return - return
   */
  public static FromPersonDto from(Person person) {
    return new FromPersonDto(
        person.getId(),
        person.getUsername(),
        person.getRole()
    );
  }
}

