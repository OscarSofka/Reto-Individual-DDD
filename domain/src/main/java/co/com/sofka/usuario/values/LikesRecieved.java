package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.usuario.command.Like;

public class LikesRecieved implements ValueObject<Like> {
    private final LikesRecieved likesRecievedValue;

    public LikesRecieved(LikesRecieved likesRecievedValue) {
        this.likesRecievedValue = likesRecievedValue;
    }

    @Override
    public Like value() {
        return null;
    }
}
