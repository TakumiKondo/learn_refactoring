package self;

public class NotNesting {
    public static void main(String...strings) {

        // 変数(Before, Afterで共通)
        String sex = "man";
        int age = 20;
        String nationality = "Japan";

        // Before : ifがネストした（入れ子状態になった）ケース
        if(nationality != "Japan") {
            if(age < 20) {
                System.out.println("外国籍で未成年");
            }
        }else {
            if(age >= 20) {
                if(sex.equals("man")) {
                    System.out.println("日本国籍で成年男性");
                }else {
                    System.out.println("日本国籍で成年女性");
                }
            }
        }

        // After : ネストしないケース
        //// 初期値
        String nationalityStr = "日本";
        String ageStr = "成年";
        String sexStr = "男性";
        //// 判定
        if(nationality != "Japan") nationalityStr = "外";
        if(age < 20) ageStr = "未成年";
        if(sex.equals("woman")) sexStr = "女性";
        //// 表示
        System.out.println(String.format("%s国籍で%s%s", nationalityStr, ageStr, sexStr));

    }
}
