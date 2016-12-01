package com.ynov.laurent.contact.Model;

import android.location.Address;
import android.provider.ContactsContract;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by laurent on 22/11/2016.
 */

public class FakeContacts {

    private int numberOfFake = 0;
    private int numberOfCoords = 0;

    private ArrayList<Mail> fakeMails = new ArrayList<Mail>();
    private ArrayList<PhoneNumber> fakeNumbers = new ArrayList<PhoneNumber>();
    private ArrayList<Adress> fakeAdresses = new ArrayList<Adress>();

    public FakeContacts(int numberOfFake,int numberOfCoord) {
        this.numberOfFake = numberOfFake;
        this.numberOfCoords = numberOfCoord;
        loadFakes();
    }

    public ArrayList<Contact> createFakes () {
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        for (int i=0; i < numberOfFake; i++) {
            String index = Integer.toString(i);
            Contact contact = new Contact("contact firstname"+index);
            contact.lastName = "contact lastName" + index;
            contact.addresses = fakeAdresses;
            contact.mails = fakeMails;
            contact.numbers = fakeNumbers;
            contacts.add(contact);
        }
        return contacts;
    }

    private void loadFakes() {
        loadFakeMails();
        loadFakeNumbers();
        loadFakeAdress();
    }

    private void loadFakeAdress() {
        for (int i=0; i < numberOfCoords; i++) {
            String index = Integer.toString(i);
            Adress adress = new Adress(CoordType.HOME);
            adress.streetNumber = index;
            adress.street = "street_" + index;
            adress.postcode = "POSTCODE" + index;
            adress.city = "BORDEAUX";
            fakeAdresses.add(adress);
        }
    }

    private void loadFakeNumbers() {
        for (int i=0; i < numberOfCoords; i++) {
            String index = Integer.toString(i);
            PhoneNumber phone = new PhoneNumber(CoordType.HOME);
            phone.number = "055656565" + index;
            fakeNumbers.add(phone);
        }
    }

    private void loadFakeMails() {
        for (int i=0; i < numberOfCoords; i++) {
            String index = Integer.toString(i);
            Mail fakeMail = new Mail(CoordType.HOME);
            fakeMail.mail = "mail_" + index + "@ynov.com";
            fakeMails.add(fakeMail);
        }
    }
}
