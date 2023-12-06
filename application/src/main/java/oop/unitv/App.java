package oop.unitv;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.event.*;
public class App extends Application {
    public void start(Stage stage) {
			System.out.println("start method Called");
			stage.setTitle("MyApp");
			FlowPane rootNode = new FlowPane();
			Label label = new Label("No Key Pressed");
			rootNode.getChildren().add(label);
			Scene scene = new Scene(rootNode,400,300);

			scene.setOnKeyTyped(new EventHandler<KeyEvent>(){
				public void handle(KeyEvent e){
					label.setText("Key "+e.getCharacter()+" pressed");
				}
			});
			
			stage.setScene(scene);
			stage.show();
    }
    public static void main(String[] args) {
        launch();
		}
}