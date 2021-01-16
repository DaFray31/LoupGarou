package main.java.fr.leomelki.loupgarou.events;

import lombok.Getter;
import lombok.Setter;
import main.java.fr.leomelki.loupgarou.classes.LGGame;
import main.java.fr.leomelki.loupgarou.classes.LGPlayer;
import main.java.fr.leomelki.loupgarou.classes.LGWinType;
import org.bukkit.event.Cancellable;

import java.util.List;

public class LGGameEndEvent extends LGEvent implements Cancellable{
	@Getter @Setter private boolean cancelled;
	@Getter private final LGWinType winType;
	@Getter private final List<LGPlayer> winners;
	public LGGameEndEvent(LGGame game, LGWinType winType, List<LGPlayer> winners) {
		super(game);
		this.winType = winType;
		this.winners = winners;
	}

	@Override
	public boolean isCancelled() {
		return false;
	}

	@Override
	public void setCancelled(boolean b) {

	}
}