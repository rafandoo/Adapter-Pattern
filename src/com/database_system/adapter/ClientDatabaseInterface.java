package com.database_system.adapter;

// src/com/database_system/adapter/ClientDatabaseInterface.java
public interface ClientDatabaseInterface {
    void salvar(String data);

    String buscar(int id);
}