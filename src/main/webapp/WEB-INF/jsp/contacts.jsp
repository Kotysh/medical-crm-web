<%@ page import="ru.dmitriikotiashov.entities.Doctor" %>
<%@ page import="ru.dmitriikotiashov.entities.Person" %>
<%
    AuthorizationView authorizationView = new AuthorizationView();
%>
<%
	Person person = (Person) request.getSession().getAttribute("person");
	boolean isLog = request.getSession().getAttribute("isLog");
	String authorization = authorizationView.getAuthorization(isLog, person);
	String headerAuthForm = authorizationView.getHeader(isLog);
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="ru">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="../../css/basicStyle.css"/>

    <title>MedicalCRM</title>
</head>
<body class="basic">

<div class="container">
    <div class="row">
        <div class="col-md-12 block1">
            <h1>MedicalCRM</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12 block2">
            <div class="row justify-content-end">
                <div class="col-lg-3 block5">
                    <%=headerAuthForm%>
                    <div class="row justify-content-center">
                        <div class="col-10 input">
                            <%=authorization%>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-2 block6">
                    <a href="/">Главная</a>
                </div>
                <div class="col-md-2 block6">
                    <a href="/doctors">Врачи</a>
                </div>
                <div class="col-md-2 block6">
                    <a href="/clinics">Клиники</a>
                </div>
                <div class="col-md-2 block6">
                    <a href="/contacts">Контакты</a>
                </div>
                <div class="col-md-2 block6">
                    <a href="/about">О проекте</a>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12 block3">
            <h3>Возникли вопросы по работе сервиса? Свяжитесь с нами:</h3>
            <hr>
            <h6>e-mail: medicalcrm2018@mail.ru</h6>
            <h6>telephone: +799999999999</h6>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12 block4">
            MedicalCRM<br>2018г.
        </div>
    </div>
</div>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>