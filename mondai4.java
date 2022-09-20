
//IDを"Freeks" passwordを"Freeks0416"で宣言後
//IDとパスワードが一致する場合「会員情報の確認が完了しました」
//どちらか一方でも一致しない場合「IDとパスワードを再度確認して下さい。」と表示されるようなコードを書いてください。

public class mondai4 {  
public static void main(String arg[]){

     String id = "Freeks";
     String password = "Freeks0416";
    
     if(id.equals("Freeks") && password.equals("Freeks0416")) {
       System.out.println("会員情報の確認が完了しました");
     }
    
     else {
       System.out.println("IDとパスワードを再度確認して下さい。");         
     }
}
}