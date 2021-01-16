package main.java.fr.leomelki.loupgarou.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import main.java.fr.leomelki.loupgarou.classes.LGGame;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LGEvent extends Event{
	@Getter final LGGame game;
	
    private static final HandlerList handlers = new HandlerList();

	public LGEvent(LGGame game) {
		this.game = game;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
    public static HandlerList getHandlerList() {
        return handlers;
    }

	public LGGame getGame() {
		return game;
	}
}
