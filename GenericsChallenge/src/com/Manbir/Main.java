package com.Manbir;

public class Main {

    public static void main(String[] args) {
	League<Team<Footballplayer>> footballLeague = new League<>("AFL");


        Team<Footballplayer> adelaideCrows = new Team<>("AdelaideCrows");
        Team<Footballplayer> melbourne = new Team<>("Melbourne");
        Team<Footballplayer> hawthorn = new Team<>("Hawthorn");
        Team<Footballplayer> fremantle = new Team<>("Fremantle");

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

    }
}
