package com.database_system.adapter;

import com.database_system.database.DatabaseInterface;

// src/com/database_system/adapter/DatabaseAdapter.java
public class DatabaseAdapter implements ClientDatabaseInterface {
    private DatabaseInterface database;

    public DatabaseAdapter(DatabaseInterface database) {
        this.database = database;
    }

    @Override
    public void salvar(String data) {
        database.save(data);
    }

    @Override
    public String buscar(int id) {
        return database.get(id);
    }
}