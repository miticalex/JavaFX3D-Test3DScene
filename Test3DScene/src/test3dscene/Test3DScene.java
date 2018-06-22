/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3dscene;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author AM
 */
public class Test3DScene extends Application {
    Group root = new Group();
    
    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(root, 300, 250);
        
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
    
}
