package filereader;

import elves.ElfPairs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileReader {
    private final Scanner sc;
    public FileReader(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        sc = new Scanner(file);
    }

    public List<ElfPairs>  mapFileInputIntoElfPairs (){
        List<ElfPairs> deckAssignmentList = new ArrayList<>();
        while(sc.hasNext()){
            deckAssignmentList.add(new ElfPairs(sc.nextLine()));
        }
        return deckAssignmentList;
    }

}
