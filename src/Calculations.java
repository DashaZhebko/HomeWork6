import java.util.ArrayList;
import java.util.List;

public class Calculations {

    public int countOccurrence(List<String> words, String checkWord) {
        int counter = 0;
        for (String word : words) {
            if (word.equals(checkWord))
                counter++;
        }
        return counter;
    }

    public List<Integer> toList(Integer[] numbers) {
        return List.of(numbers);
    }


    public List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> uniqueNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        return uniqueNumbers;
    }

    public void calcOccurrence(List<String> words) {

        for (int i = 0; i < words.size(); i++) {
            String findWord = words.get(i);

            if (!words.subList(0, i).contains(findWord)) {
                int count = countOccurrence(words, findWord);
                System.out.println(findWord + " : " + count);
            }
        }
    }

    public List<List<String>> findOccurrence(List<String> words) {

        List<List<String>> totalResult = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            String findWord = words.get(i);

            if (!words.subList(0, i).contains(findWord)) {
                int count = countOccurrence(words, findWord);
                List<String> result = new ArrayList<>();
                result.add("name: " + findWord);
                result.add("occurrence :" + count);
                totalResult.add(result);
            }

        }
        return totalResult;
    }


}

