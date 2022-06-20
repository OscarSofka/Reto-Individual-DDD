package co.com.sofka.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.usuario.command.NewDevice;
import co.com.sofka.usuario.values.*;

public class NotificationNewDevice extends DomainEvent {
    private final NewDevice newDevice;
    private final GPS gps;
    private final LocalLaws localLaws;


    public NotificationNewDevice(NewDevice newDevice, GPS gps, LocalLaws localLaws) {
        super("NewDevice.Notification");
        this.newDevice = newDevice;
        this.gps = gps;
        this.localLaws = localLaws;
    }
}
