package com.roadsideemergencies.vik.roademergencies.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.roadsideemergencies.vik.roademergencies.models.Contact;
import com.roadsideemergencies.vik.roademergencies.models.User;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class DatabaseHelper extends SQLiteOpenHelper {
 
    // Logcat tag
    private static final String LOG = "DatabaseHelper";
 
    // Database Version
    private static final int DATABASE_VERSION = 1;
 
    // Database Name
    private static final String DATABASE_NAME = "roadEmergencies";

    // Table Names
    private static final String TABLE_USERS = "users";
    private static final String TABLE_CONTACT = "contacts";
    private static final String TABLE_USERS_TAG = "todo_tags";
 
    // Common column names
    private static final String KEY_ID = "id";
    private static final String KEY_PHONE_NUMBER = "created_at";
 
    // NOTES Table - column nmaes
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD = "password";

    // TAGS Table - column names
    private static final String KEY_CONTACT_NAME = "tag_name";

    // NOTE_TAGS Table - column names
    private static final String KEY_TODO_ID = "todo_id";
    private static final String KEY_TAG_ID = "tag_id";

    // Table Create Statements
    // Todo table create statement
    private static final String CREATE_TABLE_USERS = "CREATE TABLE "
            + TABLE_USERS + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_USERNAME
            + " TEXT," + KEY_PASSWORD + " TEXT," + KEY_PHONE_NUMBER
            + " DATETIME" + ")";

    private static final String KEY_USER_ID = "user_id";

    // Tag table create statement
    private static final String CREATE_TABLE_CONTACT = "CREATE TABLE " + TABLE_CONTACT
            + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_CONTACT_NAME + " TEXT,"
            + KEY_PHONE_NUMBER + " TEXT, " + KEY_USER_ID + " INTEGER "+ ")";
 
    // todo_tag table create statement
    private static final String CREATE_TABLE_TODO_TAG = "CREATE TABLE "
            + TABLE_USERS_TAG + "(" + KEY_ID + " INTEGER PRIMARY KEY,"
            + KEY_TODO_ID + " INTEGER," + KEY_TAG_ID + " INTEGER,"
            + KEY_PHONE_NUMBER + " DATETIME" + ")";
 
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("DatabaseHelper", "db created");
        // creating required tables
        db.execSQL(CREATE_TABLE_USERS);
        db.execSQL(CREATE_TABLE_CONTACT);
        db.execSQL(CREATE_TABLE_TODO_TAG);
    }
 
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACT);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS_TAG);
        // create new tables
        onCreate(db);
    }

    public long createUser(User user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_USERNAME, user.getUserName());
        values.put(KEY_PASSWORD, user.getPassword());
        values.put(KEY_PHONE_NUMBER, getDateTime());
        values.put(KEY_ID, user.getId());
        // insert row
        long userId = db.insert(TABLE_USERS, null, values);
        return userId;
    }



    public long createQuickConnectContact(Contact contact) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_CONTACT_NAME, contact.getName());
        values.put(KEY_PHONE_NUMBER, contact.getPhoneNumber());
        values.put(KEY_USER_ID, contact.getUserId());
        values.put(KEY_ID, contact.getId());
        // insert row
        long userId = db.insert(TABLE_CONTACT, null, values);
        return userId;
    }


    /**
     * get single todo
     */
    public User getUser(long userId) {
        SQLiteDatabase db = this.getReadableDatabase();
        String selectQuery = "SELECT  * FROM " + TABLE_USERS + " WHERE " + KEY_ID + " = " + userId;
        Log.e(LOG, selectQuery);
        Cursor c = db.rawQuery(selectQuery, null);
        if (c != null)
            c.moveToFirst();
        User user = new User();
        user.setId(c.getInt(c.getColumnIndex(KEY_ID)));
        user.setUserName((c.getString(c.getColumnIndex(KEY_USERNAME))));
        user.setPassword((c.getString(c.getColumnIndex(KEY_PASSWORD))));
        user.setCreatedAt(c.getString(c.getColumnIndex(KEY_PHONE_NUMBER)));
        return user;
    }

    public User getUser(String userName ,String password) {
        User user = null;
        SQLiteDatabase db = this.getReadableDatabase();
        String selectQuery = "SELECT  * FROM " + TABLE_USERS + " WHERE " + KEY_USERNAME + " = " + "'"+userName+"'"  +" AND "+ KEY_PASSWORD+ " = " + "'"+password+"'";
        Log.e(LOG, selectQuery);
        Cursor c = db.rawQuery(selectQuery, null);
        if (c != null && c.moveToFirst()){
            user = new User();
            user.setId(c.getInt(c.getColumnIndex(KEY_ID)));
            user.setUserName((c.getString(c.getColumnIndex(KEY_USERNAME))));
            user.setPassword((c.getString(c.getColumnIndex(KEY_PASSWORD))));
            user.setCreatedAt(c.getString(c.getColumnIndex(KEY_PHONE_NUMBER)));
        }
        return user;
    }

    public ArrayList<Contact> getAllContacts() {
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        String selectQuery = "SELECT  * FROM " + TABLE_USERS;
        Log.e(LOG, selectQuery);
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                Contact contact = new Contact(c.getInt((c.getColumnIndex(KEY_ID))));
                contact.setName((c.getString(c.getColumnIndex(KEY_CONTACT_NAME))));
                contact.setPhoneNumber((c.getString(c.getColumnIndex(KEY_PHONE_NUMBER))));
                contact.setUserId(c.getInt(c.getColumnIndex(KEY_USER_ID)));
                contacts.add(contact);
            } while (c.moveToNext());
        }
        return contacts;
    }

    /**
     * getting all users
     * */
    public ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<User>();
        String selectQuery = "SELECT  * FROM " + TABLE_USERS;
        Log.e(LOG, selectQuery);
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                User user = new User();
                user.setId(c.getInt((c.getColumnIndex(KEY_ID))));
                user.setUserName((c.getString(c.getColumnIndex(KEY_USERNAME))));
                user.setPassword((c.getString(c.getColumnIndex(KEY_PASSWORD))));
                user.setCreatedAt(c.getString(c.getColumnIndex(KEY_PHONE_NUMBER)));
                // adding to todo list
                users.add(user);
            } while (c.moveToNext());
        }

        return users;
    }

    /**
     * getting users count
     */
    public int getUsersCount() {
        String countQuery = "SELECT  * FROM " + TABLE_USERS;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        // return count
        return count;
    }

    /**
     * Updating a user
     */
    public int updateUser(User user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_USERNAME, user.getUserName());
        values.put(KEY_PASSWORD, user.getPassword());
        // updating row
        return db.update(TABLE_USERS, values, KEY_ID + " = ?", new String[] { String.valueOf(user.getId()) });
    }

    /**
     * Deleting a todo
     */
    public void deleteUser(int userId) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_USERS, KEY_ID + " = ?", new String[] { String.valueOf(userId) });
    }

    // closing database
    public void closeDB() {
        SQLiteDatabase db = this.getReadableDatabase();
        if (db != null && db.isOpen())
            db.close();
    }

    /**
     * get datetime
     * */
    private String getDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Date date = new Date();
        return dateFormat.format(date);
    }
}
