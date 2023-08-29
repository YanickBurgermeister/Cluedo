package ch.bbw.yb.cluedo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Room {
    private String name;
    private String size;
    private Colors color;
    private String characteristic;
}
