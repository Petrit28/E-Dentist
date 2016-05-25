/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author KP Team
 */
@Entity
@Table(name = "Pacienti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pacienti.findAll", query = "SELECT p FROM Pacienti p"),
    @NamedQuery(name = "Pacienti.findByNrpersonal", query = "SELECT p FROM Pacienti p WHERE p.nrpersonal = :nrpersonal"),
    @NamedQuery(name = "Pacienti.findByEmri", query = "SELECT p FROM Pacienti p WHERE p.emri = :emri"),
    @NamedQuery(name = "Pacienti.findByEmriprindit", query = "SELECT p FROM Pacienti p WHERE p.emriprindit = :emriprindit"),
    @NamedQuery(name = "Pacienti.findByMbiemri", query = "SELECT p FROM Pacienti p WHERE p.mbiemri = :mbiemri"),
    @NamedQuery(name = "Pacienti.findByGjinia", query = "SELECT p FROM Pacienti p WHERE p.gjinia = :gjinia"),
    @NamedQuery(name = "Pacienti.findByDatalindjes", query = "SELECT p FROM Pacienti p WHERE p.datalindjes = :datalindjes"),
    @NamedQuery(name = "Pacienti.findByVendlindja", query = "SELECT p FROM Pacienti p WHERE p.vendlindja = :vendlindja"),
    @NamedQuery(name = "Pacienti.findByVendbanimi", query = "SELECT p FROM Pacienti p WHERE p.vendbanimi = :vendbanimi"),
    @NamedQuery(name = "Pacienti.findByKomuna", query = "SELECT p FROM Pacienti p WHERE p.komuna = :komuna"),
    @NamedQuery(name = "Pacienti.findByAdresa", query = "SELECT p FROM Pacienti p WHERE p.adresa = :adresa")})
public class Pacienti implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Nr_personal")
    private Integer nrpersonal;
    @Basic(optional = false)
    @Column(name = "Emri")
    private String emri;
    @Basic(optional = false)
    @Column(name = "Emri_prindit")
    private String emriprindit;
    @Basic(optional = false)
    @Column(name = "Mbiemri")
    private String mbiemri;
    @Basic(optional = false)
    @Column(name = "Gjinia")
    private Character gjinia;
    @Basic(optional = false)
    @Column(name = "Data_lindjes")
    @Temporal(TemporalType.DATE)
    private Date datalindjes;
    @Basic(optional = false)
    @Column(name = "Vendlindja")
    private String vendlindja;
    @Basic(optional = false)
    @Column(name = "Vendbanimi")
    private String vendbanimi;
    @Basic(optional = false)
    @Column(name = "Komuna")
    private String komuna;
    @Basic(optional = false)
    @Column(name = "Adresa")
    private String adresa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientiid")
    private Collection<Kontrolla> kontrollaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacienti")
    private Collection<Termini> terminiCollection;
    @OneToOne(mappedBy = "pacientiID")
    private Kontakti kontakti;

    public Pacienti() {
    }

    public Pacienti(Integer nrpersonal) {
        this.nrpersonal = nrpersonal;
    }

    public Pacienti(Integer nrpersonal, String emri, String emriprindit, String mbiemri, Character gjinia, Date datalindjes, String vendlindja, String vendbanimi, String komuna, String adresa) {
        this.nrpersonal = nrpersonal;
        this.emri = emri;
        this.emriprindit = emriprindit;
        this.mbiemri = mbiemri;
        this.gjinia = gjinia;
        this.datalindjes = datalindjes;
        this.vendlindja = vendlindja;
        this.vendbanimi = vendbanimi;
        this.komuna = komuna;
        this.adresa = adresa;
    }

    public Integer getNrpersonal() {
        return nrpersonal;
    }

    public void setNrpersonal(Integer nrpersonal) {
        this.nrpersonal = nrpersonal;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getEmriprindit() {
        return emriprindit;
    }

    public void setEmriprindit(String emriprindit) {
        this.emriprindit = emriprindit;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public Character getGjinia() {
        return gjinia;
    }

    public void setGjinia(Character gjinia) {
        this.gjinia = gjinia;
    }

    public Date getDatalindjes() {
        return datalindjes;
    }

    public void setDatalindjes(Date datalindjes) {
        this.datalindjes = datalindjes;
    }

    public String getVendlindja() {
        return vendlindja;
    }

    public void setVendlindja(String vendlindja) {
        this.vendlindja = vendlindja;
    }

    public String getVendbanimi() {
        return vendbanimi;
    }

    public void setVendbanimi(String vendbanimi) {
        this.vendbanimi = vendbanimi;
    }

    public String getKomuna() {
        return komuna;
    }

    public void setKomuna(String komuna) {
        this.komuna = komuna;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @XmlTransient
    public Collection<Kontrolla> getKontrollaCollection() {
        return kontrollaCollection;
    }

    public void setKontrollaCollection(Collection<Kontrolla> kontrollaCollection) {
        this.kontrollaCollection = kontrollaCollection;
    }

    @XmlTransient
    public Collection<Termini> getTerminiCollection() {
        return terminiCollection;
    }

    public void setTerminiCollection(Collection<Termini> terminiCollection) {
        this.terminiCollection = terminiCollection;
    }

    public Kontakti getKontakti() {
        return kontakti;
    }

    public void setKontakti(Kontakti kontakti) {
        this.kontakti = kontakti;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrpersonal != null ? nrpersonal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pacienti)) {
            return false;
        }
        Pacienti other = (Pacienti) object;
        if ((this.nrpersonal == null && other.nrpersonal != null) || (this.nrpersonal != null && !this.nrpersonal.equals(other.nrpersonal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Pacienti[ nrpersonal=" + nrpersonal + " ]";
    }
    
}
