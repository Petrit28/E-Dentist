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
public class TretmaniPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Tretmani_id")
    private int tretmaniid;
    @Basic(optional = false)
    @Column(name = "KontrollaID")
    private int kontrollaID;

    public TretmaniPK() {
    }

    public TretmaniPK(int tretmaniid, int kontrollaID) {
        this.tretmaniid = tretmaniid;
        this.kontrollaID = kontrollaID;
    }

    public int getTretmaniid() {
        return tretmaniid;
    }

    public void setTretmaniid(int tretmaniid) {
        this.tretmaniid = tretmaniid;
    }

    public int getKontrollaID() {
        return kontrollaID;
    }

    public void setKontrollaID(int kontrollaID) {
        this.kontrollaID = kontrollaID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) tretmaniid;
        hash += (int) kontrollaID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TretmaniPK)) {
            return false;
        }
        TretmaniPK other = (TretmaniPK) object;
        if (this.tretmaniid != other.tretmaniid) {
            return false;
        }
        if (this.kontrollaID != other.kontrollaID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.TretmaniPK[ tretmaniid=" + tretmaniid + ", kontrollaID=" + kontrollaID + " ]";
    }
    
}
