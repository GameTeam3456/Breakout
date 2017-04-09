import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
    
    static int scene_takasa = 300;
	static int scene_haba = 250;
    
    public static void main(String[] args){
        
       launch(args);　//JavaFXのスレッドを起動
       //startメソッドの呼び出しはJavaFXランタイムが自動的に実行
        
    }  
           
     public void start(Stage theStage){
        theStage.setTitle("BreakOut");
         
         theStage.setWidth(scene_haba + 250);
		 theStage.setHeight(scene_takasa + 250);
         
         // ルートのコンテナ
        StackPane root = new StackPane();
        
        // シーンの生成
        Scene scene = new Scene(root, 300, 250);
         
        Ball ball1 = new Ball();
		ball1.ball.setFill(Color.GREEN);
		root.getChildren().add(ball1.ball);
		ball1.animation.setCycleCount(Timeline.INDEFINITE);
		ball1.animation.play();

        // シーンをステージに貼る
        stage.setScene(scene);
        
        theStage.show();
         
         
    }
}
    
        
    
