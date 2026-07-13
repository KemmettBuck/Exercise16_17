/**
 * Exercise16_17
 * Display "Show Colors" with sliders to
 * control colors: red, green, blue, and the opacity
 * 
 * Author: Kira Emmett Buck
 * Course: Java - Ivy Tech Community College
 */

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
        text.setFill(Color.color(0, 0, 0, 1.0)); //default black

        // Sliders for red, green, blue, and opacity
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
