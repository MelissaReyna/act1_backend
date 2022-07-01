package com.act1.backend.act1_backend.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TFTMPCAT")
public class categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cat_idcat;

    private String cat_nomcat;
    private String cat_descat;

    public categoria() {

    }

    public Integer getCat_idcat() {
        return cat_idcat;
    }

    public void setCat_idcat(Integer cat_idcat) {
        this.cat_idcat = cat_idcat;
    }

    public String getCat_nomcat() {
        return cat_nomcat;
    }

    public void setCat_nomcat(String cat_nomcat) {
        this.cat_nomcat = cat_nomcat;
    }

    public String getCat_descat() {
        return cat_descat;
    }

    public void setCat_descat(String cat_descat) {
        this.cat_descat = cat_descat;
    }
}
