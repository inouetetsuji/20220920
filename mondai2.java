//int型の変数oldを宣言し25で初期化してください。（年齢の設定）

//if文と演算子を利用して
//1歳以下の時「入場料は無料です。」
//２歳から10歳は「入場料は500円です。」
//11歳から18歳は「入場料は700円です。」
//その他「入場料は1000円です。」
//と出力させるコードを書いてください。

public class mondai2 {
public static void main(String arg[]) {

 int old = 25;

 if(old <= 1) {
   System.out.println("入場料は無料です。");
  
 }else if(2 <= old && old <= 10) {
   System.out.println("入場料は500円です。");
  
 }else if(11<=old && old <= 18) {
   System.out.println("入場料は700円です。");
  
 }else {
   System.out.println("入場料は1000円です。");
 }
}
}
