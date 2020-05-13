package com.bit.web.domains;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class ScheduleDTO {
 private String scheDate,stadiumId,gubun,hometeamId,awayteamId;
  private int   homeScore,awayScore;
}
