package com.betrybe.agrix.ebytr.staff.controller.dto;

/**
 * Java Type Method.
 *
 * @param message -menssagem
 * @param <T>     - generico
 */

public record ResponseDto<T>(String message, T data) {

}
