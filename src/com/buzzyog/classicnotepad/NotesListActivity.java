package com.buzzyog.classicnotepad;

import android.os.Bundle;
import android.app.Activity;
 
public class NotesListActivity extends Activity {
  
 private NotesDbAdapter mDbHelper;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_list);
         
        mDbHelper = new NotesDbAdapter(this);
        mDbHelper.open();
    }
}