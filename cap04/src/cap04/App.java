package cap04;

import java.util.Set;

public class App {
    public static void main(String[] args) {

        var D = Set.of(
                new Person(1.87, 76.1, 0),
                new Person(1.65, 75.2, 1),
                new Person(1.80, 60.0, 1),
                new Person(1.81, 55.9, 0),
                new Person(1.90, 93.3, 1),
                new Person(1.74, 65.2, 1),
                new Person(1.49, 45.1, 0),
                new Person(1.56, 53.2, 0),
                new Person(1.73, 55.1, 0),
                new Person(1.76, 63.1, 1)
        );

        var t = new Person(1.65, 75.2);

        var algorithm = new KNN();
        var r = algorithm.executeN1(D, t);

        System.out.println(r);

    }

}
