package com.act1.backend.act1_backend.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="TFTMPPRO")
public class producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pro_idpro;

    private String pro_nompro;
    private String pro_despro;
    private Integer pro_prepro;
    private Integer pro_cantpro;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "pro_idcat")
    //private categoria pro_idcat;

    public producto() {

    }

    public Integer getPro_idpro() {
        return pro_idpro;
    }

    public void setPro_idpro(Integer pro_idpro) {
        this.pro_idpro = pro_idpro;
    }

    public String getPro_nompro() {
        return pro_nompro;
    }

    public void setPro_nompro(String pro_nompro) {
        this.pro_nompro = pro_nompro;
    }

    public String getPro_despro() {
        return pro_despro;
    }

    public void setPro_despro(String pro_despro) {
        this.pro_despro = pro_despro;
    }

    public Integer getPro_prepro() {
        return pro_prepro;
    }

    public void setPro_prepro(Integer pro_prepro) {
        this.pro_prepro = pro_prepro;
    }

    public Integer getPro_cantpro() {
        return pro_cantpro;
    }

    public void setPro_cantpro(Integer pro_cantpro) {
        this.pro_cantpro = pro_cantpro;
    }


    private static final long serialVersionUID = 1;

}
