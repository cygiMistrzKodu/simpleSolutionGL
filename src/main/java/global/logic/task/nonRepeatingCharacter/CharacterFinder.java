package global.logic.task.nonRepeatingCharacter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFinder {

    public static final String NO_SINGLE_CHARACTER_FOUND = "no single character found";

    public String findFirstNonRepeatingCharacter(String word) {

        Map<Character, Long> characterAndNumberOfItsOccurrences = word.toUpperCase()
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        Optional<Character> firstNonRepeatCharacter = characterAndNumberOfItsOccurrences.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey()).findFirst();

        if (firstNonRepeatCharacter.isPresent()) {

            String firstCharacter = String.valueOf(firstNonRepeatCharacter.get());

            if (isCharacterWasUpperCase(word, firstCharacter)) {
                return firstCharacter;
            } else {
                return firstCharacter.toLowerCase();
            }

        } else {
            return NO_SINGLE_CHARACTER_FOUND;
        }

    }

    private boolean isCharacterWasUpperCase(String word, String firstCharacter) {
        return word.contains(firstCharacter);
    }

}
