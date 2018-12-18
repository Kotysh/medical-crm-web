package ru.dmitriikotiashov.view;

import ru.dmitriikotiashov.entities.Doctor;

import java.util.List;

public class DoctorView {

    public String getDoctors(List<Doctor> doctors){
        StringBuilder doctorsString = new StringBuilder("<div class=\"row justify-content-center\">\n");
        for(Doctor d : doctors){
            doctorsString.append("<div class=\"col-10 blockDoctor\">\n" +
                    "ФИО: "+d.getPerson().getFirstName()+" "+d.getPerson().getMiddleName()+" "+d.getPerson().getLastName()+"<br>\n" +
                    "должность: "+d.getProfession().getName()+"<br>\n" +
                    "<a class=\"doctorHref\" href=\"doctor\\"+d.getDoctorId()+"\">подробнее...</a>\n" +
                    "</div");
        }
        doctorsString.append("</div>");
        return doctorsString.toString();
    }

    public String getDoctor(Doctor doctor){
        StringBuilder doctorString = new StringBuilder("<div class=\"row justify-content-center\">\n");
        doctorString.append("<div class=\"col-10 blockDoctor\">\n" +
                "ФИО: "+doctor.getPerson().getFirstName()+" "+doctor.getPerson().getMiddleName()+" "+doctor.getPerson().getLastName()+"<br>\n" +
                "должность: "+doctor.getProfession().getName()+"<br>\n" +
                "образование: " +doctor.getHigherEducation().getName()+" "+doctor.getBeginYear()+"-"+doctor.getEndYear()+"<br>\n" +
                "ученая степень: " +doctor.getScientificDegree().getName()+"<br>\n" +
                "о себе: "+doctor.getAboutMe()+"<br>\n" +
                "</div></div>");
        return doctorString.toString();
    }
}
