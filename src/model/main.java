package model;

public class main {
    public static void main(String[] args) {
        Participant Ethan = new Participant("Ethan");
        Participant Ernest = new Participant("Ernest");
        Participant Jayden = new Participant("Jayden");
        Participant Harry = new Participant("Harry");
        Participant Alvin = new Participant("Alvin");
        Participant Kevin = new Participant("Kevin");
        Participant Mike = new Participant("Mike");

        Scheduler tournament = new Scheduler();

        tournament.addParticipant(Ethan);
        tournament.addParticipant(Ernest);
        tournament.addParticipant(Jayden);
        tournament.addParticipant(Harry);
        tournament.addParticipant(Alvin);
        tournament.addParticipant(Kevin);
        tournament.addParticipant(Mike);

        tournament.scheduleMatches();


    }
}
