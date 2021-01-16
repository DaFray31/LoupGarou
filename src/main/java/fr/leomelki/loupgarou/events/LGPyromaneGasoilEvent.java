package main.java.fr.leomelki.loupgarou.events;

import org.bukkit.event.Cancellable;

import main.java.fr.leomelki.loupgarou.classes.LGGame;
import main.java.fr.leomelki.loupgarou.classes.LGPlayer;
import lombok.Getter;
import lombok.Setter;

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