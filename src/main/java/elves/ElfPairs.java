package elves;

public class ElfPairs {
    private final Elf elf1;
    private final Elf elf2;
    public ElfPairs(String deckAssignment){
//        This implementation will assume there is a comma to separate the values.
        String[] assignments = deckAssignment.split(",");
        elf1 = new Elf(assignments[0]);
        elf2 = new Elf(assignments[1]);
    }
    public boolean isAssignmentInefficient(){
        if (!elf1.isOverlappingCompletely(elf2)){
            return elf2.isOverlappingCompletely(elf1);
        }
        return true;
    }
}
