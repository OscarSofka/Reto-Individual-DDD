package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class Specie implements ValueObject<Specie> {
    private final Specie specievalue;

    public Specie(Specie specievalue) {
        this.specievalue = specievalue;
    }

    @Override
    public Specie value() {
        return null;
    }
}
