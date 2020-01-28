package extract_method.count.after;

import java.util.HashMap;
import java.util.Map;

public class ScoreBoard {
    private Results _results;

    public ScoreBoard(Results results) {
        _results = results;
    }

    void showResult() {
        // Print Header … ① Do not have local valiable
        System.out.println("*********************************");
        System.out.println("*********   Results    **********");
        System.out.println("*********************************");

        // Create Team List … ③-1 Reassignment local valiable
        Map<String, Integer> scores = new HashMap<>();
        for(Result result : _results.elements()) {
            scores.put(result.teamName(), 0);
        }

        // Aggregate by Team … ③-2 Reassignment local valiable
        for(Result result : _results.elements()) {
            Integer win = result.win() + scores.get(result.teamName());
            scores.put(result.teamName(), win);
        }

        // Print result summary … ② Use local valiable
        for(String key :scores.keySet()) {
            System.out.println("Team : " + key);
            System.out.println("Wins : " + scores.get(key));
        }
    }
}
