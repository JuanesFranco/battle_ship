package co.edu.umanizales.battle_ship.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GenericResponse {
    private int code;
    private Object data;
    private String errors;
}