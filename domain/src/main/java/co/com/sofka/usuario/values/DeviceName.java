package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class DeviceName implements ValueObject<DeviceName> {
    private final DeviceName deviceNameValue;

    public DeviceName(DeviceName deviceNameValue) {
        this.deviceNameValue = deviceNameValue;
    }

    @Override
    public DeviceName value() {
        return null;
    }
}
