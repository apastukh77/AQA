package logic.jcf.comparators;

import logic.jcf.entity.Team;

public class TeamCompareRuleByNameAsc implements Coparable<Team>{

    public int compareTo(Team obj1, Team obj2){
        return obj1.getTeamName;
    }
}
