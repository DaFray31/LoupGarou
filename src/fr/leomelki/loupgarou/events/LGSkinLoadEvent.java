package fr.leomelki.loupgarou.events;

import com.comphenix.protocol.wrappers.WrappedGameProfile;
import lombok.Getter;
import lombok.Setter;
import fr.leomelki.loupgarou.classes.LGGame;
import fr.leomelki.loupgarou.classes.LGPlayer;

public class LGSkinLoadEvent extends LGEvent {

	@Getter private final LGPlayer player, to;
	@Getter @Setter private WrappedGameProfile profile;
	public LGSkinLoadEvent(LGGame game, LGPlayer player, LGPlayer to, WrappedGameProfile profile) {
		super(game);
		this.player = player;
		this.to = to;
		this.profile = profile;
	}

}
