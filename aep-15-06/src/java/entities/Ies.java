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
@Table(name = "ies")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ies.findAll", query = "SELECT i FROM Ies i")
    , @NamedQuery(name = "Ies.findByIDies", query = "SELECT i FROM Ies i WHERE i.iDies = :iDies")
    , @NamedQuery(name = "Ies.findByNomeIes", query = "SELECT i FROM Ies i WHERE i.nomeIes = :nomeIes")
    , @NamedQuery(name = "Ies.findByCnpjIes", query = "SELECT i FROM Ies i WHERE i.cnpjIes = :cnpjIes")
    , @NamedQuery(name = "Ies.findByDiretorIes", query = "SELECT i FROM Ies i WHERE i.diretorIes = :diretorIes")
    , @NamedQuery(name = "Ies.findByEnderecoIes", query = "SELECT i FROM Ies i WHERE i.enderecoIes = :enderecoIes")
    , @NamedQuery(name = "Ies.findByCidadeIes", query = "SELECT i FROM Ies i WHERE i.cidadeIes = :cidadeIes")})
public class Ies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ies")
    private Short iDies;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "nome_ies")
    private String nomeIes;
    @Size(max = 14)
    @Column(name = "cnpj_ies")
    private String cnpjIes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "diretor_ies")
    private String diretorIes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "endereco_ies")
    private String enderecoIes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "cidade_ies")
    private String cidadeIes;

    public Ies() {
    }

    public Ies(Short iDies) {
        this.iDies = iDies;
    }

    public Ies(Short iDies, String nomeIes, String diretorIes, String enderecoIes, String cidadeIes) {
        this.iDies = iDies;
        this.nomeIes = nomeIes;
        this.diretorIes = diretorIes;
        this.enderecoIes = enderecoIes;
        this.cidadeIes = cidadeIes;
    }

    public Short getIDies() {
        return iDies;
    }

    public void setIDies(Short iDies) {
        this.iDies = iDies;
    }

    public String getNomeIes() {
        return nomeIes;
    }

    public void setNomeIes(String nomeIes) {
        this.nomeIes = nomeIes;
    }

    public String getCnpjIes() {
        return cnpjIes;
    }

    public void setCnpjIes(String cnpjIes) {
        this.cnpjIes = cnpjIes;
    }

    public String getDiretorIes() {
        return diretorIes;
    }

    public void setDiretorIes(String diretorIes) {
        this.diretorIes = diretorIes;
    }

    public String getEnderecoIes() {
        return enderecoIes;
    }

    public void setEnderecoIes(String enderecoIes) {
        this.enderecoIes = enderecoIes;
    }

    public String getCidadeIes() {
        return cidadeIes;
    }

    public void setCidadeIes(String cidadeIes) {
        this.cidadeIes = cidadeIes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDies != null ? iDies.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ies)) {
            return false;
        }
        Ies other = (Ies) object;
        if ((this.iDies == null && other.iDies != null) || (this.iDies != null && !this.iDies.equals(other.iDies))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Ies[ iDies=" + iDies + " ]";
    }
    
}
