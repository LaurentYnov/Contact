package com.ynov.laurent.contact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.ynov.laurent.contact.Model.Contact;
import com.ynov.laurent.contact.Model.Coordinates;
import com.ynov.laurent.contact.Model.FakeContacts;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    public final static String SELECTED_CONTACT = "com.ynov.contact.selected";

    ArrayList<Contact> contacts;

    ContactAdapater adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadContacts();

        ListView listView = (ListView) findViewById(R.id.contact_listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    private void loadContacts() {
        FakeContacts faker = new FakeContacts(5,3);
        contacts = faker.createFakes();
        adapter = new ContactAdapater(this,R.id.contact_listview,contacts);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        Intent intent = new Intent(this, ContactDetailActivity.class);
        Contact selectedContact = contacts.get(position);
        Bundle bundle = new Bundle();
        bundle.putSerializable(SELECTED_CONTACT, selectedContact);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
