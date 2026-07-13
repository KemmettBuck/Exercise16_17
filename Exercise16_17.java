/**
 * Exercise16_17
 * Display "Show Colors" with sliders to
 * control colors: red, green, blue, and the opacity
 * 
 * Author: Kira Emmett Buck
 * Course: Java - Ivy Tech Community College
 */

import org.w3c.dom.Text;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class Exercise16_17 extends Application {
    @Override
    public void start(Stage primaryStage) {
        //Create "Show Colors"
        Text text = new Text("Show Colors");
        text.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        text.setFill(Color.color(0, 0, 0, 1.0)); //default: black

        // Sliders for red, green, blue, and opacity
        Slider redSlider        = new Slider(0,1,0);
        Slider greenSlider      = new Slider(0,1,0);
        Slider blueSlider       = new Slider(0,1,0);
        Slider opacitySlider    = new Slider(0,1,1); //default: fully opaque

        //Slider width
        redSlider.setPrefWidth(200);
        greenSlider.setPrefWidth(200);
        blueSlider.setPrefWidth(200);
        opacitySlider.setPrefWidth(200);

        // visual markers for sliders using "TickMarks"
        redSlider.setShowTickMarks(true);
        greenSlider.setShowTickMarks(true);
        blueSlider.setShowTickMarks(true);
        opacitySlider.setShowTickMarks(true);

        // labels for the sliders
        Label redLabel      = new Label("Red");
        Label greenLabel    = new Label("Green");
        Label blueLabel     = new Label("Blue");
        Label opacityLabel  = new Label("Opacity");

        // Update text color for slider changes
        redSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            updateColor(text, redSlider, greenSlider, blueSlider, opacitySlider);
        });
        greenSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            updateColor(text, redSlider, greenSlider, blueSlider, opacitySlider);
        });
        blueSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            updateColor(text, redSlider, greenSlider, blueSlider, opacitySlider);
        });
        opacitySlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            updateColor(text, redSlider, greenSlider, blueSlider, opacitySlider);
        });

        // GridPane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));
        gridPane.setAlignment(Pos.CENTER);

        // Add labels and sliders (column, row)
        gridPane.add(redLabel,      0,0);
        gridPane.add(redSlider,     1,0);
        gridPane.add(greenLabel,    0,1);
        gridPane.add(greenSlider,   1,1);
        gridPane.add(blueLabel,     0,2);
        gridPane.add(blueSlider,    1,2);
        gridPane.add(opacityLabel,  0,3);
        gridPane.add(opacitySlider, 1,3);

    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
