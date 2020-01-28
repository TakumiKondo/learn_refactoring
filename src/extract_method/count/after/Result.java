package extract_method.count.after;

public class Result {
    private String _teamName;
    private boolean _result;

    public Result(String teamName, boolean result) {
        _teamName = teamName;
        _result = result;
    }

    public String teamName() {
        return _teamName;
    }

    public int win() {
        if(_result == true) return 1;
        return 0;
    }


}
