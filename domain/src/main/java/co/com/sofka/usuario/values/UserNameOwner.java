package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class UserNameOwner implements ValueObject<UserNameOwner> {
    private final UserNameOwner userNameOwnerValue;

    public UserNameOwner(UserNameOwner userNameOwnerValue) {
        this.userNameOwnerValue = userNameOwnerValue;
    }

    @Override
    public UserNameOwner value() {
        return null;
    }
}
