package logic.jcf.comparators;

import logic.jcf.entity.Team;

import java.util.Comparator;

/**
 * @author Serhiy Dubovenko
 */
public class TeamCompareRuleByNameDesc implements Comparator<Team> {

    @Override
    public int compare(Team obj1, Team obj2) {
        return obj2.getTeamName().compareToIgnoreCase(obj1.getTeamName());
    }

}
