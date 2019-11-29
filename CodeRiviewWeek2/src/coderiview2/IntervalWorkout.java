package coderiview2;

import java.util.ArrayList;

public class IntervalWorkout {
	private int rounds;
	private int breaktime;
	ArrayList<Exercise> exerarr = new ArrayList<>();
	public IntervalWorkout(int rounds, int breaktime) {
		super();
		this.rounds = rounds;
		this.breaktime = breaktime;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public int getBreaktime() {
		return breaktime;
	}
	public void setBreaktime(int breaktime) {
		this.breaktime = breaktime;
	}
	public ArrayList<Exercise> getExerarr() {
		return exerarr;
	}
	public void setExerarr(ArrayList<Exercise> exerarr) {
		this.exerarr = exerarr;
	}
	
}
