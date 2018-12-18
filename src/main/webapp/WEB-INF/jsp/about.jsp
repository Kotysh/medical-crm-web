<%@ page import="ru.dmitriikotiashov.entities.Person" %>
<%@ page import="ru.dmitriikotiashov.view.AuthorizationView" %>
<%
    AuthorizationView authorizationView = new AuthorizationView();
%>
<%
    Person person = (Person) request.getSession().getAttribute("person");
    Boolean isLog = (Boolean) request.getSession().getAttribute("isLog");
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
            <h1 align="center">Medical CRM</h1>
            <p>MedicalCRM - это портал для хранения, обработки данных пациентов, врачей, клиник, который создан для
            комфорта пациентов и упрощения работы сотрудников медицинских учреждений.</p>
            <p align="center"><img src="../../image/doctor_pacient.jpg" height="400px"></p>
            <h3>Актуальность проекта</h3>
            <p>Электронная медицинская карта создаётся для полной оптимизации деятельности лечебно-профилактических
                учреждений, преимущества от их введения уже успели ощутить и пациенты, и доктора с медицинскими
                сёстрами, и даже администрация Москвы. Существует и ещё одно перспективное направление, по которому
                будет развиваться электронная медицинская карта - всеобщее единое электронное пространство медицинских
                карт граждан России. То есть в перспективе будет создаваться единая база данных, которая объединит в
                сеть все медицинские учреждения страны. В результате информация о пациенте не потеряется, и доктор,
                впервые видя человека и находясь за тысячи километров от его лечащего врача, сможет узнать полноценные
                медицинские данные о нём в считанные минуты.
            </p>
            <h3>Преимущества в работе  от реализации проекта</h3>
            <h4>Для врачей:</h4>
            <ul>
                <li>Упрощенный просмотр карты больного в электронном виде с историей всех болезней, прививок, анализов,
                    ФЛГ, информация об аллергии, непереносимости препаратов и др.</li>
                <li>Предложены шаблоны заполнения карты больного (температура, давление, симптомы, диагноз,
                    предполагаемые медицинские препараты для лечения) с упрощенным интерфейсом. В результате сокращается
                    время оформления карты пациента.</li>
                <li>Предложены шаблоны на оформления типовых справок: в детские сады, школы, водителю, охотникам, военным,
                    преподавателям, в полицию, в ФСИН и т.д.</li>
                <li>Ведение статистики заболеваемости с учетом любых параметром и временных промежутков среди населения.
                    Возможность оповещения граждан о прохождении диспансеризации, возможности вакцинации или
                    предупреждении эпидемии заболеваний.</li>
                <li>Электронная карта пациента никогда не потеряется и будет хранится на серверах.</li>
            </ul>
            <h4>Для пациентов:</h4>
            <ul>
                <li>Онлайн запись на прием к любому врачу.</li>
                <li>Онлайн вызов врача на дом с возможностью указать первые симптомы и жалобы.</li>
                <li>Возможность просмотра анализов и истории болезни пациента только с подтверждением.</li>
                <li>Просмотр информации о клинике, отзывов о врачах (с системой контроля, если пациент был на приеме,
                    то он может комментировать, иначе нет).</li>
                <li>Онлайн техническая поддержка со стороны медицинского учреждения и пациента.</li>
            </ul>
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