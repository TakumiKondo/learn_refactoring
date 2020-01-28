package extract_method.count.before;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Results {
    private List<Result> _results = new ArrayList<Result>();

    public void add(Result result) {
        _results.add(result);
    }

    public List<Result> elements() {
        return  Collections.unmodifiableList(_results);
    }
}
