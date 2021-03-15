package com.demo.playerdao;

import java.util.List;

import com.demo.model.Player;

public interface PlayerDAO {
	public int addPlayer(Player player);

	public Player getPlayerUsingId(int id);

	public List<Player> getAllPlayers();

	public int deletePlayer(int id);

	public int updatePlayer(String label, Object data, int id);
}
