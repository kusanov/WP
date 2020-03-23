package WarAndPeace;

public class EasySearch implements ISearchEngine {
    @Override
    public int search(String text, String word) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(word, index)) != -1) {
            count++;
            index++;
        }
        return count;
    }
}
