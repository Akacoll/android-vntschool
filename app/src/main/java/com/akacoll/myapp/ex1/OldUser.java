package com.akacoll.myapp.ex1;

import androidx.annotation.Nullable;

public class OldUser {

    @Nullable
    private String firstName;
    @Nullable
    private String lastName;

    public OldUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}