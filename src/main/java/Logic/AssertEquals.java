package Logic;

import java.util.Objects;

public class AssertEquals {

    public static boolean isEqualLines(Object[] expLines, Object[] actualLines){
        if (expLines == actualLines)
            return true;
        if (expLines == null || actualLines == null){
            System.out.println("False!" + "\n" + "Expected or Actual lines have null lines");
            return false;
        }
        if (actualLines.length != expLines.length) {
            System.out.println("False!" + "\n" + "Expected number of lines: " + expLines.length + "\n" + "Actual number of lines: " + actualLines.length);
            return false;
        }

        for (int i = 0; i < expLines.length; i++) {
            if (!Objects.equals(expLines[i], actualLines[i])) {
                System.out.println("False !" + "\n" + " line id: " + i + "\n" + " Expected: " + expLines[i] + "\n " + "Actual:   " + actualLines[i]);
                return false;
            }
        }
        System.out.println("True");
        return true;
    }

    public static boolean isEqualSequences(Object[] expSequence, Object[] actualSequence){
        if (expSequence == actualSequence)
            return true;
        if (expSequence == null || actualSequence == null){
            System.out.println("False!" + "\n" + "Expected or Actual sequences have a null");
            return false;
        }
        if (actualSequence.length != expSequence.length) {
            System.out.println("False!" + "\n" + "Expected size of sequence: " + expSequence.length + "\n" + "Actual size of sequence: " + actualSequence.length);
            return false;
        }

        for (int i = 0; i < expSequence.length; i++) {
            if (!Objects.equals(expSequence[i], actualSequence[i])) {
                System.out.println("False !" + "\n" + " sequence №: " + i + "\n" + " Expected: " + expSequence[i] + "\n " + "Actual:   " + actualSequence[i]);
                return false;
            }
        }
        System.out.println("True");
        return true;
    }

    public static boolean isEqualWins(double expWin, double actualWin) {
        if (expWin == actualWin) {
            System.out.println(true);
        } else {
            System.out.println("Expected: " + expWin + " Actual: " + actualWin + " " + false);
        }
        return true;
    }

}
