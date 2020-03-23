package WarAndPeace;

public class MainWP2 {
    public static void main(String[] args) {
        String WAR2 = "война";
        String AND2 = " и ";
        String PEACE2 = " мир";
        ReadAllBytes readTextService2 = new ReadAllBytes();
        String filePath2 = "D:/Book/WarAndPeace.txt";
        String text = readTextService2.readAllBytesJava7(filePath2);

        ISearchEngine RegExSearchWord = new RegExSearch();
        int wordWAR2 = RegExSearchWord.search(text, WAR2);
        int wordAND2 = RegExSearchWord.search(text, AND2);
        int wordPEACE2 = RegExSearchWord.search(text, PEACE2);


        System.out.println("В книге " + wordWAR2 + " слов " + WAR2);
        System.out.println("В книге " + wordAND2 + " союзов" + AND2);
        System.out.println("В книге " + wordPEACE2 + " слов" + PEACE2);
    }
}