package cn.edu.ustc.nsrl;

class Player {
	private int num;
	private String name;
	
	public Player() {}
	public Player(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void shot() {
		System.out.println("球进了");
	}
}

class Team {
	private String teamName;
	Player p1;
	Player p2;
	Player p3;
	
	Player[] allPlayers = null;
	
	public Team() {}
	public Team(String teamName, Player p1, Player p2, Player p3) {
		this.teamName = teamName;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public void game() {
		System.out.println(this.p1.getName() + "，" 
				+ this.p2.getName() + "和" 
				+ this.p3.getName() + "所向披靡");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player(3, "David");
		Player p2 = new Player(23, "Jorden");
		Player p3 = new Player(11, "Yao");
		
		Team BigThree = new Team("DreamTeam", p1, p2, p3);
		BigThree.game();
	}

}
