package co.com.sofka.Account.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.usuario.command.Like;
import co.com.sofka.usuario.values.DateLikeSend;

public class TienesUnLike extends UseCase<RequestCommand<Like>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<Like> likeRequestCommand) {
        var command = likeRequestCommand.getCommand();
        var tienesLike = new Like(command.getAmountLikesSend(), command.getDateLikeSend(), command.getAmountLikesRecieved(),
                command.getDateLikeRecived());

        emit().onResponse(new ResponseEvents(tienesLike.GetUncommittedChanges()));
    }
}
