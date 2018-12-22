package ru.dmitriikotiashov.view;

import ru.dmitriikotiashov.entities.Doctor;

import java.util.List;

public class DoctorView {

    public String getDoctors(List<Doctor> doctors){
        StringBuilder doctorsString = new StringBuilder("<div class=\"row justify-content-center\">\n");
        for(Doctor d : doctors){
            doctorsString.append("<div class=\"col-2 blockDoctor\"></div>");
            doctorsString.append("<div class=\"col-8 blockDoctor\">\n" +
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
        doctorString.append("<div class=\"col-2 blockDoctor\"></div>");
        doctorString.append("<div class=\"col-8 blockDoctor\">\n" +
                "ФИО: "+doctor.getPerson().getFirstName()+" "+doctor.getPerson().getMiddleName()+" "+doctor.getPerson().getLastName()+"<br>\n" +
                "должность: "+doctor.getProfession().getName()+"<br>\n" +
                "образование: " +doctor.getHigherEducation().getName()+" "+doctor.getBeginYear()+"-"+doctor.getEndYear()+"<br>\n" +
                "ученая степень: " +doctor.getScientificDegree().getName()+"<br>\n" +
                "о себе: "+doctor.getAboutMe()+"<br>\n" +
                "</div></div>");
        return doctorString.toString();
    }

    public String getFormSearchDoctor(){
        return  "\n" +
                "      <form action=\"/doctors\" method=\"get\">\n" +
                "        <table align=\"center\">\n" +
                "          <tr>\n" +
                "            <td><label for=\"lastName\"><span class=\"bold\">фамилия:</span> </label></td><td><input type=\"text\" id=\"lastName\" name=\"lastName\"></td>\n" +
                "            <td><label for=\"firstName\"><span class=\"bold\">имя:</span> </label></td><td><input type=\"text\" id=\"firstName\" name=\"firstName\"></td>\n" +
                "            <td><label for=\"middleName\"><span class=\"bold\">отчество:</span> </label></td><td><input type=\"text\" id=\"middleName\" name=\"middleName\"></td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "            <td><label for=\"profession\"><span class=\"bold\">специализация:</span> </label></td><td><input type=\"text\" id=\"profession\" name=\"profession\"></td>\n" +
                "            <td><label for=\"region\"><span class=\"bold\">регион:</span> </label></td><td><input type=\"text\" id=\"region\" name=\"region\"></td>\n" +
                "            <td><label for=\"city\"><span class=\"bold\">город:</span> </label></td><td><input type=\"text\" id=\"city\" name=\"city\"></td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "            <td colspan=\"6\" align=\"right\"><input type=\"submit\" value=\"Найти\"></td>\n" +
                "          </tr>\n" +
                "        </table>\n" +
                "      </form>";
    }
}
