package main.java.fr.leomelki.loupgarou.events;

import org.bukkit.event.Cancellable;

import main.java.fr.leomelki.loupgarou.classes.LGGame;
import lombok.Getter;
import lombok.Setter;

public class LGPreDayStartEvent extends LGEvent implements Cancellable{
	public LGPreDayStartEvent(LGGame game) {
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