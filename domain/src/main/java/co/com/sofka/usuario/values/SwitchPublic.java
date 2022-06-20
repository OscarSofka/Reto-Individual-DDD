package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class SwitchPublic implements ValueObject<SwitchPublic> {
    private final SwitchPublic switchPublicValue;

    public SwitchPublic(SwitchPublic switchPublicValue) {
        this.switchPublicValue = switchPublicValue;
    }

    @Override
    public SwitchPublic value() {
        return null;
    }
}
