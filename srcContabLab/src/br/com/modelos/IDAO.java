/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelos;

import br.com.dominio.PC;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public interface IDAO {
    
    public boolean salvar(PC o) ;
    public void alterar(Object o);
    public void excluir(Object o);
    public ArrayList<Object> listar();
}
