package com.bit.web.domains;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class StadiumDTO {
    private String stadiumName,hometeamId,address,ddd,tel;
    private int seatCount;
}
