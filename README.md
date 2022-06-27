## projectPersons

*Проект реализован в качестве тестового задания c использованием фреймворка Spring в соответствии с MVC. Необходимо было решить следующие задачи:*
<ol>
 <li>POST запрос для записи данных о пользователе (имя, фамилия). Результат возвращает уникальный идентификатор (далее - id) пользователя. </li>
 <li>GET запрос для получения информации обо всех пользователях в формате: id, фамилия, первая буква имени (н-р, 1 Андреева Е.).</li>
 <li>GET запрос с параметром id для получения полной информации о пользователе. </li>
</ol>

Данные о пользователях хранятся в легковесной базе данных H2.

<h3>Обработка запросов в формате JSON с помощью программы Postman</h3>

<h4>POST запрос</h4>
<i>lfornio.ru/api/persons/new</i>
<img src="/preview/post.png" width="500">
<h4>GET запрос всех пользователей</h4>
<i>lfornio.ru/api/persons</i>
<ul>
  <li>Cписок пользователей</li>
  <p><img src="/preview/get_all.png" width="500"></p>
  <li>Если список пользователей пуст</li>
  <img src="/preview/get_all_if_empty.png" width="500">
</ul>

<h4>GET запрос по id</h4>
<i>lfornio.ru/api/persons/{id}</i>
<ul>
  <li>Если id валидный</li>
  <img src="/preview/get_by_id.png" width="500">
  <li>Если id не валидный</li>
  <img src="/preview/get_by_id_not_valid.png" width="500">
</ul>

Реализован графический интерфейс по адресу: <a href="http://lfornio.ru/"> http://lfornio.ru/</a>

