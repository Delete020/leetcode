import java.util.Random;

/**
 * @author Delete020
 * @since 6/5/22 9:18 PM
 */
public class GenerateRandomPointinaCircle {
    double r;
    double x;
    double y;
    Random random = new Random();

    public GenerateRandomPointinaCircle(double radius, double x_center, double y_center) {
        r = radius;
        x = x_center;
        y = y_center;
    }

    public double[] randPoint() {
        double area = random.nextDouble() * Math.PI * r * r;
        double radius = Math.sqrt(area / Math.PI);
        double angle = random.nextDouble() * Math.PI * 2;
        return new double[]{(x + Math.cos(angle) * radius), (y + Math.sin(angle) * radius)};
    }
}
