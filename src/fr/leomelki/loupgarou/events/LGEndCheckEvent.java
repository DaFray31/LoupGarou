package fr.leomelki.loupgarou.events;

import lombok.Getter;
import lombok.Setter;
import fr.leomelki.loupgarou.classes.LGGame;
import fr.leomelki.loupgarou.classes.LGWinType;

public class LGEndCheckEvent extends LGEvent{
	public LGEndCheckEvent(LGGame game, LGWinType winType) {
		super(game);
		this.winType = winType;
	}

	@Getter @Setter private LGWinType winType;
}