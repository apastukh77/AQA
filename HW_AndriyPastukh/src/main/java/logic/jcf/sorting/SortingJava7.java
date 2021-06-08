package logic.jcf.sorting;

import logic.jcf.entity.Team;
import java.util.ArrayList;

public class SortingJava7 {

    private void printCollection(ArrayList<Team> teams){
        for (int i = 0; i < teams.size(); i++){
            System.out.println(teams.get(i).getTeam);
        }
    }

    public static void main(String[] args) {

        ArrayList<Team> Teams = new ArrayList<Team>();
        teams.add(new Team("Bosnia & Herzegovina", 1, 0, 1, 0, 2, 1));
        teams.add(new Team("Finland", 1, 0, 1, 0, 2, 1));
        teams.add(new Team("Ukraine", 1, 1, 0, 0, 2, 1));


        System.out.println(teams);

        Collections.sort(teams, )

    }
}
