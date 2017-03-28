import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application{
    public static void main(String[] args){
        
       launch(args);　//アプリケーションの起動
       //startメソッドの呼び出しはJavaFXランタイムが自動的に実行
        
    }  
           
     public void start(Stage theStage){
        theStage.setTitle("Hello, World!");
        theStage.show();
    }
}
    
        
    
