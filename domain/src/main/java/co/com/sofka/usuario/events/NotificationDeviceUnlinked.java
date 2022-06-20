package co.com.sofka.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.usuario.command.UnlinkDevice;
import co.com.sofka.usuario.values.LocalLaws;

public class NotificationDeviceUnlinked extends DomainEvent {
    private final UnlinkDevice unlinkDevice;
    private final LocalLaws localLaws;

    public NotificationDeviceUnlinked(UnlinkDevice unlinkDevice, LocalLaws localLaws) {
        super("UnlinkedDevice.Notification");
        this.unlinkDevice = unlinkDevice;
        this.localLaws = localLaws;
    }
}
