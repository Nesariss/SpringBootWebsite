package com.example.demo;


import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table
public class Responder {
    enum Comfort {BardzoZle, Zle, Srednie, Dobre, BardzoDobre}
    enum PhyHealth {BardzoZle, Zle, Srednie, Dobre, BardzoDobre}
    enum MentHealth {BardzoZle, Zle, Srednie, Dobre, BardzoDobre}
    enum Dieta {NieZdrowa,Raczejniezdrowa,RaczejZdrowa,Zdrowa}
    enum czas {zero_cztery,cztery_osiem,osiem_dwanascie,ponad_dwanascie}




    @Id
    @SequenceGenerator(
            name = "responder_sequence",
            sequenceName = "responder_sequence",
            allocationSize = 1
    )
    //identify
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "responder_sequence")
    private int id;
    private int age;
    private boolean sex;
    private boolean student;
    private String collage;
    private String name;
    private Comfort spendtime;


    private czas BMI;


//question information
    //before pandemic

    private Comfort well_beingBef;
    private PhyHealth physicalHealthyBef;
    private MentHealth mentalHealthyBef;
    //after pandemic

    private Comfort well_beingAft;
    private PhyHealth physicalHealthyAft;
    private MentHealth mentalHealthyAft;

    private czas sittingTimeBef;
    private czas activityTimeBef;
    private czas sittingTimeAft;
    private czas activityTimeAft;

    private Dieta dieta;

    public Comfort getSpendtime() {
        return spendtime;
    }

    public void setSpendtime(Comfort spendtime) {
        this.spendtime = spendtime;
    }

    public String getMedicament() {
        return medicament;
    }

    public czas getSittingTimeBef() {
        return sittingTimeBef;
    }

    public void setSittingTimeBef(czas sittingTimeBef) {
        this.sittingTimeBef = sittingTimeBef;
    }

    public czas getActivityTimeBef() {
        return activityTimeBef;
    }

    public void setActivityTimeBef(czas activityTimeBef) {
        this.activityTimeBef = activityTimeBef;
    }

    public czas getSittingTimeAft() {
        return sittingTimeAft;
    }

    public void setSittingTimeAft(czas sittingTimeAft) {
        this.sittingTimeAft = sittingTimeAft;
    }

    public czas getActivityTimeAft() {
        return activityTimeAft;
    }

    public void setActivityTimeAft(czas activityTimeAft) {
        this.activityTimeAft = activityTimeAft;
    }

    public String getIlness() {
        return ilness;
    }
    public czas getBMI() {
        return BMI;
    }

    public void setBMI(czas BMI) {
        this.BMI = BMI;
    }


    private boolean takeMedicament;
    private String medicament;
    private boolean haveIlness;
    private String ilness;



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Comfort getWell_beingBef() {
        return well_beingBef;
    }

    public void setWell_beingBef(Comfort well_beingBef) {
        this.well_beingBef = well_beingBef;
    }

    public PhyHealth getPhysicalHealthyBef() {
        return physicalHealthyBef;
    }

    public void setPhysicalHealthyBef(PhyHealth physicalHealthyBef) {
        this.physicalHealthyBef = physicalHealthyBef;
    }

    public MentHealth getMentalHealthyBef() {
        return mentalHealthyBef;
    }

    public void setMentalHealthyBef(MentHealth mentalHealthyBef) {
        this.mentalHealthyBef = mentalHealthyBef;
    }



    public Comfort getWell_beingAft() {
        return well_beingAft;
    }

    public void setWell_beingAft(Comfort well_beingAft) {
        this.well_beingAft = well_beingAft;
    }

    public PhyHealth getPhysicalHealthyAft() {
        return physicalHealthyAft;
    }

    public void setPhysicalHealthyAft(PhyHealth physicalHealthyAft) {
        this.physicalHealthyAft = physicalHealthyAft;
    }

    public MentHealth getMentalHealthyAft() {
        return mentalHealthyAft;
    }

    public void setMentalHealthyAft(MentHealth mentalHealthyAft) {
        this.mentalHealthyAft = mentalHealthyAft;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public boolean isTakeMedicament() {
        return takeMedicament;
    }

    public void setTakeMedicament(boolean takeMedicament) {
        this.takeMedicament = takeMedicament;
    }
    public void setMedicament(String medicament) {
        this.medicament = medicament;
    }

    public void setIlness(String ilness) {
        this.ilness = ilness;
    }


    public boolean isHaveIlness() {
        return haveIlness;
    }

    public void setHaveIlness(boolean haveIllness) {
        this.haveIlness = haveIllness;
    }


}
