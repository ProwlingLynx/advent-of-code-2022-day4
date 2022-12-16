package elves;

public class Elf {
    private int[] assignedDecks;
    public Elf(String rangeOfDecks) throws NumberFormatException{
        int indexOfDelimiter = rangeOfDecks.indexOf('-');
        int startingDeck = Integer.parseInt(rangeOfDecks.substring(0, indexOfDelimiter));
        int endDeck = Integer.parseInt(rangeOfDecks.substring(indexOfDelimiter + 1));
        assignedDecks = new int[]{startingDeck, endDeck};
        assignedDecks = new int[]{startingDeck, endDeck};
    }
    public boolean isOverlappingCompletely(Elf otherElf){
        return getStartingDeck() <= otherElf.getStartingDeck() && getLastDeck() >= otherElf.getLastDeck();
    }
    public int getStartingDeck(){
        return assignedDecks[0];
    }
    public int getLastDeck(){
        return assignedDecks[1];
    }
}
