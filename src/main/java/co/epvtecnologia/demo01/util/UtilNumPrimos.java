/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.epvtecnologia.demo01.util;

/**
 *
 * @author usuario
 */
public  class UtilNumPrimos {
    
    
public static boolean validarPrimo(int numero){
   if(numero ==1 || numero ==2)
       return true;
   
   if(numero == 3 || numero == 5 || numero  ==  7 || numero  == 11 || numero  == 17 || numero  == 19)
       return true;
    
    if(numero % 2 ==0 || numero % 3 ==0 || numero % 5 ==0 || numero % 7 ==  0 || numero % 11 == 0 || numero % 13 == 0 || numero % 17 == 0 || numero % 19 == 0)
        return false;
    
    return true;
        
 

}
    
}
