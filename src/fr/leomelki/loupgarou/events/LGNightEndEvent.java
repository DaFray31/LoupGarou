package fr.leomelki.loupgarou.events;

import lombok.Getter;
import lombok.Setter;
import fr.leomelki.loupgarou.classes.LGGame;
import org.bukkit.event.Cancellable;

public class LGNightEndEvent extends LGEvent implements Cancellable{
	public LGNightEndEvent(LGGame game) {
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