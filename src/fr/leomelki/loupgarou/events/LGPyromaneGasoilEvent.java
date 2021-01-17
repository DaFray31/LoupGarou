package fr.leomelki.loupgarou.events;

import lombok.Getter;
import lombok.Setter;
import fr.leomelki.loupgarou.classes.LGGame;
import fr.leomelki.loupgarou.classes.LGPlayer;
import org.bukkit.event.Cancellable;

public class LGPyromaneGasoilEvent extends LGEvent implements Cancellable{
	public LGPyromaneGasoilEvent(LGGame game, LGPlayer player) {
		super(game);
		this.player = player;
	}
	
	@Getter @Setter private boolean cancelled;
	@Getter @Setter private LGPlayer player;

	@Override
	public boolean isCancelled() {
		return false;
	}

	@Override
	public void setCancelled(boolean b) {

	}
}