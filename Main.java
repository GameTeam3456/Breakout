import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args){
        
       launch(args);　//JavaFXのスレッドを起動
       //startメソッドの呼び出しはJavaFXランタイムが自動的に実行
        
    }  
           
     public void start(Stage theStage){
        theStage.setTitle("BreakOut");
         
         // ルートのコンテナ
        StackPane root = new StackPane();
        
        // シーンの生成
        Scene scene = new Scene(root, 300, 250);

        // シーンをステージに貼る
        stage.setScene(scene);
        
        theStage.show();
         
         
    }
}
    
        
    
