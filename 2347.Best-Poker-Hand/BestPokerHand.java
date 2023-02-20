/**
 * @author Delete020
 * @since 02/20/23 21:31 PM
 */
public class BestPokerHand {
    public String bestHand(int[] ranks, char[] suits) {
        boolean equal = true;
        for (int i = 1; i < suits.length && equal; i++) {
            if (suits[i] != suits[i - 1]) equal = false;
        }
        if (equal) return "Flush";
        int max = 0;
        int[] cnt = new int[14];
        for (int i : ranks) {
            max = Math.max(max, ++cnt[i]);
        }
        if (max >= 3) return "Three of a Kind";
        if (max == 2) return "Pair";
        return "High Card";
    }
}