package builtins.challenge.playlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<Song> myPlayList = new LinkedList<>();

        Album something = new Album("someonenew", "something");
        Album right = new Album("someoneold","right");

        something.addSong("whoohoo", 88.3);
        something.addSong("hello", 36.2);

        right.addSong("shoo", 33.2);

        right.addToPlayList("shoo", myPlayList);
        something.addToPlayList("hello", myPlayList);
        something.addToPlayList("whoohoo", myPlayList);

        play(myPlayList);
    }

    private static void play(LinkedList<Song> playList) {
        ListIterator<Song> iterator = playList.listIterator();
        boolean quit = false;
        boolean forward = true;

        Scanner scanner = new Scanner(System.in);
        printInstuctions();
        while(!quit) {
            int command = scanner.nextInt();
            switch (command) {
                case 0: quit = true; break;
                case 1: printInstuctions(); break;
                case 2:
                    if (!forward) {
                        iterator.next();
                        forward = !forward;
                    }

                    if (iterator.hasNext()) {
                        Song currentSong = iterator.next();
                        System.out.println("Now playing " + currentSong.getTitle());
                    } else {
                        System.out.println("Reached the end of the playlist");
                    }
                    break;
                case 3:
                    if (forward) {
                        iterator.previous();
                        forward = !forward;
                    }

                    if (iterator.hasPrevious()) {
                        Song currentSong = iterator.previous();
                        System.out.println("Now playing " + currentSong.getTitle());
                    } else {
                        System.out.println("Reached the beginning of the playlist");
                    }
                    break;
                case 4:
                    if (forward) {
                        Song currentSong = iterator.previous();
                        System.out.println("Now playing " + currentSong.getTitle());
                        forward = !forward;
                    } else {
                        Song currentSong = iterator.next();
                        System.out.println("Now playing " + currentSong.getTitle());
                        forward = !forward;
                    }
                    break;
            }

            System.out.println("Thank you for playing the playlist");
        }
    }

    private static void printInstuctions() {
        System.out.println("These are the instructions");
        System.out.println("0 means quit");
        System.out.println("1 means print instructions");
        System.out.println("2 means go forward");
        System.out.println("3 means go backward");
        System.out.println("4 means repeat song");
    }

}
