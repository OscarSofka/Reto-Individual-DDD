package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class UserNamePet implements ValueObject<UserNamePet> {
    private final UserNamePet NamePetValue;

    public UserNamePet(UserNamePet NamePetValue) {
        this.NamePetValue = NamePetValue;
    }

    @Override
    public UserNamePet value() {
        return null;
    }
}
