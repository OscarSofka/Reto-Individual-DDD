package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class DeviceOS implements ValueObject<DeviceOS> {
    private final DeviceOS deviceOSValue;

    public DeviceOS(DeviceOS deviceOSValue) {
        this.deviceOSValue = deviceOSValue;
    }

    @Override
    public DeviceOS value() {
        return null;
    }
}
