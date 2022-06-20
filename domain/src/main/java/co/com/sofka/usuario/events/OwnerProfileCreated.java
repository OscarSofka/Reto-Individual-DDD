package co.com.sofka.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.usuario.values.*;

public class OwnerProfileCreated extends DomainEvent {
    private final UserNameOwner userNameOwner;
    private final Email email;
    private final Identification identification;
    private final OwnerAge ownerAge;
    private final TermsAndConditions termsAndConditions;
    private final FAQ faq;

    public OwnerProfileCreated(UserNameOwner userNameOwner, Email email, Identification identification,
                               OwnerAge ownerAge, TermsAndConditions termsAndConditions, FAQ faq) {
        super("Profile.Created");
        this.userNameOwner = userNameOwner;
        this.email = email;
        this.identification = identification;
        this.ownerAge = ownerAge;
        this.termsAndConditions = termsAndConditions;
        this.faq = faq;
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

    public FAQ getFaq() {
        return faq;
    }
}
