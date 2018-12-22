package ru.dmitriikotiashov.view;

/**
 * Created by Дмитрий on 22.12.2018.
 */
public class ClinicView {

    public String getFormSearchClinic(){
        return  "\n" +
                "      <form action=\"/clinics\" method=\"get\">\n" +
                "        <table align=\"center\">\n" +
                "          <tr>\n" +
                "            <td><label for=\"nameClinic\"><span class=\"bold\">название:</span> </label></td><td><input type=\"text\" id=\"nameClinic\" name=\"nameClinic\"></td>\n" +
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
