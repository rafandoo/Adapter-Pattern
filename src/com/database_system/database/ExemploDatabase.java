package com.database_system.database;

// src/com/database_system/database/ExemploDatabase.java
public class ExemploDatabase implements DatabaseInterface {
  @Override
  public void save(String data) {
    System.out.println("Salvando dado: " + data);
    // Salva dado no banco de dados
  }

  @Override
  public String get(int id) {
    return "Dado com ID: " + id;
    // Busca dado no banco de dados
  }
}
