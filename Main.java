package application;
	
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {
	static int scene_takasa = 500;
	static int scene_haba = 500;
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setWidth(scene_haba + 250);
			primaryStage.setHeight(scene_takasa + 250);
			Group root = new Group();
			Scene scene = new Scene(root,scene_takasa,scene_haba);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			Ball ball1 = new Ball();
			ball1.ball.setFill(Color.GREEN);
			root.getChildren().add(ball1.ball);
			ball1.animation.setCycleCount(Timeline.INDEFINITE);
			ball1.animation.play();
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
