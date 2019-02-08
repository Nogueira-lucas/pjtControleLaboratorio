/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import DAO.PCDAO;
import dominio.EEstado;
import dominio.EFileira;
import dominio.EFonte;
import dominio.PC;

/**
 *
 * @author lucas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PC pc = new PC(null, "Gigabyte", "DDR1 2gb", "Intel Atom", EFonte.ATX, EFileira.FILEIRA_1, EEstado.ATIVADO);
        PCDAO dao = new PCDAO();
        
        dao.salvar(pc);
        
    }
    
}
