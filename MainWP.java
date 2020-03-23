package WarAndPeace;


public class MainWP {
    public static void main(String[] args) {
        String WAR = "война";
        String AND = " и ";
        String PEACE = " мир";
        ReadAllBytes readTextService = new ReadAllBytes();
        String filePath = "D:/Book/WarAndPeace.txt";
        String text = readTextService.readAllBytesJava7(filePath);

        ISearchEngine EasySearchWord = new EasySearch();
        int wordWAR = EasySearchWord.search(text, WAR);
        int wordAND = EasySearchWord.search(text, AND);
        int wordPEACE = EasySearchWord.search(text, PEACE);


        System.out.println("В книге " + wordWAR + " слов " + WAR);
        System.out.println("В книге " + wordAND + " союзов" + AND);
        System.out.println("В книге " + wordPEACE + " слов" + PEACE);
    }
    }
