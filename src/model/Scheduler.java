package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Scheduler {
    public List<Participant> unscheduled;
//    public List<Match> scheduled;
    public List<Participant> resting;



    // Constructor
    public Scheduler() {
        unscheduled = new ArrayList();
//        scheduled = new ArrayList();
        resting = new ArrayList();
    }


    // REQUIRES: Participant to not be NULL
    // MODIFIES: this
    // EFFECTS: adds a participant to list of unscheduled
    public void addParticipant(Participant name) {
        unscheduled.add(name);
    }

    // MODIFIES: this
    // EFFECTS: schedules matches out of list of given participants
    public void scheduleMatches() {
        checkRestPossibility();
        while (!unscheduled.isEmpty()) {
            setUpMatch();
        }

    }




    // MODIFIES: this
    // EFFECTS: checks if odd number of participants, if there are, assigns one to rest and prints message to confirm
    private void checkRestPossibility() {
        int numParticipants = unscheduled.size();
        if (numParticipants % 2 != 0) {
            int max = numParticipants;

            Random ran = new Random();

            // Should choose a number from [0, max), and as index is size - 1, this should work out
            int chosenIndex = ran.nextInt(max);

            Participant toRest = unscheduled.get(chosenIndex);
            resting.add(toRest);
            unscheduled.remove(chosenIndex);

            System.out.println(resting.get(0).getName() + " is resting this week!");

        }
    }

    // MODIFIES: this
    // EFFECTS: randomly picks two participants from the participants lists
    private void setUpMatch() {
        int numParticipants = unscheduled.size();
        int max = numParticipants;
        Random ran = new Random();

        // Should choose a number from [0, max), and as index is size - 1, this should work out
        int chosenIndex = ran.nextInt(max);

        // Selects first participant
        Participant homeTeam = unscheduled.get(chosenIndex);
        // Removes chosen participant from pool
        unscheduled.remove(chosenIndex);

        // updates number of possible participants
        max--;

        // Chooses a new random number
        int nextIndex = ran.nextInt(max);

        // Select second participant
        Participant awayTeam = unscheduled.get(nextIndex);
        // Removes chosen participant from pool
        unscheduled.remove(nextIndex);

        // Creates match
        Match createdMatch = new Match(homeTeam, awayTeam);

//        scheduled.add(createdMatch);

        createdMatch.readMatch();
    }
}
