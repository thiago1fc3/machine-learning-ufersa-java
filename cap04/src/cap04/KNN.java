package cap04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class KNN {

    public int execute1NN(Set<Person> D, Person xt) {

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

    public double executeKNN(List<Person> D, Person xt, int k) {

        var dic = new HashMap<Person, Double>();

        for (var xi : D) {
            dic.put(xi, d(xi, xt));
        }

        var neighbors = dic.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(k)
                .map(p -> p.getKey())
                .collect(Collectors.toList());

        var qtyZeros = neighbors.stream().filter(p -> p.getSex() == 0).count();
        var qtyOnes = neighbors.stream().filter(p -> p.getSex() == 1).count();

        return qtyZeros > qtyOnes ? 0 : 1;

    }

    private double d(Person xi, Person xt) {
        var sum = Math.pow(xi.getHeight() - xt.getHeight(), 2) + Math.pow(xi.getWeight() - xt.getWeight(), 2);
        return Math.sqrt(sum);
    }

}
