<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Добавить пользователя</title>
</head>
<body>
<h1>Привет, давай знакомиться!</h1>
<h1>Введи свои данные</h1>

<form method="post">
    <label>Имя:
        <input name="name" placeholder="Имя" maxlength="20" pattern="[A-Za-zА-Яа-яЁё]*" required>
    </label>
    <label>Фамилия:
        <input name="surname" placeholder="Фамилия" maxlength="20" pattern="[A-Za-zА-Яа-яЁё]*" required>
    </label>
    <input type="submit" value="Отправить">
</form>
<a href="/">На главную</a>
</body>
</html>