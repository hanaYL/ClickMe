import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class ClickMe extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	Button button;
	
	@Override
	public void start(Stage primaryStage) {
		
		//Create button
		button = new Button();
		button.setText("Click Me!");
		button.setOnAction(e -> buttonClick());
		
		//Add button to layout pane
		BorderPane pane = new BorderPane();
		pane.setCenter(button);
		
		//Add layout pane to a scene
		Scene scene = new Scene(pane, 300, 250);
		
		//Finalize and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("HelloJavaFX");
		primaryStage.show();
	}
	
	public void buttonClick() {
		if(button.getText() == "Click Me!") {
			button.setText("BinaryBarista JavaFX");
		}
		else {
			button.setText("Click Me!");
		}
	}

}
