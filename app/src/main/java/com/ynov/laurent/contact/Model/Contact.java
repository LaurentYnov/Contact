package com.ynov.laurent.contact.Model;

import android.location.Address;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by laurent on 22/11/2016.
 */

public class Contact implements Serializable {

    private static final long serialVersionUID = 1L;

    public String firstName;
    public String lastName;
    public ArrayList<Adress> addresses;
    public ArrayList<Mail> mails;
    public ArrayList<PhoneNumber> numbers;

    public Contact(String firstName) {
        this.firstName = firstName;
    }
}
