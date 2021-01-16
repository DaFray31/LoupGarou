package main.java.fr.leomelki.loupgarou.events;

import main.java.fr.leomelki.loupgarou.classes.LGGame;
import main.java.fr.leomelki.loupgarou.classes.LGPlayer;
import lombok.Getter;

public class LGGameJoinEvent extends LGEvent{
	public LGGameJoinEvent(LGGame game, LGPlayer player) {
		super(game);
		this.player = player;
	}

	@Getter LGPlayer player;
}
