package fr.leomelki.loupgarou.events;

import fr.leomelki.loupgarou.classes.LGGame;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.Cancellable;

public class LGMayorVoteEvent extends LGEvent implements Cancellable{
	public LGMayorVoteEvent(LGGame game) {
		super(game);
	}

	@Getter @Setter private boolean cancelled;

	@Override
	public boolean isCancelled() {
		return false;
	}

	@Override
	public void setCancelled(boolean b) {

	}
}
