
//①String型の変数cityを宣言して"Tokyo"で初期化してください。
//②if文を使って
//cityが"Seoul"の時"韓国の首都です。"
//cityが"Beijing"の時"中国の首都です。"
//cityが"Tokyo"の時"日本の首都です。"
//上記のもの以外の時"再度確認してください。"と表示されるようにしてください。
//③実行時に"日本の首都です。"と表示されるか確認してください。


public class mondai3 {
public static void main(String arg[]){

 String city = "Tokyo";

 if(city.equals("Seoul")) {
   System.out.println("韓国の首都です。");

 }else if(city.equals("Beijing")){
   System.out.println("中国の首都です。");

 }else if(city.equals("Tokyo")){
   System.out.println("日本の首都です。");

 }else {
   System.out.println("再度確認してください。");
 }
}
}
