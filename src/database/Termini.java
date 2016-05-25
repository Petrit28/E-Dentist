/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author KP Team
 */
@Entity
@Table(name = "Termini")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Termini.findAll", query = "SELECT t FROM Termini t"),
    @NamedQuery(name = "Termini.findByTerminiid", query = "SELECT t FROM Termini t WHERE t.terminiPK.terminiid = :terminiid"),
    @NamedQuery(name = "Termini.findByPacientiID", query = "SELECT t FROM Termini t WHERE t.terminiPK.pacientiID = :pacientiID"),
    @NamedQuery(name = "Termini.findByDataterminit", query = "SELECT t FROM Termini t WHERE t.dataterminit = :dataterminit"),
    @NamedQuery(name = "Termini.findByOraterminit", query = "SELECT t FROM Termini t WHERE t.oraterminit = :oraterminit")})
public class Termini implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TerminiPK terminiPK;
    @Basic(optional = false)
    @Column(name = "Data_terminit")
    @Temporal(TemporalType.DATE)
    private Date dataterminit;
    @Basic(optional = false)
    @Column(name = "Ora_terminit")
    @Temporal(TemporalType.TIME)
    private Date oraterminit;
    @JoinColumn(name = "PacientiID", referencedColumnName = "Nr_personal", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pacienti pacienti;

    public Termini() {
    }

    public Termini(TerminiPK terminiPK) {
        this.terminiPK = terminiPK;
    }

    public Termini(TerminiPK terminiPK, Date dataterminit, Date oraterminit) {
        this.terminiPK = terminiPK;
        this.dataterminit = dataterminit;
        this.oraterminit = oraterminit;
    }

    public Termini(int terminiid, int pacientiID) {
        this.terminiPK = new TerminiPK(terminiid, pacientiID);
    }

    public TerminiPK getTerminiPK() {
        return terminiPK;
    }

    public void setTerminiPK(TerminiPK terminiPK) {
        this.terminiPK = terminiPK;
    }

    public Date getDataterminit() {
        return dataterminit;
    }

    public void setDataterminit(Date dataterminit) {
        this.dataterminit = dataterminit;
    }

    public Date getOraterminit() {
        return oraterminit;
    }

    public void setOraterminit(Date oraterminit) {
        this.oraterminit = oraterminit;
    }

    public Pacienti getPacienti() {
        return pacienti;
    }

    public void setPacienti(Pacienti pacienti) {
        this.pacienti = pacienti;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (terminiPK != null ? terminiPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Termini)) {
            return false;
        }
        Termini other = (Termini) object;
        if ((this.terminiPK == null && other.terminiPK != null) || (this.terminiPK != null && !this.terminiPK.equals(other.terminiPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Termini[ terminiPK=" + terminiPK + " ]";
    }
    
}
