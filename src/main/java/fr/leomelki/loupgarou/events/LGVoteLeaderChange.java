package main.java.fr.leomelki.loupgarou.events;

import java.util.ArrayList;

import main.java.fr.leomelki.loupgarou.classes.LGGame;
import main.java.fr.leomelki.loupgarou.classes.LGPlayer;
import main.java.fr.leomelki.loupgarou.classes.LGVote;
import lombok.Getter;

public class LGVoteLeaderChange extends LGEvent{

	public LGVoteLeaderChange(LGGame game, LGVote vote, ArrayList<LGPlayer> latest, ArrayList<LGPlayer> now) {
		super(game);
		this.latest = latest;
		this.now = now;
		this.vote = vote;
	}
	
	@Getter ArrayList<LGPlayer> latest, now;
	@Getter LGVote vote;

}
