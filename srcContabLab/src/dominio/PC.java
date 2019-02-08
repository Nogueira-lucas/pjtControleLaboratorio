/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author lucas
 */
@Entity
public class PC implements Serializable{
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

    public PC() {
    
    }
    
    public PC(Integer numero, String placamae, String memoria, String cpu, EFonte fonte, EFileira fileira, EEstado estado) {
        this.numero = numero;
        this.placamae = placamae;
        this.memoria = memoria;
        this.cpu = cpu;
        this.fonte = fonte;
        this.fileira = fileira;
        this.estado = estado;
    }
    
    
    
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
