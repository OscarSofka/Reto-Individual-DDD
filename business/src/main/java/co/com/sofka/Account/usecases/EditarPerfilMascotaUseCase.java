package co.com.sofka.Account.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.usuario.command.EditPetProfile;
import co.com.sofka.usuario.values.UserNamePet;

public class EditarPerfilMascotaUseCase extends UseCase<RequestCommand<EditPetProfile>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<EditPetProfile> editPetProfileRequestCommand) {
        var command = editPetProfileRequestCommand.getCommand();
        var editarPerfilMascota = new EditPetProfile(command.getUserNamePet(),command.getSpecie(),
                command.getPetAge());
        emit().onResponse(new ResponseEvents(editarPerfilMascota.getUncommittedChanges()));
    }
}
