package com.Manbir;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
	 Album album = new Album("Stormbringer", "Deep Purple");
	 album.addSong("qw", 4.6);
	 album.addSong("er", 4.22);
	 album.addSong("ty", 4.3);
	 album.addSong("ui", 5.6);
	 album.addSong("op", 3.21);
	 album.addSong("as", 6.23);
	 album.addSong("df", 4.27);
	 album.addSong("gh", 4.2);
	 album.addSong("hj", 3.13);
	 albums.add(album);

	 album = new Album("For those about to rock", "AC/DC");
        album.addSong("qw", 4.6);
        album.addSong("er", 4.22);
        album.addSong("ty", 4.3);
        album.addSong("ui", 5.6);
        album.addSong("op", 3.21);
        album.addSong("as", 6.23);
        album.addSong("df", 4.27);
        album.addSong("gh", 4.2);
        album.addSong("hj", 3.13);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("ty", playList);
        albums.get(0).addToPlayList("er", playList);
        albums.get(0).addToPlayList("You cant do it right", playList);
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("PlayList complete,");
                    quit = true;
                    break;
                case 1:
                    if (!forward){
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now Playing: " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    } if (listIterator.hasPrevious()) {
                    System.out.println("Now playing: " + listIterator.previous().toString());
                } else {
                        System.out.println("We have reached the beginning of the list");
                        forward = true;
                    }
                    break;
                case 3:
                    break;
                case 4:
            //        printList(playList);
                    break;
                case 5:
             //       printMenu();
                    break;

            }
        }
    }
}
