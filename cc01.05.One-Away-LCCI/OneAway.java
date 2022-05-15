public class OneAway {
    public boolean oneEditAway(String first, String second) {
        int differ = 1;
        int firstLength = first.length();
        int secondLength = second.length();

        if (Math.abs(firstLength - secondLength) > 1) {
            return false;
        }

        for (int i = 0, j = 0; i < firstLength && j < secondLength; i++, j++) {
            if (first.charAt(i) != second.charAt(j)) {
                if (firstLength > secondLength) {
                    j--;
                } else if (firstLength != secondLength) {
                    i--;
                }

                differ--;
                if (differ < 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
