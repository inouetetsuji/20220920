
//①int型の変数languageを宣言し1で初期化して下さい。
//②Switch文を使って宣言した数字に応じてプログラミング言語の種類が表示されるようにしてください。
//※番号と言語の対応→1:Java/2:PHP/3:JavaScript/4:HTML/5:Python/その他:該当なし
//③実行時にJavaが出力されるか確認してください。

public class mondai5 {
public static void main(String arg[]) {
 int language = 1;

 switch (language) {
 case 1:
   System.out.println("Java");
   break;

 case 2:
   System.out.println("PHP");
   break;

 case 3:
   System.out.println("JavaScript");
   break;

 case 4:
   System.out.println("HTML");
   break;

 case 5:
   System.out.println("Python");
   break;
  
 default:
   System.out.println("該当なし");
   break;
 }
}
}
