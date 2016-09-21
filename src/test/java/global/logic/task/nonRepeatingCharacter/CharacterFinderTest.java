package global.logic.task.nonRepeatingCharacter;

import global.logic.task.nonRepeatingCharacter.CharacterFinder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterFinderTest {

    CharacterFinder characterFinder = new CharacterFinder();

    @Test
    public void whenInput_Streets_Then_r() {

        String expectedCharacter = "r";
        String actualCharacter = characterFinder.findFirstNonRepeatingCharacter("Streets");

        assertEquals(expectedCharacter, actualCharacter);

    }

    @Test
    public void whenInput_wUKgIkLLiW_Then_U() {

        String expectedCharacter = "U";
        String actualCharacter = characterFinder.findFirstNonRepeatingCharacter("wUKgIkLLiW");

        assertEquals(expectedCharacter, actualCharacter);

    }

    @Test
    public void whenAllCharactersRepeatsThenNotFoundInfo() {

        String expectedCharacter = "no single character found";
        String actualCharacter = characterFinder.findFirstNonRepeatingCharacter("aaBBFFgGooO");

        assertEquals(expectedCharacter, actualCharacter);

    }

}
