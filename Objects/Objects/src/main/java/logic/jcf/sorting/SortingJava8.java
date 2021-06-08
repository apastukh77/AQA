package logic.jcf.sorting;

import logic.jcf.comparators.TeamCompareRuleByNameAsc;
import logic.jcf.comparators.TeamCompareRuleByNameDesc;
import logic.jcf.comparators.TeamCompareRuleByPointsAsc;
import logic.jcf.comparators.TeamCompareRuleByPointsDesc;
import logic.jcf.entity.Team;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Serhiy Dubovenko
 */
public class SortingJava8 {



    private void printCollection(ArrayList<Team> teams){
        for (int i = 0; i < teams.size(); i++) {
            System.out.println(teams.get(i).getTeamName()+" "+teams.get(i).getG()+" "+teams.get(i).getPoints());
        }
    }

    public static void main(String[] args) {
        SortingJava8 sj8 = new SortingJava8();
        ArrayList<Team> teams = new ArrayList<Team>();
        teams.add(new Team("Bosnia & Herzegovina", 2, 0, 1, 1, 2, 1));
        teams.add(new Team("Finland", 1, 0, 1, 0, 2, 1));
        teams.add(new Team("Ukraine", 1, 1, 0, 0, 2, 3));
        teams.add(new Team("France", 1, 0, 0, 1, -1, 0));
        teams.add(new Team("Kazakhstan", 0, 0, 0, 0,0,0));
        teams.add(new Team("Kazakhstan", 0, 1, 2, 0,7,5));

        sj8.printCollection(teams);
        System.out.println("\n");
        Collections.sort(teams, new TeamCompareRuleByNameAsc() );

        sj8.printCollection(teams);
        System.out.println("\n");

        Collections.sort(teams, new TeamCompareRuleByNameDesc() );

        sj8.printCollection(teams);
        System.out.println("\n");

        Collections.sort(teams, new TeamCompareRuleByPointsAsc() );

        sj8.printCollection(teams);
        System.out.println("\n");

        Collections.sort(teams, new TeamCompareRuleByPointsDesc() );

        sj8.printCollection(teams);
        System.out.println("\n");

        Collections.sort(teams, new TeamCompareRuleByNameAsc().thenComparing(new TeamCompareRuleByPointsDesc()));

        sj8.printCollection(teams);
        System.out.println("\n");




    }


}
