package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class PetAge implements ValueObject<PetAge> {
    private final PetAge petAgeValue;

    public PetAge(PetAge petAgeValue) {
        this.petAgeValue = petAgeValue;
    }

    @Override
    public PetAge value() {
        return null;
    }
}
