package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class OwnerAge implements ValueObject<OwnerAge> {
    private final OwnerAge ownerAgeValue;

    public OwnerAge(OwnerAge ownerAgeValue) {
        this.ownerAgeValue = ownerAgeValue;
    }

    @Override
    public OwnerAge value() {
        return null;
    }
}
