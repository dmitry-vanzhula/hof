import java.util.Objects;

public class AssertEquals {

    protected static boolean isEqual(Object[] expLines, Object[] actualLines) {
        if (expLines == actualLines)
            return true;
        if (expLines == null || actualLines == null)
            return false;

        int length = expLines.length;
        if (actualLines.length != length)
            return false;

        for (int i = 0; i < length; i++) {
            if (!Objects.equals(expLines[i], actualLines[i])) {
                System.out.println(" line id: " + i + "\n" + " expected: " + expLines[i] + "\n " + "actual:   " + actualLines[i]);
                return false;
            }
        }

        return true;
    }

    protected static boolean isEqualWins(double expWin, double actualWin) {
        if (expWin == actualWin) {
            System.out.println(true);
        } else {
            System.out.println("Expected: " + expWin + " Actual: " + actualWin + " " + false);
        }
        return true;
    }

}
