package util;

import java.util.Comparator;

import model.TeamInfo;

public class SortByScoreDifference implements Comparator<TeamInfo>{

	@Override
	public int compare(TeamInfo team1, TeamInfo team2) {
		int teamGoalDiff = team1.getGoalScored() - team1.getGoalScoredAgainst();
		int teamGoalDiff1 = team2.getGoalScored() - team2.getGoalScoredAgainst();
		if( teamGoalDiff  > teamGoalDiff1 ) 
			return 1; 
		else if (teamGoalDiff  < teamGoalDiff1)
			return -1;
		else
			return 0;
	}

}
