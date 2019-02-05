/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.boot.registry.selector.spi.StrategySelector;

/**
 *
 * @author lucas
 */
@Entity
public class PC {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer numero;
    @Column
    private String placamae;
    @Column
    private String memoria;
    @Column
    private String cpu;
    @Column
    private EFonte fonte;
    @Column
    private EFileira fileira;
    @Column
    private EEstado estado;
    
    public EFileira getFileira() {
        return fileira;
    }

    public void setFileira(EFileira fileira) {
        this.fileira = fileira;
    }

    public EEstado getEstado() {
        return estado;
    }

    public void setEstado(EEstado estado) {
        this.estado = estado;
    }
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public EFonte getFonte() {
        return fonte;
    }

    public void setFonte(EFonte fonte) {
        this.fonte = fonte;
    }

    public String getPlacamae() {
        return placamae;
    }

    public void setPlacamae(String placamae) {
        this.placamae = placamae;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
   
}
