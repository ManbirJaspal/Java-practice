package com.Manbir;

public class Main {

    public static void main(String[] args) {
	Footballplayer joe = new Footballplayer("Joe");
	BaseballPlayer pat = new BaseballPlayer("Pat");
	SoccerPlayer beckham = new SoccerPlayer("Beckham");

	Team<Footballplayer> adelaideCrows = new Team<>("AdelaideCrows");
	adelaideCrows.addplayer(joe);
//	adelaideCrows.addplayer(beckham);
//	adelaideCrows.addplayer(pat);

        System.out.println(adelaideCrows.numPlayer());
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addplayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this wont work");
        brokenTeam.addplayer(beckham);

        Team<Footballplayer> melbourne = new Team<>("Melbourne");
        Footballplayer banks = new Footballplayer("Gordon");
        melbourne.addplayer(banks);

        Team<Footballplayer> hawthorn = new Team<>("Hawthorn");
        Team<Footballplayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 0);
        adelaideCrows.matchResult(fremantle, 2, 1);
       // adelaideCrows.matchResult(baseballTeam,1 ,1);

		System.out.println("rankings");
		System.out.println(adelaideCrows.getName() + ":" + adelaideCrows.ranking());
		System.out.println(melbourne.getName() + ":" + melbourne.ranking());
		System.out.println(fremantle.getName() + ":" + fremantle.ranking());
		System.out.println(hawthorn.getName() + ":" + hawthorn.ranking());

		System.out.println(adelaideCrows.compareTo(melbourne));
    }
}
