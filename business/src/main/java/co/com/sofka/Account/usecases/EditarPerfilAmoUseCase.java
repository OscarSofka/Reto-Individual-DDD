package co.com.sofka.Account.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.usuario.command.EditOwnerProfile;
import co.com.sofka.usuario.events.OwnerProfileEdited;

public class EditarPerfilAmoUseCase extends UseCase<RequestCommand<EditOwnerProfile>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<EditOwnerProfile> ownerProfileEditedRequestCommand) {
        var command = ownerProfileEditedRequestCommand.getCommand();
        var editarPerfil = new EditOwnerProfile(command.getUserNameOwner(),command.getEmail());

        emit().onResponse(new ResponseEvents(editarPerfil.getUncommittedChanges()));
    }
}
