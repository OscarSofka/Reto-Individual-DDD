package co.com.sofka.usuario.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.usuario.values.AmmountCommentRecieved;
import co.com.sofka.usuario.values.AmountCommentSend;
import co.com.sofka.usuario.values.DateCommentRecieved;
import co.com.sofka.usuario.values.DateCommentSend;

public class Comment extends Command {
    private final AmountCommentSend amountCommentSend;
    private final DateCommentSend dateCommentSend;
    private final AmmountCommentRecieved ammountCommentRecieved;
    private final DateCommentRecieved dateCommentRecieved;

    public Comment(AmountCommentSend amountCommentSend, DateCommentSend dateCommentSend,
                   AmmountCommentRecieved ammountCommentRecieved, DateCommentRecieved dateCommentRecieved) {
        this.amountCommentSend = amountCommentSend;
        this.dateCommentSend = dateCommentSend;
        this.ammountCommentRecieved = ammountCommentRecieved;
        this.dateCommentRecieved = dateCommentRecieved;
    }
}
