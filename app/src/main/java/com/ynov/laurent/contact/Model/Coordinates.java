package com.ynov.laurent.contact.Model;

import java.io.Serializable;

/**
 * Created by laurent on 22/11/2016.
 */

public class Coordinates implements Serializable {

    private static final long serialVersionUID = 1L;

    public CoordType type;

    public Coordinates(CoordType type) {
        this.type = type;
    }
}


class PhoneNumber extends Coordinates {

    public String number;
    public PhoneNumber(CoordType type) {
        super(type);
    }
}

class Adress extends Coordinates{

    public String street;
    public String streetNumber;
    public String postcode;
    public String city;


    public Adress(CoordType type) {
        super(type);
    }
}

class Mail extends Coordinates{

    public String mail;
    public Mail(CoordType type) {
        super(type);
    }
}
