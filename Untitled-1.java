/*     
       Name: Alynna Rem
       Course: CSD-405
       Course Description: Intermediate Java Programming 
       Instructor: Darrell Payne
       File Name: RandomCards2.java
       Date: 07/17/2022
       Instructions: 

            Using the Assignment Cards Zip File attached above (this is the same zip file used in Module 7), write a program that displays four playing cards. In addition, your program should meet the following requirements:
            Below the cards, there will be a refresh button that will then display four different cards.
            All cards will be displayed through random selection.
*/

// Import java util and javafx classes 
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

// Declare a class named RandomCards that extends application.
public class RandomCards extends Application {
    //replace the location variable's value with your image path without removing the prefix 'file:'
    static String location = "file:C:\\Users\\thida\\OneDrive\\Desktop\\Cards\\", fileExt = ".png";
    
    //declare an arraylist of images
    ArrayList<Image> images;

    //container to show images
    HBox imageViews;

    @Override
    public void start(Stage primaryStage) {

        //initialize arraylist
        images = new ArrayList<Image>();

        //load images using a for loop
        for (int i = 0; i < 52; i++) {
            Image im = new Image(location + (i + 1) + fileExt, true);
            images.add(im);
 }

    //define hbox to arrange elements horizontally
    imageViews = new HBox();
    imageViews.setAlignment(Pos.CENTER);//aligning center

    //shuffle cards
    shuffle();

    //add to the imageViews HBox
    add();


    // Define the refresh button and register the event handler
    Button refresh = new Button("Refresh");
    refresh.setOnAction(new EventHandler<ActionEvent>() {

    @Override
    public void handle(ActionEvent event) {

        //shuffle and add again
        shuffle();
        add();
        }
    }
);

    // Define a BorderPane to arrange images and button
    BorderPane pane = new BorderPane();
    pane.setCenter(imageViews);
    pane.setBottom(refresh);

    // Define and display a scene.
    Scene scene = new Scene(pane, 600, 400);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Shuffling cards");
    primaryStage.show();
}

    // declare a method to clear current children of imageViews Hbox and add 4 ImageViews
    public void add() {

        // clear the current images
        imageViews.getChildren().clear();

        // create four imageviews with random card images
        for (int i = 0; i < 4; i++) {
        ImageView im = new ImageView(images.get(i));
        imageViews.getChildren().add(im);
    }
}

    // declare a method to shuffle the images
    public void shuffle() {

        //shuffling the cards list
        Collections.shuffle(images);

}
    // declare the main method to execute the program
    public static void main(String[] args) {
        launch(args);

}

}