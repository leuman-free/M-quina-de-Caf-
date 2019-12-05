/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe.cafe;

import maquinacafe.Bebida;

/**
 *
 * @author drosema
 */
public abstract class Cafe extends Bebida{
    
    @Override
    public String getClase(){
        return "Café";//Retorno la clase
    }
    
}
