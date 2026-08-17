/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elkin jimenez
 */
public class Main {
    
    static ArrayList<Customer> customer = new ArraayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public void crearCliente(int id, String nombre, String telefono, String correo) {
    Cliente nuevoCliente = new Cliente(id, nombre, telefono, correo);
    listaClientes.add(nuevoCliente);
   }
}
