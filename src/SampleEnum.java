
public class SampleEnum {
    //列挙型Genderの定義
    public static enum Gender {
        MALE,
        FEMALE
    }

    public static void main(String[] args) {
        // Gender型の宣言と初期化
        Gender gender0 = Gender.MALE;
        Gender gender1 = Gender.FEMALE;
        
        //genderの利用
        System.out.println(gender0);
        System.out.println(gender1);
        
        //採番された数値を取得したい場合は　変数名.ordinal() と書く
        System.out.println(gender0.ordinal());
        System.out.println(gender1.ordinal());
    }

}
