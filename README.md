# Проект по автоматизации тестовых сценариев для сайта компании [Корсар](https://korsarcase.ru/)
<a href="https://korsarcase.ru/"><img src='media/icons/Корсар.png' width="35%"/></a>

> Корсар - крупнейший российский производитель и постащик профессиональных защитных кейсов и контейнеров
> для транспортировки, эксплуатации и хранения специального оборудования.

## Структура

* <a href="#tools">Стек</a>
* Реализованные проверки
* Запуск из терминала
* Сборка в Jenkins
* Allure отчет
*  Уведомление в Telegram при помощи бота
* Видео примера запуска тестов в Selenoid
---

<a id="tools"></a>
## Стек

<p align="center">  
<a href="https://www.java.com/"><img src='media/icons/java.svg' width="50"/></a> 
<a href="https://junit.org/junit5/"><img src='media/icons/junit.svg' width="50"/></a> 
<a href="https://selenide.org/"><img src='media/icons/Selenide.svg' width="50"/></a> 
<a href="https://aerokube.com/selenoid/"><img src='media/icons/Selenoid.svg' width="50"/></a> 
<a href="https://allurereport.org/"><img src='media/icons/Allure_Report.svg' width="50"/></a>
<a href="https://gradle.org/"><img src='media/icons/gradle.svg' width="50"/></a> 
<a href="https://www.jenkins.io/"><img src='media/icons/jenkins.svg' width="50"/></a> 
<a href="https://web.telegram.org/"><img src='media/icons/telegram.svg' width="50"/></a> 
<a href="https://github.com/"><img src='media/icons/github.svg' width="50"/></a> 
<a href="https://www.jetbrains.com/idea/"><img src='media/icons/intellij.svg' width="50"/></a> 
</p>

---

## Реализованные проверки
- Проверка работы кнопок и переходов:
  - "Каталог продукции"
  - "Оставить заявку"
  - "Поиск"
  - "Лицензии и сертификаты"
  - "Производство"
  - "Пресс-центр"
  - "Применение"
---

## <img src='media/icons/gradle.svg' width="50"/> Запуск из терминала

Локальный запуск:
```
gradle clean test
```
Удаленный запуск:
```
clean
${TASK}
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}  
-DremoteUrl=${SELENOID_URL}
```

---

## <img src='media/icons/jenkins.svg' width="50"/> Сборка в Jenkins

[Сборка в Jenkins](https://jenkins.autotests.cloud/job/Ready-madeProjectKorsarCase/)

<img src='media/icons/СкринСборкиJenkins.jpg'/>

### Параметры сборки в Jenkins:


* `${TASK}`- набор тестов, который будет запущен
  * test - все тесты проекта
  * header_test - тесты на проверку работы хедера
  * menu_test - тесты на проверку работы меню
* `${BROWSER}` и `${BROWSER_VERSION}` - браузер и его версия. По умолчанию - Chrome: 128
* `${BROWSER_SIZE}` - разрешение бразуера. По умолчанию - 1920x1080.
* `${SELENOID_URL}` - адрес удаленного сервера Selenoid.

---

## <img src='media/icons/Allure_Report.svg' width="50"/>Allure отчет
[Allure отчет](https://jenkins.autotests.cloud/job/Ready-madeProjectKorsarCase/18/allure/)

* ### Главный экран отчета
<img src='media/icons/СкринОтчетаAllure.jpg'/>

* ### Страница с проведенными тестами
<img src='media/icons/СкринОтчетаAllureSuties.jpg'/>

Содержание Allure-отчета:
* Шаги теста
* Скриншот страницы на последнем шаге
* Page Source
* Логи браузерной консоли
* Видео выполнения автотеста.

---
## <img src='media/icons/telegram.svg' width="50"/> Уведомление в Telegram при помощи бота

<img src='media/icons/СкринОтчетаВТегреграм.jpg'/>

---
## <img src='media/icons/Selenoid.svg' width="50"/> Примеры видео прохождения тестов
> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.

<img src='media/gif/selenoid.gif'/>