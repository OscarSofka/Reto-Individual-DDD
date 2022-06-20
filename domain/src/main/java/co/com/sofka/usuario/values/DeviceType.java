package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class DeviceType implements ValueObject<DeviceType> {
    private final DeviceType deviceTypeValue;

    public DeviceType(DeviceType deviceTypeValue) {
        this.deviceTypeValue = deviceTypeValue;
    }

    @Override
    public DeviceType value() {
        return null;
    }
}
