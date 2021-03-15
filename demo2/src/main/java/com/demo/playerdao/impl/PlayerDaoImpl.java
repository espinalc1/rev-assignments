package com.demo.playerdao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.dbutil.PostgresConnection;
import com.demo.model.Player;
import com.demo.playerdao.PlayerDAO;

public class PlayerDaoImpl implements PlayerDAO {

	public PlayerDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	public int addPlayer(Player player) {
		// TODO Auto-generated method stub
		int c = 0; // tells us if a transaction was successfully applied to the database
		try {
			Connection connection = PostgresConnection.getConnection();
			String sql = "insert into player_schema.player (id, name, age, teamid) values (?,?,?,?)";
			PreparedStatement p = connection.prepareStatement(sql);
			p.setInt(1, player.getId());
			p.setString(2, player.getName());
			p.setInt(3, player.getId());
			p.setString(4, player.getTeamid());
			c = p.executeUpdate(); // p.execute returns an integer, denoting success or failure
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return c;
	}

	public Player getPlayerUsingId(int id) {
		// TODO Auto-generated method stub

		Player thisPlayer = new Player();
		try {
			Connection connection = PostgresConnection.getConnection();
			String sql = "select * from player_schema.player where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			// select the type of query that I'll be doing
			// it's a result set
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			// do i still have to use next()?
			if (rs.next()) {
				System.out.println("Great, we found something");
				// get the results to display
				thisPlayer.setId(id);
				thisPlayer.setName(rs.getString("name"));
				thisPlayer.setAge(rs.getInt("age"));
				thisPlayer.setTeamid(rs.getString("teamid"));

			} else {
				System.out.println("Unfortunately, this result doesn't exist");
				thisPlayer = null;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return thisPlayer;
	}

	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		List<Player> playerList = new ArrayList<Player>();

		try {
			// connection
			Connection connection = PostgresConnection.getConnection();
			// statement
			String sql = "select * from player_schema.player";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Player thisPlayer = new Player();
				thisPlayer.setId(rs.getInt("id"));
				thisPlayer.setName(rs.getString("name"));
				thisPlayer.setAge(rs.getInt("age"));
				thisPlayer.setTeamid(rs.getString("teamid"));
				playerList.add(thisPlayer);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// pull the data
		// handle the data in case there are errors - ide does this automatically
		//
		if (playerList.size() == 0) {
			System.out.println("Sorry, there aren't any players to query!");
		}
		return playerList;
	}

	public int deletePlayer(int id) {
		// TODO Auto-generated method stub
		int c = 0;
		try {
			Connection connection = PostgresConnection.getConnection();
			String sql = "delete from player_schema.player where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			c = ps.executeUpdate();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return c;

	}

	public int updatePlayer(String label, Object data, int id) {
		int c = 0;
		try {
			Connection connection = PostgresConnection.getConnection();
			String sql = "update player_schema.player set " + label + " = ? where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);

			// this dynamically calls prepared statement depending on the variable, data,
			// datatype.
			if (label == "name" || label == "teamid") {
				ps.setString(1, data.toString());
			} else {
				ps.setInt(1, Integer.parseInt(data.toString()));
			}

			ps.setInt(2, id);
			c = ps.executeUpdate();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return c;
	}

}
