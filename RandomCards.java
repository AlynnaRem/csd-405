/*     
       Name: Alynna Rem
       Course: CSD-405
       Course Description: Intermediate Java Programming 
       Instructor: Darrell Payne
       File Name: RandomCards.java
       Date: 07/3/2022
       Instructions: 

            Write a program that displays four images randomly selected from a deck of 52 cards. 
            The attached zip file has card files titled 1.png, 2.png, 3.png, 4.png, …, 52.png. For this application:
            Store the images in a cards sub directory.
            Using these cards, randomly select four cards for display.
            You may use a different set of images you either have or decide to make.
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
    Scene scene = new Scene(pane, 300, 200);
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