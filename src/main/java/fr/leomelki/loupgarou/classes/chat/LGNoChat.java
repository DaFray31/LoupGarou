package main.java.fr.leomelki.loupgarou.classes.chat;

import main.java.fr.leomelki.loupgarou.classes.LGPlayer;

public class LGNoChat extends LGChat{
	public LGNoChat() {
		super(null);
	}

	public void sendMessage(LGPlayer sender, String message) {}

	public void join(LGPlayer player, LGChatCallback callback) {
		
	}
	public void leave(LGPlayer player) {
		
	}
}
