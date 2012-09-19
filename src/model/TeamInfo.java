package model;

public class TeamInfo {
	private String name;
	private int goalScored;
	private int goalScoredAgainst;
	
	public TeamInfo (String name, int goalScored, int goalScoredAgainst){
		this.name = name;
		this.goalScored = goalScored;
		this.goalScoredAgainst = goalScoredAgainst;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGoalScored() {
		return goalScored;
	}
	public void setGoalScored(int goalScored) {
		this.goalScored = goalScored;
	}
	public int getGoalScoredAgainst() {
		return goalScoredAgainst;
	}
	public void setGoalScoredAgainst(int goalScoredAgainst) {
		this.goalScoredAgainst = goalScoredAgainst;
	}
	
}
