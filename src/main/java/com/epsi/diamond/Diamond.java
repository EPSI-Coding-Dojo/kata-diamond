package com.epsi.diamond;

/**
 * Created by thomas on 01/12/14.
 */
public class Diamond {

    private final char myChar;
    public Diamond(char a) {
        myChar = a;
    }

    @Override
    public String toString() {
        StringBuilder representation = new StringBuilder();
        int rank = getRank(myChar);
        for (int i = 0; i < rank; i++) {
            representation.append(generateLine(rank, i));
        }

        for (int i = rank; i >= 0; i--) {
            representation.append(generateLine(rank, i));
        }
        return representation.substring(0, representation.length() - 1);
    }

    private String generateLine(int rankMax, int currentRank) {
        StringBuilder stringBuilder = new StringBuilder();
        String spacesBefore = createSpaces(rankMax - currentRank);
        char currentLetter = getLetter(currentRank);
        String spacesBetween = createSpaces((currentRank * 2) - 1);
        stringBuilder.append(spacesBefore + currentLetter + spacesBetween);
        if (currentRank > 0) {
            stringBuilder.append(currentLetter);
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    private String createSpaces(int nbSpacesBefore) {
        String str = "";
        for (int i = 0; i < nbSpacesBefore; i++) {
            str += " ";
        }
        return str;
    }

    private char getLetter(int i) {
        return (char) ('A' + i);
    }

    private int getRank(char myChar) {
        return myChar - 'A';
    }
}
