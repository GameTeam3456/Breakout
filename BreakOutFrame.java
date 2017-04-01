import java.awt.*;
import javax.swing.*;

public class BreakOutFrame extends JFrame{
		public BreakOutFrame(){
			//タイトルを設定
			setTitle("ブロック崩し");
			
			//メインパネルを作成してフレームに追加
			MainPanel panel = new MainPanel();
			Container contentPane = getContentPane();
			contentPane.add(panel);
			
			//パネルサイズに合わせてフレームを自動設定
			pack();
			
		}
		
		public static void main(String[] args){
			BreakOutFrame frame = new BreakOutFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		}
}
