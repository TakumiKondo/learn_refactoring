package extract_method.count.before;

public class Main {

    public static void main(String...args) {
        Results results = new Results();
        results.add(new Result("ヴィッセル神戸", true));
        results.add(new Result("サンフレッチェ広島", false));

        results.add(new Result("ヴィッセル神戸", true));
        results.add(new Result("名古屋グランパス", false));

        results.add(new Result("ヴィッセル神戸", true));
        results.add(new Result("セレッソ大阪", false));

        results.add(new Result("サンフレッチェ広島", true));
        results.add(new Result("セレッソ大阪", false));

        results.add(new Result("セレッソ大阪", true));
        results.add(new Result("ヴィッセル神戸", false));


        ScoreBoard print = new ScoreBoard(results);
        print.showResult();
    }
}
