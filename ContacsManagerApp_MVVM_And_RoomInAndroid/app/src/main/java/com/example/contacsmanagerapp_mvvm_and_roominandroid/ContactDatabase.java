package com.example.contacsmanagerapp_mvvm_and_roominandroid;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Contacts.class},version = 1)
public abstract class ContactDatabase extends RoomDatabase {

    /*
    The database class is an abstract class that serves as the database holder.
    It includes methods to access the DAO and create a database instances
     */

    public abstract ContactDAO getContactDAO();
//    Here linking the Database class with the DAO by using this method


//    Singleton Pattern
    /*
    singleton insures that only one instance of the database exist throughout the application life cucle
     */
    private  static ContactDatabase dbInstance;

    public static  synchronized ContactDatabase getInstance(Context context){
//        getIntance() insures that only one instance of the contactDatabase is created and used throughout app life cycle

        if(dbInstance==null){
            dbInstance= Room.databaseBuilder(context.getApplicationContext(),ContactDatabase.class,"contacts_db").fallbackToDestructiveMigration().build();
        }


        return  dbInstance;
    } //This method is use to provide a contact database when it's cold.


}
