package com.betrybe.agrix.ebytr.staff.models.utils;

import java.time.LocalDate;

/**
 * Java Doc Method.
 */
public class Utils {

  public static boolean isWithinDateRange(LocalDate dateToCheck, LocalDate start, LocalDate end) {
    return !dateToCheck.isBefore(start) && !dateToCheck.isAfter(end);
  }
}
