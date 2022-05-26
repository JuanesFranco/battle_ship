package co.edu.umanizales.battle_ship.model;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class PlayerDTO {
    @NotNull
    @Min(1)
    @Max(2)
    private byte numPlayer;
    @Valid
    @NotNull
    private User player;
}