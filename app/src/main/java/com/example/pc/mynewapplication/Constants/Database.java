package com.example.pc.mynewapplication.Constants;

public final class Database {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Contantos.db";
    public static final String CONTACTS_TABLE_NAME = "Contatos";

    public static final String KEY_ID = "Id";
    public static final String KEY_NAME = "Name";
    public static final String KEY_PHONE = "Phone";
    public static final String KEY_EMAIL = "Email";


    public static final String CONTACTS_TABLE_CREATE = "CREATE TABLE " + CONTACTS_TABLE_NAME +
            " (" + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " + KEY_NAME + " TEXT, " + KEY_PHONE + " TEXT, " + KEY_EMAIL + "TEXT);";

    private Database() {}
}
