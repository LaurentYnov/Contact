package com.ynov.laurent.contact;

import android.content.Context;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ynov.laurent.contact.Model.Contact;

import java.util.List;

/**
 * Created by laurent on 22/11/2016.
 */
public class ContactAdapater extends ArrayAdapter {


    private Context ctx;


    public ContactAdapater(Context context, int resource, List objects) {
        super(context, resource, objects);
        this.ctx = context;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Item item;

        if (convertView == null) {

            LayoutInflater li = LayoutInflater.from(ctx);
            convertView = li.inflate(R.layout.contact_item, null);

            item = new Item();
            item.firstNameTextView = (TextView) convertView.findViewById(R.id.firstname_textview);
            item.lastNameTextView = (TextView) convertView.findViewById(R.id.lastname_textView);
            convertView.setTag(item);

        }else {
            item = (Item) convertView.getTag();
        }


        Contact contact = (Contact) getItem(position);
        item.lastNameTextView.setText(contact.lastName);
        item.firstNameTextView.setText(contact.firstName);

        return convertView;

    }


    class Item {
        TextView firstNameTextView;
        TextView lastNameTextView;
    }


}
