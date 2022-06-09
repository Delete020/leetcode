import java.util.Random;

/**
 * @author Delete020
 * @since 6/9/22 11:22 PM
 */
public class ReservoirSamplingRandomPointInNonOverlappingRectangles {
    int[][] rects;
    Random random = new Random();

    public ReservoirSamplingRandomPointInNonOverlappingRectangles(int[][] rects) {
        this.rects = rects;
    }

    public int[] pick() {
        int index = -1;
        int count = 0;

        for (int i = 0; i < rects.length; i++) {
            int x1 = rects[i][0];
            int x2 = rects[i][2];
            int y1 = rects[i][1];
            int y2 = rects[i][3];
            int cur = (x2 - x1 + 1) * (y2 - y1 + 1);
            count += cur;

            if (random.nextInt(count) % count < cur) {
                index = i;
            }
        }

        int x1 = rects[index][0];
        int x2 = rects[index][2];
        int y1 = rects[index][1];
        int y2 = rects[index][3];

        return new int[]{x1 + random.nextInt(x2 - x1 + 1), y1 + random.nextInt(y2 - y1 + 1)};
    }
}
