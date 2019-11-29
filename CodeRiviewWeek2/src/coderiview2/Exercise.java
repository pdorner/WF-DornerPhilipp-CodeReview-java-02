package coderiview2;

public class Exercise {
	private String name;
	private String desc;
	private int sec;
	private boolean postion;
	public Exercise(String name, String desc, int sec, boolean postion) {
		super();
		this.name = name;
		this.desc = desc;
		this.sec = sec;
		this.postion = postion;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	public boolean isPostion() {
		return postion;
	}
	public void setPostion(boolean postion) {
		this.postion = postion;
	}
	@Override
	public String toString() {
		return name + "\t" + sec + "\n-----------------------------" +"\n" + desc;
	}
	public void print() {
		System.out.println(name + "\t\t" + sec + "\n-----------------------------" +"\n" + desc + "\n");
	}


	
}
