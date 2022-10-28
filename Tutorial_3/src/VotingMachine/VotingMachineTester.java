package VotingMachine;

public class VotingMachineTester {
    public static void main(String[] args) {
        VotingMachine votingMachine = new VotingMachine();

        votingMachine.voteLabour();
        votingMachine.voteLabour();
        votingMachine.voteLabour();

        votingMachine.voteConservative();

        System.out.println("Labour: "+votingMachine.getLabourVotes());
        System.out.println("Conservative: "+votingMachine.getConservativeVotes());

        votingMachine.clearVotes();
        System.out.println("............ After clear.............");
        System.out.println("Labour: "+votingMachine.getLabourVotes());
        System.out.println("Conservative: "+votingMachine.getConservativeVotes());
    }
}
