package self;

public class NotElse {
    public static void main(String...strings) {
        String sex = "man";
        String sexStr;

        // Before: else句を使用した場合
        if(sex.equals("man")) {
            sexStr = "男性";
        }else if(sex.equals("woman")){
            sexStr = "女性";
        }else if(sex.equals("other")){
            sexStr = "その他";
        }else {
            sexStr = "未設定";
        }
        System.out.println(sexStr);

        // After: else句を使用しない場合
        sexStr = "未設定";
        if(sex.equals("man")) sexStr = "男性";
        if(sex.equals("woman")) sexStr = "女性";
        if(sex.equals("other")) sexStr = "その他";
        System.out.println(sexStr);
    }
}
