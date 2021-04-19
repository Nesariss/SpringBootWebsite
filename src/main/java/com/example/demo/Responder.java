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
    //question information
    //before pandemic
    private int sittingTimeBef;
    private int activityTimeBef;
    private Comfort well_beingBef;
    private PhyHealth physicalHealthyBef;
    private MentHealth mentalHealthyBef;
    //after pandemic
    private int sittingTimeAft;
    private int activityTimeAft;
    private Comfort well_beingAft;
    private PhyHealth physicalHealthyAft;
    private MentHealth mentalHealthyAft;


    private Dieta dieta;
    private boolean takeMedicament;
    private ArrayList<String> medicament;
    private boolean haveIlness;
    private ArrayList<String> ilness;





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

    public int getSittingTimeBef() {
        return sittingTimeBef;
    }

    public void setSittingTimeBef(int sittingTimeBef) {
        this.sittingTimeBef = sittingTimeBef;
    }

    public int getActivityTimeBef() {
        return activityTimeBef;
    }

    public void setActivityTimeBef(int activityTimeBef) {
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

    public int getSittingTimeAft() {
        return sittingTimeAft;
    }

    public void setSittingTimeAft(int sittingTimeAft) {
        this.sittingTimeAft = sittingTimeAft;
    }

    public int getActivityTimeAft() {
        return activityTimeAft;
    }

    public void setActivityTimeAft(int activityTimeAft) {
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

    public ArrayList<String> getMedicament() {
        return medicament;
    }

    public void setMedicament(ArrayList<String> medicament) {
        this.medicament = medicament;
    }

    public boolean isHaveIlness() {
        return haveIlness;
    }

    public void setHaveIlness(boolean haveIllness) {
        this.haveIlness = haveIllness;
    }

    public ArrayList<String> getIlness() {
        return ilness;
    }

    public void setIlness(ArrayList<String> ilness) {
        this.ilness = ilness;
    }
}
