package co.com.sofka.usuario.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.usuario.values.DeviceName;
import co.com.sofka.usuario.values.DeviceOS;
import co.com.sofka.usuario.values.DeviceType;

public class NewDevice extends Command {
    private final DeviceName deviceName;
    private final DeviceOS deviceOS;
    private final DeviceType deviceType;

    public NewDevice(DeviceName deviceName, DeviceOS deviceOS, DeviceType deviceType) {
        this.deviceName = deviceName;
        this.deviceOS = deviceOS;
        this.deviceType = deviceType;
    }

    public DeviceName getDeviceName() {
        return deviceName;
    }

    public DeviceOS getDeviceOS() {
        return deviceOS;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }
}
