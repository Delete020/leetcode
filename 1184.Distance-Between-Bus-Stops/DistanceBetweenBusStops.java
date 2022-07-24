/**
 * @author Delete020
 * @since 07/24/22 15:20 PM
 */
public class DistanceBetweenBusStops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int forward = 0;
        int backward = 0;
        int n = distance.length;

        for (int i = start; i != destination; i = ++i % n) {
            forward += distance[i];
        }

        for (int i = destination; i != start; i = ++i % n) {
            backward += distance[i];
        }

        return Math.min(forward, backward);
    }
}