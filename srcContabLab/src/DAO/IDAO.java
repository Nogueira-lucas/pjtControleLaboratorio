/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public interface IDAO {
    
    public void salvar();
    public void alterar();
    public void excluir();
    public ArrayList listar();
}
