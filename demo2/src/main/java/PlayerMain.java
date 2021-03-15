import java.util.List;
import java.util.Scanner;

import com.demo.model.Player;
import com.demo.playerdao.PlayerDAO;
import com.demo.playerdao.impl.PlayerDaoImpl;

public class PlayerMain {

	public PlayerMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerDAO pDao = new PlayerDaoImpl();

		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose one of the following options: \n" + " 	1. Get all players. \n"
				+ " 	2. Get a specific player. \n" + " 	3. Add a player. \n" + " 	4. Delete a player. \n"
				+ " 	5. Update a player's Info. \n");

		int userChoice = sc.nextInt();
		List<Player> thesePlayers = pDao.getAllPlayers();

		switch (userChoice) {
		case 1:
			for (Player player : thesePlayers) {
				System.out.println(player);
			}
			break;
		case 2:
			// take input
			System.out.println("Please type in a Player Id to get the info");
			int playerId = sc.nextInt();

			// use that input
			Player thisPlayer = pDao.getPlayerUsingId(playerId);
			System.out.println(thisPlayer);
			break;
		case 3:
			Player p = new Player(20, "Christopher", 33, "3"); // validator to prevent inserting duplicate id
			int c = pDao.addPlayer(p);
			if (c > 0) {
				System.out.println("Player " + p + " was saved to the database!");
			} else {
				System.out.println("There was probably a problem! Fix it, mofo!");
			}
			break;
		case 4:
			System.out.println("Choose one of the following players to delete! \n");
			for (int i = 1; i <= thesePlayers.size(); i++) {
				System.out
						.println("Press " + thesePlayers.get(i - 1).getId() + " to delete: " + thesePlayers.get(i - 1));
			}
			int deleteChoice = sc.nextInt();
			int c2 = pDao.deletePlayer(deleteChoice);
			if (c2 > 0) {
				System.out.println("Deletion successful");
			}
			List<Player> thesePlayers2 = pDao.getAllPlayers();
			for (Player player : thesePlayers2) {
				System.out.println(player);
			}

			break;
		case 5:
			System.out.println("Choose one of the following players to update! \n");
			for (int i = 1; i <= thesePlayers.size(); i++) {
				System.out
						.println("Press " + thesePlayers.get(i - 1).getId() + " to update: " + thesePlayers.get(i - 1));
			}
			System.out.println("Make a choice:");
			int updateChoice = sc.nextInt();
			System.out.println("\nWhat would you to change? \n" + "Press 1 - Change the Player's Name \n"
					+ "Press 2 - Change the Player's Age \n" + "Press 3 - Change the Player's Team Id \n");

			String label = "";
			int updateLabel = sc.nextInt();
			switch (updateLabel) {
				case 1:
					label = "name";
					break;
				case 2:
					label = "age";
					break;
				case 3:
					label = "teamid";
					break;
			}
			System.out.println("\nType in a new " + label + " : ");

			Object data = (label == "name" || label == "teamid") ? sc.next() : sc.nextInt();
			int c3 = pDao.updatePlayer(label, data, updateChoice);
			if (c3 > 0) {
				System.out.println("\nUpdate successful!\n");
			} else {
				System.out.println("\nSorry, the update wasn't successful!\n");
			}
			
			List<Player> thesePlayers3 = pDao.getAllPlayers();
			for (Player player : thesePlayers3) {
				System.out.println(player);
			}
			break;
		default:
			System.out.println("Sorry, this doesn't exist. Rerun the program.");
			break;
		}
		sc.close();
	}

}
