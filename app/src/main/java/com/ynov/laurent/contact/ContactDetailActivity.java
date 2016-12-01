package com.ynov.laurent.contact;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.ynov.laurent.contact.Model.Contact;

import static com.ynov.laurent.contact.MainActivity.SELECTED_CONTACT;

public class ContactDetailActivity extends AppCompatActivity {

    Contact selectedContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_detail);


        Bundle bundle = getIntent().getExtras();


        Object object = bundle.getSerializable(SELECTED_CONTACT);
        if (object != null){
            selectedContact =  (Contact)object;
        }


        TextView test = (TextView) findViewById(R.id.test_textview);
        test.setText(selectedContact.firstName);
    }

}
