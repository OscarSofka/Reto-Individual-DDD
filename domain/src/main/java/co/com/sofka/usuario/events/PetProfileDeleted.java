package co.com.sofka.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.usuario.values.PetAge;
import co.com.sofka.usuario.values.Specie;
import co.com.sofka.usuario.values.TermsAndConditions;
import co.com.sofka.usuario.values.UserNamePet;

public class PetProfileDeleted extends DomainEvent {
    private final UserNamePet userNamePet;
    private final Specie specie;
    private final PetAge petAge;
    private final TermsAndConditions termsAndConditions;

    public PetProfileDeleted(UserNamePet userNamePet, Specie specie, PetAge petAge,
                             TermsAndConditions termsAndConditions) {
        super("PetProfile.Deleted");
        this.userNamePet = userNamePet;
        this.specie = specie;
        this.petAge = petAge;
        this.termsAndConditions = termsAndConditions;
    }

    public UserNamePet getUserNamePet() {
        return userNamePet;
    }

    public Specie getSpecie() {
        return specie;
    }

    public PetAge getPetAge() {
        return petAge;
    }

    public TermsAndConditions getTermsAndConditions() {
        return termsAndConditions;
    }
}
