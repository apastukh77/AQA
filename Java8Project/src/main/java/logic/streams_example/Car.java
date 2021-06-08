package logic.streams_example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private String vendor;
    private String model;
    private double engineV;
    private TransmissionsType transmission;
    private double maxSpead;
    private double timeTo100;

}
