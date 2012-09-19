package bo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import util.SortByScoreDifference;

import model.TeamInfo;

import dao.TeamDataDAO;

public class ScoreAnalyserServiceImp1 implements ScoreAnalyserService {

	TeamDataDAO teamDataDao;
	
	public ScoreAnalyserServiceImp1 (TeamDataDAO teamDataDao){
		this.teamDataDao = teamDataDao;
	}
	
	@Override
	public String getTeamWithLeastScoreDifference() {
		List<TeamInfo> teams = teamDataDao.getAllTeamInfo();
		
		List<TeamInfo> teamsWithPositiveScoreDiff = filterTeamToGetPositiveScorelDifference (teams);
		
		Collections.sort( teamsWithPositiveScoreDiff,
				new SortByScoreDifference() );

		TeamInfo teamWithLeastScorelDiff = teamsWithPositiveScoreDiff.get(0);
		return teamWithLeastScorelDiff.getName();
	}

	private List<TeamInfo> filterTeamToGetPositiveScorelDifference(
			List<TeamInfo> teams) {
		List<TeamInfo> teamsWithPositiveScoreDiff = new ArrayList<TeamInfo>();
		for (TeamInfo team : teams){
			if (team.getGoalScored() - team.getGoalScoredAgainst() > 0){
				teamsWithPositiveScoreDiff.add(team);
			}
		}
		return teamsWithPositiveScoreDiff;
	}

}
