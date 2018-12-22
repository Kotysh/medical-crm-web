package ru.dmitriikotiashov.view;

import ru.dmitriikotiashov.entities.Person;

public class AuthorizationView {

    public String getAuthorization(Boolean isLog, Person person){
        if(isLog != null && isLog) {
            return String.format("Добро пожаловать, %s %s", person.getFirstName(), person.getMiddleName());
        }else {
            return "\n" +
            "\t\t\t\t\t\t\t\t<form action=\"/auth\" method=\"post\">\n" +
            "\t\t\t\t\t\t\t\t\t<label for=\"login\">Логин</label><br>\n" +
            "\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"login\" name=\"login\"><br>\n" +
            "\t\t\t\t\t\t\t\t\t<label for=\"password\">Пароль</label><br>\n" +
            "\t\t\t\t\t\t\t\t\t<input type=\"password\" id=\"password\" name=\"password\"><br>\n" +
            "\t\t\t\t\t\t\t\t\t<input class=\"enter\" type=\"submit\" value=\"Войти\">\n" +
            "\t\t\t\t\t\t\t\t</form>";
        }
    }

    public String getHeader(Boolean isLog){
        if(isLog != null && isLog) {
            return  "<h6 class=\"head6\"><a href=\"/exit\" class=\"regHref\">Выйти</a></h6>";
        }else {
            return  "<h6 class=\"head6\">Вход/<a href=\"/\" class=\"regHref\">Регистрация</a></h6>";
        }
    }
}
