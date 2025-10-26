/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.epvtecnologia.demo01;

import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class ProductoModel {

    private final int id;
    private final String nombre;
    private final Double valor;
    private final LocalDate fecha;

    public ProductoModel(Builder builder) {

        this.id = builder.id;
        this.nombre = builder.nombre;
        this.valor = builder.valor;
        this.fecha = builder.fecha;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Double getValor() {
        return valor;
    }
    
    
    
    
    

    public static class Builder {

        private int id;
        private String nombre;
        private Double valor;
        private static LocalDate fecha;
        static{
          fecha = LocalDate.now();
        }
        
        //Se inicializa cuando algun campo deba ser obligatorio
        public Builder() {
        }

        public Builder id(int id) {

            this.id = id;
            return this;
        }

        public Builder nombre(String nombre) {

            this.nombre = nombre;
            return this;
        }

        public Builder valor(double valor) {

            this.valor = valor;
            return this;
        }

        public Builder fecha(LocalDate fecha) {

            this.fecha = fecha;
            return this;
        }

        public ProductoModel build() {

            return new ProductoModel(this);
        }

    }

}
