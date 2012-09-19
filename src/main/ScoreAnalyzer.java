package main;

import util.TeamDataDAOTest;
import dao.TeamDataDAO;
import bo.ScoreAnalyserService;
import bo.ScoreAnalyserServiceImp1;

public class ScoreAnalyzer {

	
	ScoreAnalyserService scoreAnalyserService;

	public ScoreAnalyzer (){
		TeamDataDAO teamDataDao = new TeamDataDAOMemory();
		scoreAnalyserService = new ScoreAnalyserServiceImp1(teamDataDao);
	}
	
	public String getTeamWithLeastScoreDifference (){
		return scoreAnalyserService.getTeamWithLeastScoreDifference();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ScoreAnalyzer scoreAnalyzer = new ScoreAnalyzer();
		System.out.print("The team with smallest difference in 'for' and 'against' goals is " + scoreAnalyzer.getTeamWithLeastScoreDifference());

	}

}
