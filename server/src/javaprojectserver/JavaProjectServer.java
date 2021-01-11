
package javaprojectserver;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;
import javafx.stage.WindowEvent;


public class JavaProjectServer extends Application {

    @Override
    public void start(Stage primaryStage) {

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("StartServer.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(JavaProjectServer.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        Scene scene = new Scene(root);
        primaryStage.setTitle("Server GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
        
         
     
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                XoServer.closeServer();
                System.exit(0);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
