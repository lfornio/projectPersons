<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Пользователь</title>
</head>
<body>
<#if person??>
<h1>Данные пользователя c id ${person.id}:</h1>
<div>
<h3>Фамилия: ${person.surname}</h3>
<h3>Имя: ${person.name}</h3>
</div>
    <a href="/">На главную</a>
<#else>
    <h2>Пользователь не найден</h2>
    <a href="/">На главную</a>
</#if>
</body>
</html>