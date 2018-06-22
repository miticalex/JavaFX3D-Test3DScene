/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3dscene;

import javafx.application.Application;
import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author AM
 */
public class Test3DScene extends Application {
    private static final double WINDOW_WIDTH = 300;
    private static final double WINDOW_HEIGHT = 50;
    
    Group root = new Group();
    
    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);
        showIsSupported();
        
        primaryStage.setTitle("Test 3D Scene!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    private void showIsSupported(){
        String text = Platform.isSupported(ConditionalFeature.SCENE3D) ? 
                "3D Scene is supported on your machine." :
                "3D Scene is not supported on your machine.";
                
        Text textField = new Text(text);
        textField.setTranslateX(WINDOW_WIDTH/2
                - textField.getBoundsInParent().getWidth()/2);
        textField.setTranslateY(WINDOW_HEIGHT/2
                + textField.getBoundsInParent().getHeight()/3);
                
        root.getChildren().addAll(textField);
    }
}
