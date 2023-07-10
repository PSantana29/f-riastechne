
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
* Classe que representa a tabela Linha_Negocio_Custo
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"Linha_Negocio_Custo\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Linha_Negocio_Custo")
public class Linha_Negocio_Custo implements Serializable {
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
    @Column(name = "linha_negocio_custo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String linha_negocio_custo;


    /**
    * @generated
    */
    @Column(name = "centro_custo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String centro_custo;


    /**
    * Construtor
    * @generated
    */
    public Linha_Negocio_Custo(){
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
    public Linha_Negocio_Custo setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém linha_negocio_custo
    * return linha_negocio_custo
    * @generated
    */
    public java.lang.String getLinha_negocio_custo() {
        return this.linha_negocio_custo;
    }

    /**
    * Define linha_negocio_custo
    * @param linha_negocio_custo linha_negocio_custo
    * @generated
    */
    public Linha_Negocio_Custo setLinha_negocio_custo(java.lang.String linha_negocio_custo) {
        this.linha_negocio_custo = linha_negocio_custo;
        return this;
    }
    /**
    * Obtém centro_custo
    * return centro_custo
    * @generated
    */
    public java.lang.String getCentro_custo() {
        return this.centro_custo;
    }

    /**
    * Define centro_custo
    * @param centro_custo centro_custo
    * @generated
    */
    public Linha_Negocio_Custo setCentro_custo(java.lang.String centro_custo) {
        this.centro_custo = centro_custo;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Linha_Negocio_Custo object = (Linha_Negocio_Custo)obj;
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