package co.com.sofka.usuario.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.usuario.values.Email;
import co.com.sofka.usuario.values.UserNameOwner;

public class EditOwnerProfile extends Command {
    private final UserNameOwner userNameOwner;
    private final Email email;

    public EditOwnerProfile(UserNameOwner userNameOwner, Email email) {
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
