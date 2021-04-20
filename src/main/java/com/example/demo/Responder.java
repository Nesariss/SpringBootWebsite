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
    enum Time {zero_cztery,cztery_osiem,osiem_dwanascie,ponad_dwanascie}




    @Id

    //identify
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int age;
    private boolean sex;
    private boolean student;
    private String collage;
    private String name;
    //question information
    //before pandemic
    private Time sittingTimeBef;
    private Time activityTimeBef;
    private Comfort well_beingBef;
    private PhyHealth physicalHealthyBef;
    private MentHealth mentalHealthyBef;
    //after pandemic
    private Time sittingTimeAft;
    private Time activityTimeAft;
    private Comfort well_beingAft;
    private PhyHealth physicalHealthyAft;
    private MentHealth mentalHealthyAft;
    private Time BMI;
    private Comfort spendtime;


    private Dieta dieta;
    private boolean haveIlness;
    private boolean takeMedicament;
    private String comment;
    @OneToOne(targetEntity = Diseases.class, cascade = CascadeType.ALL)
    private Diseases diseases;




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

    public Time getSittingTimeBef() {
        return sittingTimeBef;
    }

    public void setSittingTimeBef(Time sittingTimeBef) {
        this.sittingTimeBef = sittingTimeBef;
    }

    public Time getActivityTimeBef() {
        return activityTimeBef;
    }

    public void setActivityTimeBef(Time activityTimeBef) {
        this.activityTimeBef = activityTimeBef;
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

    public Time getSittingTimeAft() {
        return sittingTimeAft;
    }

    public void setSittingTimeAft(Time sittingTimeAft) {
        this.sittingTimeAft = sittingTimeAft;
    }

    public Time getActivityTimeAft() {
        return activityTimeAft;
    }

    public void setActivityTimeAft(Time activityTimeAft) {
        this.activityTimeAft = activityTimeAft;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isHaveIlness() {
        return haveIlness;
    }

    public void setHaveIlness(boolean haveIllness) {
        this.haveIlness = haveIllness;
    }
    public Diseases getDiseases(Diseases diseases) {
        return this.diseases;
    }

    public void setDiseases(Diseases diseases) {
        this.diseases = diseases;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSex() {
        return sex;
    }

    public Time getBMI() {
        return BMI;
    }

    public void setBMI(Time BMI) {
        this.BMI = BMI;
    }

    public Comfort getSpendtime() {
        return spendtime;
    }

    public void setSpendtime(Comfort spendtime) {
        this.spendtime = spendtime;
    }
}

