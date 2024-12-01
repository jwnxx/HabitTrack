package com.example.habittrack.ui.login;

/**
 * Class exposing authenticated user details to the UI.
 */
class LoggedInUserView {
    private String userName;
    //... other data fields that may be accessible to the UI

    LoggedInUserView(String userName) {
        this.userName = userName;
    }

    String getDisplayName() {
        return userName;
    }
}