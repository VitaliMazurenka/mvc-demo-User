# mvc-demo-User
создаем 1-й web-проект на Spring + Spring Boot mvc-demo: - новый проект с помощью Spring Initializr - Lombook - Spring Web - Apache Freemarker - создаем страницу home.html

Задача: получить данные пользователя из формы регистрации, записать пользователя в репозиторий, отобразить список зарегистрированных пользователей на отдельной странице.

План реализации:

создаем на странице регистрации форму для регистрации пользователей на 3 поля (делаем пока без ID, за это будет отвечать БД) - имя (ник) - email - пароль
model.User - обновить
repository
CrudRepository - 5 типовых методов (CRUD):
save (create)
update
delete
findById
findAll
UserRepository - наследуется от CrudRepo, добавляем метод findByEmail (Email - это Set уникальных ид) impl:
UserRepositoryFileImpl - делаем имплементацию главных (самых нужных на 1-м этапе) методов:
save
findAll
service
UserService - подключаем к нему UserRepository, реализуем методы:
addUser
findAll делаем impl
UserServiceImpl - реализуем 2 метода
controller
UserController - подключаем к нему UserService
@PostMapping
@GetMapping
создаем необходимые html-страницы
указываем файл для хранения пользователей в application.properties
проверяем решение
