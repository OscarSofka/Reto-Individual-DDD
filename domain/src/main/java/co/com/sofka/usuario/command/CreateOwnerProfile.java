package co.com.sofka.usuario.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.usuario.values.*;

public class CreateOwnerProfile extends Command {
    private final UserNameOwner userNameOwner;
    private final Email email;


    public CreateOwnerProfile(UserNameOwner userNameOwner, Email email) {
        this.userNameOwner = userNameOwner;
        this.email = email;
    }

    public UserNameOwner getUserNameOwner() {
        return userNameOwner;
    }

    public Email getEmail() {
        return email;
    }
}
