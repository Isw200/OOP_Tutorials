package VotingMachine;

public class VotingMachine {
    private int LabourVotes;
    private int ConservativeVotes;

    public int getLabourVotes() {
        return LabourVotes;
    }

    public int getConservativeVotes() {
        return ConservativeVotes;
    }

    public void voteConservative() {
        ConservativeVotes += 1;
    }

    public void voteLabour() {
        LabourVotes += (int) (Math.random()*(2000));
    }
    public void clearVotes(){
        ConservativeVotes = 0;
        LabourVotes = 0;
    }
}
