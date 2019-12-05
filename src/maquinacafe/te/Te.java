/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe.te;

import maquinacafe.Bebida;

/**
 *
 * @author drosema
 */
public abstract class Te extends Bebida{
    
    @Override
    public String getClase(){
        return "Té";//Retorno la clase
    }
}
