package application;

import javafx.animation.KeyFrame; 
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Ball {
	int scene_takasa = 500;
    int scene_haba = 500;
	float shoki_x = 150.0f;
	float shoki_y = 100.0f;
	int x = (int)shoki_x;
	int y = (int)shoki_y;
	int ball_hankei = 10;
	int idoX = 1;
	int idoY = 1;
	Circle ball = new Circle(shoki_x,shoki_y,ball_hankei);
	
	
	Timeline animation = new Timeline(
		new KeyFrame(Duration.millis(20),
		new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				if(x < 0 || x > Main.scene_haba - ball_hankei){
					idoX = -1 * idoX;
					}
				if(y < 0 || y > Main.scene_takasa - ball_hankei){
					idoY = -1 * idoY;
				}
				x += idoX;
				y += idoY;
				ball.setLayoutX(x);
				ball.setLayoutY(y);
				
			}
			
		}));

}
