package com.renev.hrm.hrmdesktopapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Class to represent the stage manager.
 * This class is responsible for switching user interfaces.
 */
@Component
public class StageManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(StageManager.class);
    private Stage stage;
    private FXmlView currentView = null;

    /**
     * Method to switch the scene.
     *
     * @param fXmlView the FXML view
     * @throws IOException if an error occurs
     */
    public void switchScene(FXmlView fXmlView) throws IOException {
        if (currentView != null && currentView.equals(fXmlView)) {
            return;
        }

        Parent parent = FXMLLoader.load(getClass().getResource(fXmlView.toString()));
        Scene scene = new Scene(parent);
        this.stage.setScene(scene);
        this.stage.show();
    }

    /**
     * Method to set the stage.
     *
     * @param primaryStage the primary stage
     */
    public void setStage(Stage primaryStage) {
        if (this.stage == null) {
            this.stage = primaryStage;
        }
    }
}
