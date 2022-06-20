package co.com.sofka.Account.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.usuario.command.UnlinkDevice;
import co.com.sofka.usuario.events.DeleteDevice;

public class BorrarDispositivoAntiguo extends UseCase<RequestCommand<UnlinkDevice>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<UnlinkDevice> unlinkDeviceRequestCommand) {
        var command = unlinkDeviceRequestCommand.getCommand();
        var BorrarDispositivo = new UnlinkDevice(command.getDeviceName(),command.getDeviceOS(),
                command.getDeviceType());
        emit().onResponse(new ResponseEvents(BorrarDispositivo.getUncommittedChanges));
    }
}
