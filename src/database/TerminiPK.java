/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author KP Team
 */
@Embeddable
public class TerminiPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Termini_id")
    private int terminiid;
    @Basic(optional = false)
    @Column(name = "PacientiID")
    private int pacientiID;

    public TerminiPK() {
    }

    public TerminiPK(int terminiid, int pacientiID) {
        this.terminiid = terminiid;
        this.pacientiID = pacientiID;
    }

    public int getTerminiid() {
        return terminiid;
    }

    public void setTerminiid(int terminiid) {
        this.terminiid = terminiid;
    }

    public int getPacientiID() {
        return pacientiID;
    }

    public void setPacientiID(int pacientiID) {
        this.pacientiID = pacientiID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) terminiid;
        hash += (int) pacientiID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TerminiPK)) {
            return false;
        }
        TerminiPK other = (TerminiPK) object;
        if (this.terminiid != other.terminiid) {
            return false;
        }
        if (this.pacientiID != other.pacientiID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.TerminiPK[ terminiid=" + terminiid + ", pacientiID=" + pacientiID + " ]";
    }
    
}
