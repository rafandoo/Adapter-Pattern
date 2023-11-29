package com.database_system;

import com.database_system.adapter.ClientDatabaseInterface;
import com.database_system.adapter.DatabaseAdapter;
import com.database_system.database.ExemploDatabase;

public class Main {
    public static void main(String[] args) {
        ExemploDatabase exemploDatabase = new ExemploDatabase();
        ClientDatabaseInterface databaseAdapter = new DatabaseAdapter(exemploDatabase);

        databaseAdapter.salvar("Quentin Tarantino");
        String data = databaseAdapter.buscar(1);
        System.out.println(data);
    }
}