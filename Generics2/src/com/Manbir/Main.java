package com.Manbir;

public class Main {

    public static void main(String[] args) {
	Footballplayer joe = new Footballplayer("Joe");
	BaseballPlayer pat = new BaseballPlayer("Pat");
	SoccerPlayer beckham = new SoccerPlayer("Beckham");

	Team<Footballplayer> adelaideCrows = new Team<>("AdelaideCrows");
	adelaideCrows.addplayer(joe);
	adelaideCrows.addplayer(beckham);
	adelaideCrows.addplayer(pat);

        System.out.println(adelaideCrows.numPlayer());
    }
}
