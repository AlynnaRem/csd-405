/*     
       Name: Alynna Rem
       Course: CSD-405
       Course Description: Intermediate Java Programming 
       Instructor: Darrell Payne
       File Name: HBox.java
       Date: 06/26/2022
       Details: The following is an example of how to create an VBox, add spaces between elements, set alignment, and add it to the stage. This example was provided by GeeksforGeeks.com.
*/

// Java Program to create a VBox, add spaces
// between its elements, set an alignment 
// and add it to the stage
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.geometry.Pos;
  
public class VBOX_3 extends Application {
  
    // launch the application
    public void start(Stage stage)
    {
  
        try {
  
            // set title for the stage
            stage.setTitle("VBox");
  
            // create a VBox
            VBox vbox = new VBox(10);
  
            // create a label
            Label label = new Label("this is VBox example");
  
            // add label to vbox
            vbox.getChildren().add(label);
  
            // set alignment
            vbox.setAlignment(Pos.CENTER);
  
            // add buttons to VBox
            for (int i = 0; i < 5; i++)
            {
                vbox.getChildren().add(new Button("Button " + (int)(i + 1)));
            }
  
            // create a scene
            Scene scene = new Scene(vbox, 300, 300);
  
            // set the scene
            stage.setScene(scene);
  
            stage.show();
        }
  
        catch (Exception e) {
  
            System.out.println(e.getMessage());
        }
    }
  
    // Main Method
    public static void main(String args[])
    {
  
        // launch the application
        launch(args);
    }
}