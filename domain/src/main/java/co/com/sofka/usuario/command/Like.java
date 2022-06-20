package co.com.sofka.usuario.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.usuario.values.*;

public class Like extends Command {
    private final AmountLikesSend amountLikesSend;
    private final DateLikeSend dateLikeSend;
    private final AmountLikesRecieved amountLikesRecieved;
    private final DateLikeRecived dateLikeRecived;

    public Like(AmountLikesSend amountLikesSend, DateLikeSend dateLikeSend, AmountLikesRecieved amountLikesRecieved,
                DateLikeRecived dateLikeRecived) {
        this.amountLikesSend = amountLikesSend;
        this.dateLikeSend = dateLikeSend;
        this.amountLikesRecieved = amountLikesRecieved;
        this.dateLikeRecived = dateLikeRecived;
    }

    public AmountLikesSend getAmountLikesSend() {
        return amountLikesSend;
    }

    public DateLikeSend getDateLikeSend() {
        return dateLikeSend;
    }

    public AmountLikesRecieved getAmountLikesRecieved() {
        return amountLikesRecieved;
    }

    public DateLikeRecived getDateLikeRecived() {
        return dateLikeRecived;
    }
}
