//@formatter:off
package labs.lab7;
import lombok.*;
import static utils.LogUtils.*;

public class Problem1 {
    static class NumberOfGoals{
        @Getter private int goal;
        public void setGoal(){ goal++; }
    }
}

class GoalTracker {
    public static void main(String[] args){
        var teamA = new Problem1.NumberOfGoals(); // default constructor w/ default int value is 0
        var teamB = new Problem1.NumberOfGoals();

        teamA.setGoal();
        teamB.setGoal();
        teamB.setGoal();

        log("Team A scored: " + teamA.getGoal());
        log("Team B scored: " + teamB.getGoal());
    }
}


