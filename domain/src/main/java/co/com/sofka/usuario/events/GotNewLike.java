package co.com.sofka.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.usuario.command.Like;

public class GotNewLike extends DomainEvent {
    private final Like like;

    public GotNewLike(Like like) {
        super("NewLike.Notification");
        this.like = like;
    }

    public Like getLike() {
        return like;
    }
}
