package model;

public class Match {
    public Participant first;
    public Participant second;


    public Match(Participant one, Participant two) {
        first = one;
        second = two;
    }

    public void readMatch() {
        System.out.println("Match: " + first.getName() + " VS " + second.getName());
    }


}
