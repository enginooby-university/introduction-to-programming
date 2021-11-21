//@formatter:off
package labs.lab7;
import lombok.*;
import static utils.LogUtils.*;

public class Problem2 {
    @ToString @AllArgsConstructor
    static class Circle {
        @Getter @Setter private double radius;
        @ToString.Include public double getCircumference() { return 2 * Math.PI * radius; }
        @ToString.Include public double getArea() { return Math.PI * radius * radius; }
    }
}

class MultiCircle {
    public static void main(String[] args) {
        var circle1 = new Problem2.Circle(2d);
        var circle2 = new Problem2.Circle(3d);

        circle1.setRadius(5d);
        circle2.setRadius(4d);

        log(circle1);
        log(circle2);
    }
}
