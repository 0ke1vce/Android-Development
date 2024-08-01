package com.example.contacsmanagerapp_mvvm_and_roominandroid;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


//An Entity is a fundamental component that represents a table in SQLite database
//Each entity class corresponds to one table and fields, properties and variable within the entity class represent column of table
@Entity(tableName = "contacts_table")
public class Contacts {

    @ColumnInfo(name="contact_id")   //use to specify other information of the column
    @PrimaryKey(autoGenerate = true)   //this column is our primary key
    private  int id;

    @ColumnInfo(name = "contact_name")
    private String name;

    @ColumnInfo(name = "contact_email")
    private  String email;


    public Contacts(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Contacts()
    {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}



//DAO-> Data Access Object is an interface that defines a set of methods for performing database operation on entities.
/*
Examples->  Insert, Delete, Update, Select and other queries.
 */