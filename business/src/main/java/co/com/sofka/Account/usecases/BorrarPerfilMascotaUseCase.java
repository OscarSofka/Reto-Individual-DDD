package co.com.sofka.Account.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.usuario.command.DeletePetProfile;

public class BorrarPerfilMascotaUseCase extends UseCase<RequestCommand<DeletePetProfile>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<DeletePetProfile> deletePetProfileRequestCommand) {
        var command = deletePetProfileRequestCommand.getCommand();
        var borrrarPerfilMascota = new DeletePetProfile(command.getUserNamePet(), command.getSpecie(),
                command.getPetAge());
        emit().onResponse(new ResponseEvents(borrrarPerfilMascota.getUncommittedChanges()));
    }
}
