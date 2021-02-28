package com.renev.hrm.hrmdesktopapp;

import javafx.application.Application;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Class to represent the application.
 */
@SpringBootApplication
public class HrmDesktopAppApplication extends Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(HrmDesktopAppApplication.class);
    private static ApplicationContext applicationContext;

    /**
     * Method to start the application.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        applicationContext = SpringApplication.run(HrmDesktopAppApplication.class, args);
        Application.launch(args);
    }

    /**
     * Method to start the application.
     *
     * @param primaryStage the primary stage
     * @throws Exception if an error occurs
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        StageManager stageManager = applicationContext.getBean(StageManager.class);
        stageManager.setStage(primaryStage);
        stageManager.switchScene(FXmlView.LOGIN);
        LOGGER.info("HRM desktop application started !!!");
    }

	/**
	 * This method is called when the application should stop, and provides a
	 * convenient place to prepare for application exit and destroy resources.
	 *
	 * <p>
	 * The implementation of this method provided by the Application class does nothing.
	 * </p>
	 *
	 * <p>
	 * NOTE: This method is called on the JavaFX Application Thread.
	 * </p>
	 */
	@Override
	public void stop() throws Exception {
		LOGGER.info("Shutting down application !!!");
		super.stop();
	}
}
