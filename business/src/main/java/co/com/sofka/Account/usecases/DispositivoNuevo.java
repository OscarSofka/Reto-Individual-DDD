package co.com.sofka.Account.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.usuario.command.NewDevice;

public class DispositivoNuevo extends UseCase<RequestCommand<NewDevice>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<NewDevice> newDeviceRequestCommand) {
        var command = newDeviceRequestCommand.getCommand();
        var dispositivoNuevo = new NewDevice(command.getDeviceName(), command.getDeviceOS(),
                command.getDeviceType());
        emit().onResponse(new ResponseEvents(dispositivoNuevo.getUncommittedChanges()));
    }
}
