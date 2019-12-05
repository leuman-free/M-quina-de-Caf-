/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe.cafe;

/**
 *
 * @author drosema
 */
public class Normal extends Cafe{
    
    @Override
    public String getDescripcion() {
        return "Normal"; //Retorno la descripción
    }

    @Override
    public double getPrecio() {
        return 90; //Retorno el precio del café normal
    }
}
