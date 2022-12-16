package solution;

import elves.ElfPairs;
import filereader.FileReader;


public class Solution  {
    public static void main(String[] args) {
        try {
        FileReader fr = new FileReader("src/main/resources/partOneInput.txt");
        var deckAssignmentList = fr.mapFileInputIntoElfPairs();
        int count = 0;
        for(ElfPairs pair: deckAssignmentList){
            if (pair.isAssignmentInefficient()){
                count++;
            }
        }
            System.out.println(count);

        int inefficientCount = 0;
            for(ElfPairs pair: deckAssignmentList){
                if (pair.isAssignmentSlightlyInefficient()){
                    inefficientCount++;
                }
            }
            System.out.println(inefficientCount);
        } catch (Exception e){
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}
