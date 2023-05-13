// package Assignment14;
// Write a java program to create a class CricketPlayer (name, no_of_innings, times_ of_notout, total_runs, bat_avg). Create an array of objects for n players. Calculate the batting average for each player using a static method avg(). Define a static method “sortPlayer( )” which sorts the array on the basis of batting average. Display the player details in sorted order

import java.util.Arrays;

class CricketPlayer {
    String name;
    int no_of_innings;
    int times_of_notout;
    int total_runs;
    double bat_avg;

    CricketPlayer(String n, int inn, int notout, int truns) {
        name = n;
        no_of_innings = inn;
        times_of_notout = notout;
        total_runs = truns;
        bat_avg = avg(total_runs, no_of_innings - times_of_notout);
    }

    static double avg(int runs, int innings) {
        return (double) runs / innings;
    }

    static void sortPlayer(CricketPlayer[] players) {
        Arrays.sort(players, (a, b) -> Double.compare(b.bat_avg, a.bat_avg));
    }

    void display() {
        System.out.printf("%-15s %-10s %-15s %-15s %-10s\n", name, no_of_innings, times_of_notout, total_runs, bat_avg);
    }
}

public class q1 {
    public static void main(String[] args) {
        CricketPlayer[] players = new CricketPlayer[]{
                new CricketPlayer("A", 20, 5, 1000),
                new CricketPlayer("B", 30, 8, 2500),
                new CricketPlayer("C", 25, 3, 1200)
        };

        CricketPlayer.sortPlayer(players);

        System.out.printf("%-15s %-10s %-15s %-15s %-10s\n", "Name", "Innings", "Times Not Out", "Total Runs", "Bat Avg");
        System.out.println("-------------------------------------------------------------");

        for (CricketPlayer player : players) {
            player.display();
        }
    }
}
