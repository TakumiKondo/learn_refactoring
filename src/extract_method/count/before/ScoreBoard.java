package extract_method.count.before;

import java.util.HashMap;
import java.util.Map;

public class ScoreBoard {
    private Results _results;

    public ScoreBoard(Results results) {
        _results = results;
    }

    void showResult() {
        // Print Header … ① Do not have local valiable
        printHeader();

        // Print result summary … ② Use local valiable
        printResultSummary(aggregate());

    }

    // ① Do not have local valiable
    private void printHeader() {
        System.out.println("*********************************");
        System.out.println("*********   Results    **********");
        System.out.println("*********************************");
    }

    // ② Use local valiable
    private void printResultSummary(Map<String, Integer> scores) {
        for(String key :scores.keySet()) {
            System.out.println("Team : " + key);
            System.out.println("Wins : " + scores.get(key));
        }
    }

    // ③-1 Reassignment local valiable
    private Map<String, Integer> createTeamList(){
        Map<String, Integer> teams = new HashMap<>();
        for(Result result : _results.elements()) {
            teams.put(result.teamName(), 0);
        }
        return teams;
    }

    // ③-2 Reassignment local valiable
    private Map<String, Integer> aggregate(){
        Map<String, Integer> scores = createTeamList();
        for(Result result : _results.elements()) {
            Integer win = result.win() + scores.get(result.teamName());
            scores.put(result.teamName(), win);
        }
        return scores;
    }
}
