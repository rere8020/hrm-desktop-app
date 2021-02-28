package com.renev.hrm.hrmdesktopapp;

/**
 * Enumeration for FXML view.
 */
public enum FXmlView {
    LOGIN("/fxml/LoginView.fxml");

    private String viewName;

    /**
     * Constructor to instantiate FXmlView.
     *
     * @param viewName the view name
     */
    FXmlView(String viewName) {
        this.viewName = viewName;
    }

    /**
     * Method to get the string representation of the FXML view.
     *
     * @return the string representation of the FXML view
     */
    @Override
    public String toString() {
        return viewName;
    }
}
