package main.java.fr.leomelki.loupgarou.events;

import main.java.fr.leomelki.loupgarou.classes.LGGame;
import main.java.fr.leomelki.loupgarou.roles.Role;
import lombok.Getter;

public class LGRoleTurnEndEvent extends LGEvent{
	public LGRoleTurnEndEvent(LGGame game, Role newRole, Role previousRole) {
		super(game);
		this.newRole = newRole;
		this.previousRole = previousRole;
	}
	
	@Getter private final Role newRole, previousRole;
}