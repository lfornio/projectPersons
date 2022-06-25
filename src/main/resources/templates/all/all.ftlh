<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Все пользователи</title>
</head>
<body>
<#if persons??>
<h2>Список всех пользователей</h2>
<table>
    <tr>
        <th>Id</th>
        <th>Фамилия И.</th>
    </tr>
</table>

<#list persons as person>
    <tr>
        <td>${person.id}</td>
        <td>${person.surname} ${person.name?substring(0, 1)}.</td>
        <br>
    </tr>
</#list>
<#else>
    <h2>Список пользователей пока пуст.</h2>
</#if>
</body>
</html>