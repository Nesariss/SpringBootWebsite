package com.example.demo;

import javax.persistence.*;

@Entity
@Table
public class Diseases {
    @Id
    //identify
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private boolean nadcisnienie;
    private boolean dyslipidemia;
    private boolean osteoporoza;
    private boolean inneChorobyKrazenia;
    private boolean inneChorobyCukrowe;
    private boolean inne;
    private String ilnes1;
    private String ilnes2;
    private String ilnes3;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public boolean isNadcisnienie() {
        return nadcisnienie;
    }

    public void setNadcisnienie(boolean nadcisnienie) {
        this.nadcisnienie = nadcisnienie;
    }

    public boolean isDyslipidemia() {
        return dyslipidemia;
    }

    public void setDyslipidemia(boolean dyslipidemia) {
        this.dyslipidemia = dyslipidemia;
    }

    public boolean isOsteoporoza() {
        return osteoporoza;
    }

    public void setOsteoporoza(boolean osteoporoza) {
        this.osteoporoza = osteoporoza;
    }

    public boolean isInneChorobyKrazenia() {
        return inneChorobyKrazenia;
    }

    public void setInneChorobyKrazenia(boolean inneChorobyKrazenia) {
        this.inneChorobyKrazenia = inneChorobyKrazenia;
    }

    public boolean isInneChorobyCukrowe() {
        return inneChorobyCukrowe;
    }

    public void setInneChorobyCukrowe(boolean inneChorobyCukrowe) {
        this.inneChorobyCukrowe = inneChorobyCukrowe;
    }

    public boolean isInne() {
        return inne;
    }

    public void setInne(boolean inne) {
        this.inne = inne;
    }

    public String getIlnes1() {
        return ilnes1;
    }

    public void setIlnes1(String ilnes1) {
        this.ilnes1 = ilnes1;
    }

    public String getIlnes2() {
        return ilnes2;
    }

    public void setIlnes2(String ilnes2) {
        this.ilnes2 = ilnes2;
    }

    public String getIlnes3() {
        return ilnes3;
    }

    public void setIlnes3(String ilnes3) {
        this.ilnes3 = ilnes3;
    }

}
