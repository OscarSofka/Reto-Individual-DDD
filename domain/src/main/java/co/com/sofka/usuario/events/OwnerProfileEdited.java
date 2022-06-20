package co.com.sofka.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.usuario.values.*;

public class OwnerProfileEdited extends DomainEvent {
    private final UserNameOwner userNameOwner;
    private final Email email;
    private final Identification identification;
    private final TermsAndConditions termsAndConditions;


    public OwnerProfileEdited(UserNameOwner userNameOwner, Email email, Identification identification,
                              TermsAndConditions termsAndConditions) {
        super("Profile.Edited");
        this.userNameOwner = userNameOwner;
        this.email = email;
        this.identification = identification;
        this.termsAndConditions = termsAndConditions;
    }

    public UserNameOwner getUserNameOwner() {
        return userNameOwner;
    }

    public Email getEmail() {
        return email;
    }

    public Identification getIdentification() {
        return identification;
    }

    public TermsAndConditions getTermsAndConditions() {
        return termsAndConditions;
    }
}
