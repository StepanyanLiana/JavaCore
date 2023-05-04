package independentwork.examen;

import java.util.Comparator;

public class ModelAgeComporator implements Comparator {
    public int compare(Model m1, Model m2) {
        return Integer.compare(m1.getAge(), m2.getAge());
    }

    @Override
    public int compare(Object o, Object t1) {
        return 0;
    }
}

