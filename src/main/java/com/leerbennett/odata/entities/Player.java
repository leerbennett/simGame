package com.leerbennett.odata.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class Player {
	@Id
	private int id;
	private int gameId;
	private int userId;
    private String creator;

    public Player() {
    }

    public Player(int id, String name) {
    	this.id = id;
        this.creator = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Member[id=%d, creator='%s']",
                id, creator);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String name) {
		this.creator = name;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
