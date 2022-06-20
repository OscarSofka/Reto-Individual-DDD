package co.com.sofka.Account.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.usuario.command.DeleteOwnerProfile;

public class BorrarPerfilAmoUseCase extends UseCase<RequestCommand<DeleteOwnerProfile>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<DeleteOwnerProfile> deleteOwnerProfileRequestCommand) {
        var command = deleteOwnerProfileRequestCommand.getCommand();
        var borrarPerfilAmo = new DeleteOwnerProfile(command.getUserNameOwner(),command.getEmail());

        emit().onResponse(new ResponseEvents(borrarPerfilAmo.getUncommittedChanges()));
    }
}
