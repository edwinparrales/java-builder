/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package co.epvtecnologia.demo01;

import co.epvtecnologia.demo01.models.ProductoModel;

/**
 *
 * @author usuario
 */
public class Demo01 {

    public static void main(String[] args) {
        
        ProductoModel pm = new ProductoModel.Builder()
                .nombre("Edwin Parrales")
                 //.fecha(LocalDate.of(1980, Month.MARCH, 5))
                .id(5)
                .valor(45000)
                .build();
        
        
        System.out.println(pm.getId());
        System.out.println(pm.getNombre());
        System.out.println(pm.getFecha());
        System.out.println(pm.getValor());

    }
}
