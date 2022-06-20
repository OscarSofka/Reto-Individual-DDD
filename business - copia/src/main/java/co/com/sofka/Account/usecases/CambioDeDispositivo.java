package co.com.sofka.Account.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.usuario.events.DeleteDevice;

public class CambioDeDispositivo extends UseCase<TriggeredEvent<DeleteDevice>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<DeleteDevice> deleteDeviceTriggeredEvent) {
        var evento = deleteDeviceTriggeredEvent.getDomainEvent();
        var cambioDeDispositivo = new DeleteDevice(evento.getDeviceName(),evento.getDeviceOS(),
                evento.getDeviceType());
        emit().onResponse(new ResponseEvents(cambioDeDispositivo.getUncommittedChanges()));
    }
}
