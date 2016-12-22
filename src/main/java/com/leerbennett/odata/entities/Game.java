package com.leerbennett.odata.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="game")
public class Game {
	@Id
	private int id;
    private String creator;
    private boolean isStarted = false;
	private boolean isCompleted = false;
	private int turnDelay;
	@Temporal(TemporalType.TIMESTAMP)
	private Date Created;
	@Temporal(TemporalType.TIMESTAMP)
	private Date Started;
	@Temporal(TemporalType.TIMESTAMP)
	private Date Completed;

    public Game() {
    }

    public Game(int id, String name) {
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
    public boolean isStarted() {
		return isStarted;
	}

	public void setStarted(boolean isStarted) {
		this.isStarted = isStarted;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public int getTurnDelay() {
		return turnDelay;
	}

	public void setTurnDelay(int turnDelay) {
		this.turnDelay = turnDelay;
	}
	
}
