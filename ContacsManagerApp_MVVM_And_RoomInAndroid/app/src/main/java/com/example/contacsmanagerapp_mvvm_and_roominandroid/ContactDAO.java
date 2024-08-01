package com.example.contacsmanagerapp_mvvm_and_roominandroid;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ContactDAO {
//    DAO specifies a contract for interacting with the databases,including methods for inserting, Updating, Deleting or querying data.

    @Insert   //This annotation marks it as an insert operation methods
    void insert(Contacts contact);

    @Delete   //This annotation marks it as an delete operation methods
    void delete(Contacts contact);


    /*
    You can define custom SQL queries within the DAO methods using the Add query annotation
    This allow you to execute complex database operation while still benefit from rooms type safety
    query annotation allows you to define custom SQL queries and map the result in JAVA or KOTLIN
     */
    @Query("SELECT * FROM  contacts_table")
    List<Contacts> getAllContacts();

}
