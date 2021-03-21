package cap04;

import java.util.Set;

public class KNN {

    public int executeN1(Set<Person> D, Person xt) {

        var dMin = Double.MAX_VALUE;

        var idx = 0;

        for (var xi : D) {

            if (d(xi, xt) < dMin) {
                dMin = d(xi, xt);
                idx = xi.getSex();
            }
        }

        return idx;
    }

    private double d(Person xi, Person xt) {
        var sum = Math.pow(xi.getHeight() - xt.getHeight(), 2) + Math.pow(xi.getWeight() - xt.getWeight(), 2);
        return Math.sqrt(sum);
    }

}
