package co.com.sofka.Account.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.usuario.command.CreateOwnerProfile;

public class CrearPerfilAmoUseCase extends UseCase<RequestCommand<CreateOwnerProfile>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateOwnerProfile> createOwnerProfileRequestCommand) {
        var command = createOwnerProfileRequestCommand.getCommand();
        var crearPerfilAmo = new CreateOwnerProfile(command.getUserNameOwner(), command.getEmail());

        emit().onResponse(new ResponseEvents(crearPerfilAmo.getUncommittedChanges()));
    }
}
