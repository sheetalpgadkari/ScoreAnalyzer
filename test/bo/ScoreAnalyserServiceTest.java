package bo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import util.TeamDataDAOTest;

import dao.TeamDataDAO;


public class ScoreAnalyserServiceTest {

ScoreAnalyserService scoreAnalyserService;


	@Test
	public void getTeamWithLeastScoreDifference (){
		String name = scoreAnalyserService.getTeamWithLeastScoreDifference();
		assertEquals("Blackburn", name);
	}


	@Before
	public void setUp() throws Exception {
		TeamDataDAO teamDataDao = new TeamDataDAOTest();
		scoreAnalyserService = new ScoreAnalyserServiceImp1(teamDataDao);
	}


}
