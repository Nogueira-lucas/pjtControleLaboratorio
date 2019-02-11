/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.dao.PCDAO;
import br.com.dominio.EEstado;
import br.com.dominio.EFileira;
import br.com.dominio.EFonte;
import br.com.dominio.PC;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class PCDAOTeste {
    
    public PCDAOTeste() {
        
    }
    
    @Test
    public void salvarPC(){
        PC pc = new PC(null, "Gigabyte", "DDR1 2GB", "Intel Atom", EFonte.ATX, EFileira.FILEIRA_1, EEstado.ATIVADO);
        PCDAO dao = new PCDAO();
        
        boolean teste = dao.salvar(pc);
        
        assertTrue(teste);
    }
}
