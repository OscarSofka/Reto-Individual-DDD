package co.com.sofka.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.usuario.command.ChangeCountry;
import co.com.sofka.usuario.values.*;

public class NotificationChangeCountry extends DomainEvent {
    private final GPS gps;
    private final Country country;
    private final LocalLaws localLaws;
    private final TermsAndConditions termsAndConditions;
    private final AgreementPolicy agreementPolicy;
    private final AboutUs aboutUs;


    public NotificationChangeCountry(GPS gps, Country country, LocalLaws localLaws,
                                     TermsAndConditions termsAndConditions, AgreementPolicy agreementPolicy, AboutUs aboutUs) {
        super("ChangeCountry.Notification");
        this.gps = gps;
        this.country = country;
        this.localLaws = localLaws;
        this.termsAndConditions = termsAndConditions;
        this.agreementPolicy = agreementPolicy;
        this.aboutUs = aboutUs;
    }

    public GPS getGps() {
        return gps;
    }

    public Country getCountry() {
        return country;
    }

    public LocalLaws getLocalLaws() {
        return localLaws;
    }

    public TermsAndConditions getTermsAndConditions() {
        return termsAndConditions;
    }

    public AgreementPolicy getAgreementPolicy() {
        return agreementPolicy;
    }

    public AboutUs getAboutUs() {
        return aboutUs;
    }
}
