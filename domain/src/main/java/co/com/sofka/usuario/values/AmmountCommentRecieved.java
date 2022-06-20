package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class AmmountCommentRecieved implements ValueObject<AmmountCommentRecieved> {
    private final AmmountCommentRecieved ammountCommentRecievedValue;

    public AmmountCommentRecieved(AmmountCommentRecieved ammountCommentRecievedValue) {
        this.ammountCommentRecievedValue = ammountCommentRecievedValue;
    }


    @Override
    public AmmountCommentRecieved value() {
        return null;
    }
}
