package fr.leomelki.loupgarou.events;

import lombok.Getter;
import fr.leomelki.loupgarou.classes.LGGame;
import fr.leomelki.loupgarou.roles.Role;

public class LGRoleTurnEndEvent extends LGEvent{
	public LGRoleTurnEndEvent(LGGame game, Role newRole, Role previousRole) {
		super(game);
		this.newRole = newRole;
		this.previousRole = previousRole;
	}
	
	@Getter private final Role newRole, previousRole;
}