package main.java.fr.leomelki.loupgarou.events;

import lombok.Getter;
import lombok.Setter;
import main.java.fr.leomelki.loupgarou.classes.LGGame;
import main.java.fr.leomelki.loupgarou.classes.LGPlayer;

public class LGVampiredEvent extends LGEvent{
	public LGVampiredEvent(LGGame game, LGPlayer player) {
		super(game);
		this.player = player;
	}
	
	@Getter @Setter private boolean immuned, protect;
	@Getter @Setter private LGPlayer player;
}