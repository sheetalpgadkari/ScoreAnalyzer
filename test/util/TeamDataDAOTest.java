package util;

import java.util.ArrayList;
import java.util.List;

import model.TeamInfo;
import dao.TeamDataDAO;

public class TeamDataDAOTest implements TeamDataDAO{

	@Override
	public List<TeamInfo> getAllTeamInfo() {
		List<TeamInfo> teamInfos = new ArrayList<TeamInfo> ();
		
		TeamInfo teamData1 = new TeamInfo("Arsenal", 79, 36);
		teamInfos.add(teamData1);

		
		TeamInfo teamData2 = new TeamInfo("Liverpool", 67, 30);
		teamInfos.add(teamData2);

		
		TeamInfo teamData3 = new TeamInfo("Manchester_U", 87, 45);
		teamInfos.add(teamData3);

		TeamInfo teamData4 = new TeamInfo("Newcastle", 74, 52);
		teamInfos.add(teamData4);

		
		TeamInfo teamDat5 = new TeamInfo("Leeds", 53, 37);
		teamInfos.add(teamDat5);

		
		TeamInfo teamData6 = new TeamInfo("Chelsea", 66, 38);
		teamInfos.add(teamData6);

		
		TeamInfo teamData7 = new TeamInfo("West_Ham", 48, 57);
		teamInfos.add(teamData7);

		
		TeamInfo teamData8 = new TeamInfo("Aston_Villa", 46, 47);
		teamInfos.add(teamData8);

		
		TeamInfo teamData9 = new TeamInfo("Tottenham", 49, 53);
		teamInfos.add(teamData9);

		TeamInfo teamData10 = new TeamInfo("Blackburn", 55, 51);
		teamInfos.add(teamData10);
		
		TeamInfo teamData11 = new TeamInfo("Southampton", 46, 54);
		teamInfos.add(teamData11);
		
		TeamInfo teamData12 = new TeamInfo("Middlesbrough", 35, 47);
		teamInfos.add(teamData12);
		
		TeamInfo teamData13 = new TeamInfo("Fulham", 36, 44);
		teamInfos.add(teamData13);
		
		TeamInfo teamData14 = new TeamInfo("Charlton", 38, 49);
		teamInfos.add(teamData14);
		
		TeamInfo teamData15 = new TeamInfo("Everton", 45, 57);
		teamInfos.add(teamData15);
		
		TeamInfo teamData16 = new TeamInfo("Bolton", 44, 62);
		teamInfos.add(teamData16);
		
		TeamInfo teamData17 = new TeamInfo("Sunderland", 29, 51);
		teamInfos.add(teamData17);
		
		TeamInfo teamData18 = new TeamInfo("Ipswich", 41, 64);
		teamInfos.add(teamData18);
		
		TeamInfo teamData19 = new TeamInfo("Derby", 33, 63);
		teamInfos.add(teamData19);
		
		TeamInfo teamData20 = new TeamInfo("Leicester", 30, 64);
		teamInfos.add(teamData20);

		return teamInfos;
		
	}

}
