package fr.leomelki.loupgarou.events;

import lombok.Getter;
import lombok.Setter;
import fr.leomelki.loupgarou.classes.LGGame;
import fr.leomelki.loupgarou.classes.LGPlayer;
import fr.leomelki.loupgarou.events.LGPlayerKilledEvent.Reason;
import org.bukkit.event.Cancellable;

public class LGNightPlayerPreKilledEvent extends LGEvent implements Cancellable{
	public LGNightPlayerPreKilledEvent(LGGame game, LGPlayer killed, Reason reason) {
		super(game);
		this.killed = killed;
		this.reason = reason;
	}

	@Getter @Setter boolean cancelled;
    
    @Getter private final LGPlayer killed;
    @Getter @Setter private Reason reason;

	@Override
	public boolean isCancelled() {
		return false;
	}

	@Override
	public void setCancelled(boolean b) {

	}
}
