<%--
  Created by IntelliJ IDEA.
  User: Дмитрий
  Date: 25.11.2018
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="ru">
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

  <style type="text/css">
    .section-1{
      background: url(../image/background.jpg) center center;
      background-size: cover;
      height: 100vh;
    }
    .block3{
      background-color: #FAE3C4;
    }
    .block4{
      background-color: #c8b496;
    }
    section h2{
      color: #fff;
      font-size: 40px;
      padding: 20px;
      background-color: rgba(0,0,0,.5);
      box-shadow: 0 0 10px rgba(255,255,255,.3)
    }
  </style>

  <title>Hello, world!</title>
</head>
<body>
<section class="section-1">
  <div class="container">
    <div class="row align-items-center justify-content-center">
      <div class="col-12 text-center">
        <h2>Допро пожаловать на портал</h2>
      </div>
      <div class="col-12 block4">
        <h5>Форма входа</h5>
      </div>
      <div class="col-12 block3">
        <h5>Форма для поиска пациентов</h5>
        <div id="form">
          <form action="/getroute" onsubmit="return validRoute()" method="get">
            <table align="center">
              <tr>
                <td><label for="lastName"><span class="bold">Фамилия:</span> </label></td><td><input type="text" id="lastName" name="lastName"></td>
                <td><label for="firstName"><span class="bold">Имя:</span> </label></td><td><input type="text" id="firstName" name="firstName"></td>
                <td><label for="middleName"><span class="bold">Отчество:</span> </label></td><td><input type="text" id="middleName" name="middleName"></td>
              </tr>
              <tr>
                <td><label for="snils"><span class="bold">СНИЛС:</span> </label></td><td><input type="text" id="snils" name="snils"></td>
                <td><label for="oms"><span class="bold">ОМС:</span> </label></td><td><input type="text" id="oms" name="oms"></td>
                <td><label for="numberPassport"><span class="bold">Номер пасспорта:</span> </label></td><td><input type="text" id="numberPassport" name="numberPassport"></td>
              </tr>
              <tr align="center">
                <td colspan="6" align="right"><input type="submit" value="Найти"></td>
              </tr>
            </table>
          </form>
          <br>
      </div>
    </div>
  </div>
</section>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>
