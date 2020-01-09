package basiclibrary;

import java.util.ArrayList;
import java.util.HashMap;

public class TallyElection {
    public static String tally(ArrayList<String> votes) {
        HashMap<String, Integer> voteCounter = new HashMap<>();
        for(String vote : votes) {
            voteCounter.put(vote, 0);
        }
        for(String vote : votes) {
            voteCounter.put(vote,voteCounter.get(vote) + 1);
        }
        int winningVote = 0;
        String winner = "";
        for(String candidate : voteCounter.keySet()) {
            if(voteCounter.get(candidate) > winningVote) {
                winningVote = voteCounter.get(candidate);
                winner = candidate;
            }
        }
        return winner;
    }
}
