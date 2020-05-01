package self;

public class NotElse {
    public static void main(String...strings) {
        String sex = "man";
        String sexStr = "";
        System.out.println("sex : " + sex);

        // Before: else句を使用した場合
        long b_start = System.currentTimeMillis();

        for(long i = 0; i < 1000000000; i++) {
            if(sex.equals("man")) {
                sexStr = "男性";
            }else if(sex.equals("woman")){
                sexStr = "女性";
            }else if(sex.equals("other")){
                sexStr = "その他";
            }else {
                sexStr = "未設定";
            }
        }
        System.out.println(sexStr);

        long b_end = System.currentTimeMillis();
        System.out.println("else 有り(milli sec) : " + (b_end - b_start));


        // After: else句を使用しない場合
        long a_start = System.currentTimeMillis();

        for(long i = 0; i < 1000000000; i++) {
            sexStr = "未設定";
            if(sex.equals("man")) sexStr = "男性";
            if(sex.equals("woman")) sexStr = "女性";
            if(sex.equals("other")) sexStr = "その他";
        }

        long a_end = System.currentTimeMillis();
        System.out.println("else 無し(milli sec) : " + (a_end - a_start));

        // After and Refactoring: メソッド切り出しした場合
        long ar_start = System.currentTimeMillis();

        for(long i = 0; i < 1000000000; i++) {
            sexStr = sexStr(sex);
        }

        long ar_end = System.currentTimeMillis();
        System.out.println("else 無し[メソッド切り出し](milli sec) : " + (ar_end - ar_start));
    }

    /**
     * sexを日本語の性別に変換
     * @param sex
     * @return sexStr
     */
    public static String sexStr(String sex) {
        if(sex.equals("man")) return "男性";
        if(sex.equals("woman")) return "女性";
        if(sex.equals("other")) return "その他";
        return "未設定";
    }
}