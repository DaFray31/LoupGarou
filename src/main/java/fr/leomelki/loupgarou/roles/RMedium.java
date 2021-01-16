package main.java.fr.leomelki.loupgarou.roles;

import org.bukkit.event.EventHandler;

import main.java.fr.leomelki.loupgarou.classes.LGGame;
import main.java.fr.leomelki.loupgarou.classes.LGPlayer;
import main.java.fr.leomelki.loupgarou.classes.chat.LGChat;
import main.java.fr.leomelki.loupgarou.events.LGDayEndEvent;
import main.java.fr.leomelki.loupgarou.events.LGPreDayStartEvent;
import main.java.fr.leomelki.loupgarou.events.LGRoleTurnEndEvent;

public class RMedium extends Role{
	public RMedium(LGGame game) {
		super(game);
	}
	@Override
	public RoleType getType() {
		return RoleType.VILLAGER;
	}
	@Override
	public RoleWinType getWinType() {
		return RoleWinType.VILLAGE;
	}
	@Override
	public String getName() {
		return "§a§lMédium";
	}
	@Override
	public String getFriendlyName() {
		return "du "+getName();
	}
	@Override
	public String getShortDescription() {
		return "Tu gagnes avec le §a§lVillage";
	}
	@Override
	public String getDescription() {
		return "Tu gagnes avec le §a§lVillage§f. Chaque nuit, tu peux communiquer avec les morts pour tenter de récupérer des informations cruciales.";
	}
	@Override
	public String getTask() {
		return "";
	}
	@Override
	public String getBroadcastedTask() {
		return "";
	}
	@Override
	public int getTimeout() {
		return -1;
	}
	
	@EventHandler
	public void onNight(LGDayEndEvent e) {
		if(e.getGame() == getGame())
			for(LGPlayer lgp : getPlayers()) {
				lgp.sendMessage("§8§oTu entres en contact avec le monde des morts...");
				joinChat(lgp);
			}
	}
	
	
	private void joinChat(LGPlayer lgp) {
		lgp.joinChat(getGame().getSpectatorChat(), new LGChat.LGChatCallback() {

			@Override
			public String receive(LGPlayer sender, String message) {
				return "§7"+sender.getName()+"§6 » §f"+message;
			}
			
			@Override
			public String send(LGPlayer sender, String message) {
				return getName()+"§6 » §f"+message;
			}
			
		});
	}
	@EventHandler
	public void onRoleTurn(LGRoleTurnEndEvent e) {
		if(e.getGame() == getGame())
			if(e.getPreviousRole() instanceof RLoupGarou)
				for(LGPlayer lgp : getPlayers())
					if(lgp.getChat() != getGame().getSpectatorChat() && lgp.isRoleActive()) {
						lgp.sendMessage("§6§oTu peux de nouveau parler aux morts...");
						joinChat(lgp);
					}
	}
	
	@EventHandler
	public void onDay(LGPreDayStartEvent e) {
		if(e.getGame() == getGame())
			for(LGPlayer lgp : getPlayers())
				if(lgp.isRoleActive())
					lgp.leaveChat();
	}
}
