package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AppointmentNurse implements ISchedulable{
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    private int id;
    private Nurse nurse;
    private Patient patient;
    private Date date;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getDate(String DATE) {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDate() {
        return format.format(date);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void schedule(Date date, String time) {

    }
}
