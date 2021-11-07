/***************************************************************************************
 *    Name: Ngo Trong Hieu
 *    ID: 15943
 *    Course: Introduction to Programming
 *    University: Wyższa Szkoła Handlowa we Wrocławiu
 ***************************************************************************************/
package assignments.assignment1;

import static utils.LogUtils.*;

public class Problem3 {
    public static void main(String[] args) {
        printTrianglePattern("a.", TriangleDirection.BottomRight);
        printTrianglePattern("b.", TriangleDirection.TopLeft);
        printTrianglePattern("c.", TriangleDirection.BottomLeft);
        printRhombusPattern("d.");
    }

    /**
     * Corner of the space character.
     */
    private enum TriangleDirection {TopLeft, TopRight, BottomLeft, BottomRight}

    private static void printTrianglePattern(String title, TriangleDirection direction, int numOfRows, char mainChar, char secondaryChar) {
        var pattern = new StringBuilder(title).append("\n");

        for (int row = 0; row < numOfRows; row++) {
            for (int col = 0; col <= numOfRows; col++) {
                char character = false
                        || (direction == TriangleDirection.BottomLeft && col > row)
                        || (direction == TriangleDirection.TopLeft && col >= numOfRows - row)
                        || (direction == TriangleDirection.BottomRight && col < numOfRows - row)
                        ? mainChar : secondaryChar;
                pattern.append(character);
            }
            pattern.append("\n");
        }
        log(pattern);
    }

    private static void printTrianglePattern(String title, TriangleDirection direction) {
        printTrianglePattern(title, direction, 10, '*', ' ');
    }

    private static void printRhombusPattern(String title, int numOfRows, char mainChar, char secondaryChar) {
        var pattern = new StringBuilder(title).append("\n");

        for (int row = 0; row < numOfRows; row++) {
            for (int col = 0; col < numOfRows; col++) {
                Character character = mainChar;
                int half = numOfRows / 2;
                // number of main characters in a half of the current row (not count middle)
                int complement = (row < half) ? row : (numOfRows - row - 1);
                if (col < half - complement || half + complement < col) character = secondaryChar;
                pattern.append(character);
            }
            pattern.append("\n");
        }
        log(pattern);
    }

    private static void printRhombusPattern(String title) {
        printRhombusPattern(title, 10, '*', ' ');
    }
}
