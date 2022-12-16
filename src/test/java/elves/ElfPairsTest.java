package elves;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElfPairsTest {

    @Test
    void isAssignmentInefficient(){
        ElfPairs testCase1 = new ElfPairs("5-8,9-12");
        ElfPairs testCase2 = new ElfPairs("20-21,15-30");
        ElfPairs testCase3 = new ElfPairs("6-10,15-20");

        assertAll(
                () -> assertFalse(testCase1.isAssignmentInefficient()),
                () -> assertTrue(testCase2.isAssignmentInefficient()),
                () -> assertFalse(testCase3.isAssignmentInefficient())
        );
    }
}