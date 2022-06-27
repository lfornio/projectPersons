<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Поиск пользователя</title>
</head>
<body>
<h1>Поиск пользователя:</h1>
<form method="get" action="/persons/search/id">
    <label>Введи id пользователя
    <input name="id" placeholder="id" type="number" min="1">
        <input type="submit" value="Поиск" required>
    </label>
</form>
<a href="/">На главную</a>
</body>
</html>