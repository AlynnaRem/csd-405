/*     
       Name: Alynna Rem
       Course: CSD-405
       Course Description: Intermediate Java Programming 
       Instructor: Darrell Payne
       Module 10 Programming Assignment
       File Name: shapeFillSelector.java
       Date: 07/23/2022
       Instructions: 

            Write a program that displays various figures such as a Circle, a Rectangle, or an Ellipse.
            Include radio buttons selections for changing the display figure to the one selected.
            Include a checkbox for filling and clearing the displayed figure with a random color.
*/

// Import java util and javafx classes 
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

// Create a class that inherits the Application class of the javafx.application package.
public class module11 extends Application {

    // Declare variables
    Shape currentShape;
    Color currentFill = null;
    // Create border pane 
    BorderPane pane = new BorderPane();

    // Create shape objects and set the size/properties
    Circle circle = new Circle(100);
    Rectangle rectangle = new Rectangle(200, 100);
    Ellipse ellipse = new Ellipse(100, 50);

    // Declare main method to execute the program
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Set padding
        pane.setPadding(new Insets(20, 20, 20, 20));

        // create a toggle button group 
        ToggleGroup group = new ToggleGroup();

        // Define VBox to arrange items vertically
        VBox controlBox = new VBox();

        // Define radio buttons for each shape
        RadioButton circleButton = new RadioButton("Circle");
        RadioButton rectangleButton = new RadioButton("Rectangle");
        RadioButton ellipseButton = new RadioButton("Ellipse");

        // Set radio buttons to toggle button group, so only one button can be clicked at a time.
        circleButton.setToggleGroup(group);
        rectangleButton.setToggleGroup(group);
        ellipseButton.setToggleGroup(group);

        // select circle button when program is executed
        circleButton.setSelected(true);
        switchShape(circle);

        // get the list of children from parent class and add the radio buttons
        controlBox.getChildren().addAll(rectangleButton, circleButton, ellipseButton);

        // Define check box with a title of fill
        CheckBox fillCheckBox = new CheckBox("Fill");

        // get the list of children from the parent class and add the fill checkbox
        controlBox.getChildren().add(fillCheckBox);

        // Set the pane to the bottom
        pane.setBottom(controlBox);

        // Add event handler for togglegroup to change the shape according to radio button selected.
        group.selectedToggleProperty().addListener((observableValue, toggle, t1) -> {
            if (t1 == rectangleButton) {
                switchShape(rectangle);
            } else if (t1 == circleButton) {
                switchShape(circle);
            } else if (t1 == ellipseButton) {
                switchShape(ellipse);
            }
        });

        // Add event handler for check box.
        fillCheckBox.setOnAction(e -> {
            if (fillCheckBox.isSelected()) {
                // If the checkbox is selected, fill with random color
                currentFill = Color.color(Math.random(), Math.random(), Math.random());
            } else {
                // If the checkbox is not selected, do not fill
                currentFill = null;
            }
            currentShape.setFill(currentFill);
        });

        // Set checkbox to no fill when the program is executed
        fillCheckBox.setSelected(false);

        // Set the title of the stage
        primaryStage.setTitle("Shape and Color Selector");
        // Add a scene to the stage and set the size
        primaryStage.setScene(new Scene(pane, 600, 600));
        // Display the contents of the stage
        primaryStage.show();
    }

    // Declare method to keep fill color and stroke when a different shape is selected.
    public void switchShape(Shape shape) {
        currentShape = shape;
        pane.setCenter(currentShape);
        currentShape.setFill(currentFill);
        currentShape.setStroke(Color.BLACK);
    }
}