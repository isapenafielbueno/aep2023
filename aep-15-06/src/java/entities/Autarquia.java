/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author isape
 */
@Entity
@Table(name = "autarquia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Autarquia.findAll", query = "SELECT a FROM Autarquia a")
    , @NamedQuery(name = "Autarquia.findByIDautarquia", query = "SELECT a FROM Autarquia a WHERE a.iDautarquia = :iDautarquia")
    , @NamedQuery(name = "Autarquia.findByNomeAutarquia", query = "SELECT a FROM Autarquia a WHERE a.nomeAutarquia = :nomeAutarquia")
    , @NamedQuery(name = "Autarquia.findByCnpjAutarquia", query = "SELECT a FROM Autarquia a WHERE a.cnpjAutarquia = :cnpjAutarquia")
    , @NamedQuery(name = "Autarquia.findByDiretorAutarquia", query = "SELECT a FROM Autarquia a WHERE a.diretorAutarquia = :diretorAutarquia")
    , @NamedQuery(name = "Autarquia.findByEnderecoAutarquia", query = "SELECT a FROM Autarquia a WHERE a.enderecoAutarquia = :enderecoAutarquia")
    , @NamedQuery(name = "Autarquia.findByCidadeAutarquia", query = "SELECT a FROM Autarquia a WHERE a.cidadeAutarquia = :cidadeAutarquia")})
public class Autarquia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_autarquia")
    private Short iDautarquia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "nome_autarquia")
    private String nomeAutarquia;
    @Size(max = 14)
    @Column(name = "cnpj_autarquia")
    private String cnpjAutarquia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "diretor_autarquia")
    private String diretorAutarquia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "endereco_autarquia")
    private String enderecoAutarquia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "cidade_autarquia")
    private String cidadeAutarquia;

    public Autarquia() {
    }

    public Autarquia(Short iDautarquia) {
        this.iDautarquia = iDautarquia;
    }

    public Autarquia(Short iDautarquia, String nomeAutarquia, String diretorAutarquia, String enderecoAutarquia, String cidadeAutarquia) {
        this.iDautarquia = iDautarquia;
        this.nomeAutarquia = nomeAutarquia;
        this.diretorAutarquia = diretorAutarquia;
        this.enderecoAutarquia = enderecoAutarquia;
        this.cidadeAutarquia = cidadeAutarquia;
    }

    public Short getIDautarquia() {
        return iDautarquia;
    }

    public void setIDautarquia(Short iDautarquia) {
        this.iDautarquia = iDautarquia;
    }

    public String getNomeAutarquia() {
        return nomeAutarquia;
    }

    public void setNomeAutarquia(String nomeAutarquia) {
        this.nomeAutarquia = nomeAutarquia;
    }

    public String getCnpjAutarquia() {
        return cnpjAutarquia;
    }

    public void setCnpjAutarquia(String cnpjAutarquia) {
        this.cnpjAutarquia = cnpjAutarquia;
    }

    public String getDiretorAutarquia() {
        return diretorAutarquia;
    }

    public void setDiretorAutarquia(String diretorAutarquia) {
        this.diretorAutarquia = diretorAutarquia;
    }

    public String getEnderecoAutarquia() {
        return enderecoAutarquia;
    }

    public void setEnderecoAutarquia(String enderecoAutarquia) {
        this.enderecoAutarquia = enderecoAutarquia;
    }

    public String getCidadeAutarquia() {
        return cidadeAutarquia;
    }

    public void setCidadeAutarquia(String cidadeAutarquia) {
        this.cidadeAutarquia = cidadeAutarquia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDautarquia != null ? iDautarquia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autarquia)) {
            return false;
        }
        Autarquia other = (Autarquia) object;
        if ((this.iDautarquia == null && other.iDautarquia != null) || (this.iDautarquia != null && !this.iDautarquia.equals(other.iDautarquia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Autarquia[ iDautarquia=" + iDautarquia + " ]";
    }
    
}
