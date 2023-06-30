
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
* Classe que representa a tabela colaborador
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"colaborador\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.colaborador")
public class colaborador implements Serializable {
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
    @Column(name = "matricula", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String matricula;


    /**
    * @generated
    */
    @Column(name = "Email", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String email;


    /**
    * @generated
    */
    @Column(name = "Senha", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String senha;


    /**
    * Construtor
    * @generated
    */
    public colaborador(){
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
    public colaborador setId(java.lang.String id) {
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
    public colaborador setNomeFuncionario(java.lang.String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        return this;
    }
    /**
    * Obtém matricula
    * return matricula
    * @generated
    */
    public java.lang.String getMatricula() {
        return this.matricula;
    }

    /**
    * Define matricula
    * @param matricula matricula
    * @generated
    */
    public colaborador setMatricula(java.lang.String matricula) {
        this.matricula = matricula;
        return this;
    }
    /**
    * Obtém email
    * return email
    * @generated
    */
    public java.lang.String getEmail() {
        return this.email;
    }

    /**
    * Define email
    * @param email email
    * @generated
    */
    public colaborador setEmail(java.lang.String email) {
        this.email = email;
        return this;
    }
    /**
    * Obtém senha
    * return senha
    * @generated
    */
    public java.lang.String getSenha() {
        return this.senha;
    }

    /**
    * Define senha
    * @param senha senha
    * @generated
    */
    public colaborador setSenha(java.lang.String senha) {
        this.senha = senha;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
colaborador object = (colaborador)obj;
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