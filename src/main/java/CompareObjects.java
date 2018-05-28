import java.util.Objects;

class CompareObjects {

     static boolean isEqualsLines(Object[] a, Object[] a2) {
        if (a==a2)
            return true;
        if (a==null || a2==null)
            return false;

        int length = a.length;
        if (a2.length != length)
            return false;

        for (int i=0; i<length; i++) {
            if (!Objects.equals(a[i], a2[i])){
                System.out.println(" line id: " + i + "\n" + " expected: " + a[i] + "\n " + "actual:   " + a2[i]);
                return false;
            }
        }

        return true;
    }
}
