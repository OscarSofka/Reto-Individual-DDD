package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class Country implements ValueObject<Country> {
    private final Country countryValue;

    public Country(Country countryValue) {
        this.countryValue = countryValue;
    }

    @Override
    public Country value() {
        return null;
    }
}
