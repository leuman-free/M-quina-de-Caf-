/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe.te;

/**
 *
 * @author drosema
 */
public class Negro extends Te{
    
    @Override
    public String getDescripcion() {
        return "Negro"; //Retorno la descripción
    }

    @Override
    public double getPrecio() {
        return 70; //Retorno el precio del té negro
    }
    
}
