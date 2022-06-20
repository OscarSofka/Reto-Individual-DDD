package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class Identification implements ValueObject<Identification> {
    private final Identification identificationValue;

    public Identification(Identification identificationValue) {
        this.identificationValue = identificationValue;
    }

    @Override
    public Identification value() {
        return null;
    }
}
