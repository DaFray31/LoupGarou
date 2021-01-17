package fr.leomelki.loupgarou.events;

import fr.leomelki.loupgarou.classes.LGGame;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@RequiredArgsConstructor
public class LGEvent extends Event{
	@Getter final LGGame game;
	
    private static final HandlerList handlers = new HandlerList();

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
