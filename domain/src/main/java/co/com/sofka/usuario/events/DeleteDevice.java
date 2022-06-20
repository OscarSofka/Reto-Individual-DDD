package co.com.sofka.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.usuario.values.DeviceName;
import co.com.sofka.usuario.values.DeviceOS;
import co.com.sofka.usuario.values.DeviceType;

public class DeleteDevice extends DomainEvent {
    private final DeviceName deviceName;
    private final DeviceOS deviceOS;
    private final DeviceType deviceType;

    public DeleteDevice(DeviceName deviceName, DeviceOS deviceOS, DeviceType deviceType) {
        super("DeleteDevice.Notification");
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
