package fr.leomelki.loupgarou.events;

import lombok.Getter;
import fr.leomelki.loupgarou.classes.LGGame;
import fr.leomelki.loupgarou.classes.LGPlayer;

public class LGGameJoinEvent extends LGEvent{
	public LGGameJoinEvent(LGGame game, LGPlayer player) {
		super(game);
		this.player = player;
	}

	@Getter LGPlayer player;
}
