package com.demo.model;

public class Player {
	private int id;
	private String name;
	private int age;
	private String teamid;

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name, int age, String teamid) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.teamid = teamid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTeamid() {
		return teamid;
	}

	public void setTeamid(String teamid) {
		this.teamid = teamid;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", teamid=" + teamid + "]";
	}

}
