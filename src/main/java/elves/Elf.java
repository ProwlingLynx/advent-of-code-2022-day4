package elves;

class Elf {
    private int[] assignedDecks;
    public Elf(String rangeOfDecks) throws NumberFormatException{
        // This implementation assumes there will be a '-' to separate the integers.
        int indexOfDelimiter = rangeOfDecks.indexOf('-');
        int startingDeck = Integer.parseInt(rangeOfDecks.substring(0, indexOfDelimiter));
        int endDeck = Integer.parseInt(rangeOfDecks.substring(indexOfDelimiter + 1));
        assignedDecks = new int[]{startingDeck, endDeck};
        assignedDecks = new int[]{startingDeck, endDeck};
    }
    boolean isOverlappingCompletely(Elf otherElf){
        return getStartingDeck() <= otherElf.getStartingDeck() && getLastDeck() >= otherElf.getLastDeck();
    }
    boolean isOverlapping(Elf otherElf){
        return getStartingDeck() <= otherElf.getLastDeck() && getLastDeck() >= otherElf.getStartingDeck();
    }
    int getStartingDeck(){
        return assignedDecks[0];
    }
    int getLastDeck(){
        return assignedDecks[1];
    }
}
