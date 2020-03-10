package teamsClient;

import java.util.Arrays;
import java.util.List;

public class MonCodeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TeamsService hos = new TeamsService();
		Teams port = hos.getTeamsPort();
		List<Team> resutlat = port.getTeams();
		
		System.out.println(resutlat);
		for (int i=0 ; i<resutlat.size() ; i++) {
			System.out.println(resutlat.get(i).getName());
		}
		
	}

}
