package com.douzone.di_ex06;

public class BaseballTeam {

	String nameTeam;		// 팀명
	String manager;			// 감독
	String battingCoach;	// 타격코치
	String pitchingCoach;	// 투수코치
	String hitter;			// 타자
	String pitcher;			// 투수

	public BaseballTeam() {}

	public BaseballTeam(String nameTeam, String manager, String battingCoach, String pitchingCoach) {
		this.nameTeam = nameTeam;
		this.manager = manager;
		this.battingCoach= battingCoach;
		this.pitchingCoach = pitchingCoach;
	}

	public String getNameTeam() {
		return nameTeam;
	}

	public void setNameTeam(String nameTeam) {
		this.nameTeam = nameTeam;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getBattingCoach() {
		return battingCoach;
	}

	public void setBattingCoach(String battingCoach) {
		this.battingCoach = battingCoach;
	}

	public String getPitchingCoach() {
		return pitchingCoach;
	}

	public void setPitchingCoach(String pitchingCoach) {
		this.pitchingCoach = pitchingCoach;
	}

	public String getHitter() {
		return hitter;
	}

	public void setHitter(String hitter) {
		this.hitter = hitter;
	}

	public String getPitcher() {
		return pitcher;
	}

	public void setPitcher(String pitcher) {
		this.pitcher = pitcher;
	}


}
