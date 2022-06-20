package co.com.sofka.Account.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.usuario.command.ChangeCountry;
import co.com.sofka.usuario.events.NotificationChangeCountry;

public class CambiarDePaisAutomaticamente extends UseCase<TriggeredEvent<NotificationChangeCountry>, ResponseEvents> {


    @Override
    public void executeUseCase(TriggeredEvent<NotificationChangeCountry> changeCountryTriggeredEvent) {
        var evento = changeCountryTriggeredEvent.getDomainEvent();
        var cambiarDePaisAutomaticamente = new NotificationChangeCountry(evento.getGps(), evento.getCountry(),
                evento.getLocalLaws(), evento.getTermsAndConditions(), evento.getAgreementPolicy(), evento.getAboutUs());

        emit().onResponse(new ResponseEvents(cambiarDePaisAutomaticamente.getUncommittedChanges()));
    }
}
