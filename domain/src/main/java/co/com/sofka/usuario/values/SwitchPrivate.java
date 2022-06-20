package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class SwitchPrivate implements ValueObject<SwitchPrivate> {
    private final SwitchPrivate switchPrivateValue;

    public SwitchPrivate(SwitchPrivate switchPrivateValue) {
        this.switchPrivateValue = switchPrivateValue;
    }

    @Override
    public SwitchPrivate value() {
        return null;
    }
}
