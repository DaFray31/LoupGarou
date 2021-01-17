package fr.leomelki.loupgarou.events;

import lombok.Getter;
import fr.leomelki.loupgarou.classes.LGGame;
import fr.leomelki.loupgarou.classes.LGPlayer;
import fr.leomelki.loupgarou.classes.LGVote;

import java.util.ArrayList;

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
