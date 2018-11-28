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
    .basic{
      background-color: #c9e4a9;
    }
    .block1{
      background-color: #FAE3C4;
	  min-height: 50px;
    }
    .block4{
      background-color: #c8b496;
	  min-height: 50px;
	  text-align: center;
    }
    .block3{
      background-color: #aacab4;
	  min-height: 50px;
    }
    .block2{
      background-color: #e3c2a5;
	  min-height: 50px;
    }
    .block5{
      background-color: #e3ab25;
	  margin: 10px;
	  min-height: 120px;
	  border-radius: 10px;
    }
    .block6{
      background-color: #a3b4c5;
	  margin: 5px;
	  min-height: 50px;
	  border-radius: 5px;
	  text-align: center;
    }
	.head6{
	  text-align: center;
	  margin: 5px;
	}
	.input{
	  margin: 5px;
	  margin-bottom: 15px;
	  text-align: center;
	}
  </style>

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
						<h6 class="head6">Вход/Регистрация</h6>
						<div class="row justify-content-center">
							<div class="col-10 input">
								<form>
									<label for="login">Логин</label><br>
									<input type="text" id="login"><br>
									<label for="password">Пароль</label><br>
									<input type="password" id="password">
								</form>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-2 block6">
						Главная
					</div>
					<div class="col-md-2 block6">
						Врачи
					</div>
					<div class="col-md-2 block6">
						Клиники
					</div>
					<div class="col-md-2 block6">
						Контакты
					</div>
					<div class="col-md-2 block6">
						О проекте
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12 block3">

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
