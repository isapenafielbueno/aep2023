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
@Table(name = "cestagio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cestagio.findAll", query = "SELECT c FROM Cestagio c")
    , @NamedQuery(name = "Cestagio.findByIDcampoestagio", query = "SELECT c FROM Cestagio c WHERE c.iDcampoestagio = :iDcampoestagio")
    , @NamedQuery(name = "Cestagio.findByNomeCampoestagio", query = "SELECT c FROM Cestagio c WHERE c.nomeCampoestagio = :nomeCampoestagio")
    , @NamedQuery(name = "Cestagio.findByCurso", query = "SELECT c FROM Cestagio c WHERE c.curso = :curso")
    , @NamedQuery(name = "Cestagio.findByCnpjCampoestagio", query = "SELECT c FROM Cestagio c WHERE c.cnpjCampoestagio = :cnpjCampoestagio")
    , @NamedQuery(name = "Cestagio.findByEnderecoCampoestagio", query = "SELECT c FROM Cestagio c WHERE c.enderecoCampoestagio = :enderecoCampoestagio")
    , @NamedQuery(name = "Cestagio.findByCidadeCampoestagio", query = "SELECT c FROM Cestagio c WHERE c.cidadeCampoestagio = :cidadeCampoestagio")
    , @NamedQuery(name = "Cestagio.findByVagasSolicitadas", query = "SELECT c FROM Cestagio c WHERE c.vagasSolicitadas = :vagasSolicitadas")
    , @NamedQuery(name = "Cestagio.findByVagasdisponiveis", query = "SELECT c FROM Cestagio c WHERE c.vagasdisponiveis = :vagasdisponiveis")
    , @NamedQuery(name = "Cestagio.findByPeriodoinicial", query = "SELECT c FROM Cestagio c WHERE c.periodoinicial = :periodoinicial")
    , @NamedQuery(name = "Cestagio.findByPeriodofinal", query = "SELECT c FROM Cestagio c WHERE c.periodofinal = :periodofinal")
    , @NamedQuery(name = "Cestagio.findByResponsavelCampoestagio", query = "SELECT c FROM Cestagio c WHERE c.responsavelCampoestagio = :responsavelCampoestagio")})
public class Cestagio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_campoestagio")
    private Short iDcampoestagio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "nome_campoestagio")
    private String nomeCampoestagio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "curso")
    private String curso;
    @Size(max = 14)
    @Column(name = "cnpj_campoestagio")
    private String cnpjCampoestagio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "endereco_campoestagio")
    private String enderecoCampoestagio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "cidade_campoestagio")
    private String cidadeCampoestagio;
    @Size(max = 3)
    @Column(name = "vagas_solicitadas")
    private String vagasSolicitadas;
    @Size(max = 3)
    @Column(name = "vagasdisponiveis")
    private String vagasdisponiveis;
    @Size(max = 10)
    @Column(name = "periodoinicial")
    private String periodoinicial;
    @Size(max = 10)
    @Column(name = "periodofinal")
    private String periodofinal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "responsavel_campoestagio")
    private String responsavelCampoestagio;

    public Cestagio() {
    }

    public Cestagio(Short iDcampoestagio) {
        this.iDcampoestagio = iDcampoestagio;
    }

    public Cestagio(Short iDcampoestagio, String nomeCampoestagio, String curso, String enderecoCampoestagio, String cidadeCampoestagio, String responsavelCampoestagio) {
        this.iDcampoestagio = iDcampoestagio;
        this.nomeCampoestagio = nomeCampoestagio;
        this.curso = curso;
        this.enderecoCampoestagio = enderecoCampoestagio;
        this.cidadeCampoestagio = cidadeCampoestagio;
        this.responsavelCampoestagio = responsavelCampoestagio;
    }

    public Short getIDcampoestagio() {
        return iDcampoestagio;
    }

    public void setIDcampoestagio(Short iDcampoestagio) {
        this.iDcampoestagio = iDcampoestagio;
    }

    public String getNomeCampoestagio() {
        return nomeCampoestagio;
    }

    public void setNomeCampoestagio(String nomeCampoestagio) {
        this.nomeCampoestagio = nomeCampoestagio;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCnpjCampoestagio() {
        return cnpjCampoestagio;
    }

    public void setCnpjCampoestagio(String cnpjCampoestagio) {
        this.cnpjCampoestagio = cnpjCampoestagio;
    }

    public String getEnderecoCampoestagio() {
        return enderecoCampoestagio;
    }

    public void setEnderecoCampoestagio(String enderecoCampoestagio) {
        this.enderecoCampoestagio = enderecoCampoestagio;
    }

    public String getCidadeCampoestagio() {
        return cidadeCampoestagio;
    }

    public void setCidadeCampoestagio(String cidadeCampoestagio) {
        this.cidadeCampoestagio = cidadeCampoestagio;
    }

    public String getVagasSolicitadas() {
        return vagasSolicitadas;
    }

    public void setVagasSolicitadas(String vagasSolicitadas) {
        this.vagasSolicitadas = vagasSolicitadas;
    }

    public String getVagasdisponiveis() {
        return vagasdisponiveis;
    }

    public void setVagasdisponiveis(String vagasdisponiveis) {
        this.vagasdisponiveis = vagasdisponiveis;
    }

    public String getPeriodoinicial() {
        return periodoinicial;
    }

    public void setPeriodoinicial(String periodoinicial) {
        this.periodoinicial = periodoinicial;
    }

    public String getPeriodofinal() {
        return periodofinal;
    }

    public void setPeriodofinal(String periodofinal) {
        this.periodofinal = periodofinal;
    }

    public String getResponsavelCampoestagio() {
        return responsavelCampoestagio;
    }

    public void setResponsavelCampoestagio(String responsavelCampoestagio) {
        this.responsavelCampoestagio = responsavelCampoestagio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDcampoestagio != null ? iDcampoestagio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cestagio)) {
            return false;
        }
        Cestagio other = (Cestagio) object;
        if ((this.iDcampoestagio == null && other.iDcampoestagio != null) || (this.iDcampoestagio != null && !this.iDcampoestagio.equals(other.iDcampoestagio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cestagio[ iDcampoestagio=" + iDcampoestagio + " ]";
    }
    
}
