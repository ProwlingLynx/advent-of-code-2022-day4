package elves;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElfTest {
    Elf testElf;

    @BeforeEach
    void setupTestElf(){
        testElf = new Elf("8-14");
    }
    @Test
    void getStartingDeck() {
        assertEquals(testElf.getStartingDeck(), 8);
    }

    @Test
    void getLastDeck() {
        assertEquals(testElf.getLastDeck(), 14);
    }
    @Test
    void isOverlappingCompletely() {
        Elf testCaseElf1 = new Elf("1-1");
        Elf testCaseElf2 = new Elf("9-9");
        Elf testCaseElf3 = new Elf("11-16");

        assertAll(
                () -> assertFalse(testElf.isOverlappingCompletely(testCaseElf1)),
                () -> assertTrue(testElf.isOverlappingCompletely(testCaseElf2)),
                () -> assertFalse(testElf.isOverlappingCompletely(testCaseElf3))
        );
    }
    @Test
    void isOverlapping(){
        Elf testCaseElf1 = new Elf("1-1");
        Elf testCaseElf2 = new Elf("9-20");
        Elf testCaseElf3 = new Elf("11-16");

        assertAll(
                () -> assertFalse(testElf.isOverlapping(testCaseElf1)),
                () -> assertTrue(testElf.isOverlapping(testCaseElf2)),
                () -> assertTrue(testElf.isOverlapping(testCaseElf3))
        );
    }
}