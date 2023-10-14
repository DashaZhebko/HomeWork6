package phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory {

    public void add(Notation notation, List<Notation> phoneDirectory) {
        phoneDirectory.add(notation);
    }

    public Notation find(List<Notation> phoneDirectory, String searchName) {
        for (Notation searchNotation : phoneDirectory) {
            if (searchNotation.getName().equalsIgnoreCase(searchName)) {
                return searchNotation;
            }
        }
        return null;
    }

    public List<Notation> findAll(List<Notation> notations, String searchName) {
        List<Notation> searchResults = new ArrayList<>();

        for (Notation searchNotation : notations) {
            if (searchNotation.getName().equalsIgnoreCase(searchName)) {
                searchResults.add(searchNotation);
            }
        }

        if (!searchResults.isEmpty()) {
            return searchResults;
        }

        return null;
    }

}
