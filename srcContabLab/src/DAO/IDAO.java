/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import dominio.PC;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public interface IDAO {
    
    public Object salvar(Object o);
    public void alterar(Object o);
    public void excluir(Object o);
    public ArrayList<Object> listar();
}
