
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela SolicitarFerias
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"SolicitarFerias\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.SolicitarFerias")
public class SolicitarFerias implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "NomeFuncionario", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nomeFuncionario;


    /**
    * @generated
    */
    @Column(name = "Dias", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String dias;


    /**
    * @generated
    */
    @Column(name = "Abono", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String abono;


    /**
    * @generated
    */
    @Column(name = "DecimoTerceiro", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String decimoTerceiro;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DataInicio", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataInicio;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DataFinal", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataFinal;


    /**
    * Construtor
    * @generated
    */
    public SolicitarFerias(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public SolicitarFerias setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nomeFuncionario
    * return nomeFuncionario
    * @generated
    */
    public java.lang.String getNomeFuncionario() {
        return this.nomeFuncionario;
    }

    /**
    * Define nomeFuncionario
    * @param nomeFuncionario nomeFuncionario
    * @generated
    */
    public SolicitarFerias setNomeFuncionario(java.lang.String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        return this;
    }
    /**
    * Obtém dias
    * return dias
    * @generated
    */
    public java.lang.String getDias() {
        return this.dias;
    }

    /**
    * Define dias
    * @param dias dias
    * @generated
    */
    public SolicitarFerias setDias(java.lang.String dias) {
        this.dias = dias;
        return this;
    }
    /**
    * Obtém abono
    * return abono
    * @generated
    */
    public java.lang.String getAbono() {
        return this.abono;
    }

    /**
    * Define abono
    * @param abono abono
    * @generated
    */
    public SolicitarFerias setAbono(java.lang.String abono) {
        this.abono = abono;
        return this;
    }
    /**
    * Obtém decimoTerceiro
    * return decimoTerceiro
    * @generated
    */
    public java.lang.String getDecimoTerceiro() {
        return this.decimoTerceiro;
    }

    /**
    * Define decimoTerceiro
    * @param decimoTerceiro decimoTerceiro
    * @generated
    */
    public SolicitarFerias setDecimoTerceiro(java.lang.String decimoTerceiro) {
        this.decimoTerceiro = decimoTerceiro;
        return this;
    }
    /**
    * Obtém dataInicio
    * return dataInicio
    * @generated
    */
    public java.util.Date getDataInicio() {
        return this.dataInicio;
    }

    /**
    * Define dataInicio
    * @param dataInicio dataInicio
    * @generated
    */
    public SolicitarFerias setDataInicio(java.util.Date dataInicio) {
        this.dataInicio = dataInicio;
        return this;
    }
    /**
    * Obtém dataFinal
    * return dataFinal
    * @generated
    */
    public java.util.Date getDataFinal() {
        return this.dataFinal;
    }

    /**
    * Define dataFinal
    * @param dataFinal dataFinal
    * @generated
    */
    public SolicitarFerias setDataFinal(java.util.Date dataFinal) {
        this.dataFinal = dataFinal;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
SolicitarFerias object = (SolicitarFerias)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}