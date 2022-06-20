package co.com.sofka.usuario.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.usuario.values.PetAge;
import co.com.sofka.usuario.values.Specie;
import co.com.sofka.usuario.values.UserNamePet;

public class DeletePetProfile extends Command {
    private final UserNamePet userNamePet;
    private final Specie specie;
    private final PetAge petAge;


    public DeletePetProfile(UserNamePet userNamePet, Specie specie, PetAge petAge) {
        this.userNamePet = userNamePet;
        this.specie = specie;
        this.petAge = petAge;
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
}
