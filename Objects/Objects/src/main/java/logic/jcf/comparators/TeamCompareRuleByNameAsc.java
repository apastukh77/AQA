package logic.jcf.comparators;

import logic.jcf.entity.Team;

import java.util.Comparator;

/**
 * @author Serhiy Dubovenko
 */
public class TeamCompareRuleByNameAsc implements Comparator<Team> {


    @Override
    public int compare(Team obj1, Team obj2) {
        return obj1.getTeamName().compareToIgnoreCase(obj2.getTeamName());
    }
}
