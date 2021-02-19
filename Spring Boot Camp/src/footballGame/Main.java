package footballGame;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Team team1=new Team();	
		Player lojtar1=new Player("Artens","Ceruni",10,Role.Mesfushor,team1);
		Player lojtar2=new Player("ens","Ceruni",11,Role.Sulmues,team1);
		Player lojtar3=new Player("tens","Ceruni",3,Role.Portjer,team1);
		Player lojtar4=new Player("r","Ceruni",4,Role.Mesfushor,team1);
		Player lojtar5=new Player("A","Ceruni",5,Role.Mbrojtes,team1);
		ArrayList<Player> team=new ArrayList<Player>();
		team.add(lojtar5);
		team.add(lojtar4);
		team.add(lojtar3);
		team.add(lojtar2);
		team.add(lojtar1);
		team1.setTeam(team);
		Coach coach=new Coach();
		coach.setTeam(team1);
		team1.setCoach(coach);
		coach.setRole(lojtar1, Role.Sulmues);
		System.out.println(lojtar1.getRole());
		

		
	}

}
