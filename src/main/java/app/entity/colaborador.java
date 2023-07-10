
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
    * @generated
    */
    @Column(name = "Confirmarsenha", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String confirmarsenha;


    /**
    * @generated
    */
    @Column(name = "cpf", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cpf;


    /**
    * @generated
    */
    @Column(name = "centro_custo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String centro_custo;


    /**
    * @generated
    */
    @Column(name = "LinhaNegocio", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String linhaNegocio;


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
    * Obtém confirmarsenha
    * return confirmarsenha
    * @generated
    */
    public java.lang.String getConfirmarsenha() {
        return this.confirmarsenha;
    }

    /**
    * Define confirmarsenha
    * @param confirmarsenha confirmarsenha
    * @generated
    */
    public colaborador setConfirmarsenha(java.lang.String confirmarsenha) {
        this.confirmarsenha = confirmarsenha;
        return this;
    }
    /**
    * Obtém cpf
    * return cpf
    * @generated
    */
    public java.lang.String getCpf() {
        return this.cpf;
    }

    /**
    * Define cpf
    * @param cpf cpf
    * @generated
    */
    public colaborador setCpf(java.lang.String cpf) {
        this.cpf = cpf;
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
    public colaborador setCentro_custo(java.lang.String centro_custo) {
        this.centro_custo = centro_custo;
        return this;
    }
    /**
    * Obtém linhaNegocio
    * return linhaNegocio
    * @generated
    */
    public java.lang.String getLinhaNegocio() {
        return this.linhaNegocio;
    }

    /**
    * Define linhaNegocio
    * @param linhaNegocio linhaNegocio
    * @generated
    */
    public colaborador setLinhaNegocio(java.lang.String linhaNegocio) {
        this.linhaNegocio = linhaNegocio;
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