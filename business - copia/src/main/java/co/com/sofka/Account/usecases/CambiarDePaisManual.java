package co.com.sofka.Account.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.usuario.command.ChangeCountry;

public class CambiarDePaisManual extends UseCase<RequestCommand<ChangeCountry>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<ChangeCountry> changeCountryRequestCommand) {
        var command = changeCountryRequestCommand.getCommand();
        var CambiarDePaisManual = new ChangeCountry(command.getCountry(), command.getGps());

        emit().onResponse(new ResponseEvents(CambiarDePaisManual.getUncommittedChanges()));
    }
}
