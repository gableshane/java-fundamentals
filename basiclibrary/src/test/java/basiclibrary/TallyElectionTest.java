package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;

public class TallyElectionTest {


    @Test
    public void tally() {
        ArrayList<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String expected = "Bush";
        assertEquals("Bush received the most votes and the tally method returns: ",expected,TallyElection.tally(votes) );
    }
}