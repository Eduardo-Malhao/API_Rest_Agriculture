package com.betrybe.agrix.ebytr.staff.models.controllers.dto;

/**
 * Java Type Method.
 *
 * @param message -menssagem
 * @param <T>     - generico
 */

public record ResponseDto<T>(String message, T data) {

}
