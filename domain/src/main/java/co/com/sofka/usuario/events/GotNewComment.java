package co.com.sofka.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.usuario.command.Comment;

public class GotNewComment extends DomainEvent {
    private final Comment comment;


    public GotNewComment(Comment comment) {
        super("NewComment.Notification");
        this.comment = comment;
    }
}
