package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class GPS implements ValueObject<GPS> {
    private final GPS gpsValue;

    public GPS(GPS gpsValue) {
        this.gpsValue = gpsValue;
    }

    @Override
    public GPS value() {
        return null;
    }
}
