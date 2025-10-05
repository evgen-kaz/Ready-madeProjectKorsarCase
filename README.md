## Проект по автоматизации тестовых сценариев для сайта компании [Корсар](https://korsarcase.ru/)

> Корсар - крупнейший российский производитель и постащик профессиональных защитных кейсов и контейнеров   
> для транспортировки, эксплуатации и хранения специального оборудования.

### Структура

---
* Стек
* Запуск автотестов
* Сборка в Jenkins
* Запуск из терминала
* Allure отчет
* Интеграция с Allure TestOps
*  Уведомление в Telegram при помощи бота
* Видео примера запуска тестов в Selenoid
---

### Стек

<img src='media/icons/java.svg' width="50"/>
<img src='media/icons/junit.svg' width="50"/>
<img src='media/icons/Selenide.svg' width="50"/>
<img src='media/icons/Selenoid.svg' width="50"/>
<img src='media/icons/Allure_Report.svg' width="50"/>
<img src='media/icons/Allure_TO.svg' width="50"/>
<img src='media/icons/gradle.svg' width="50"/>
<img src='media/icons/jenkins.svg' width="50"/>
<img src='media/icons/telegram.svg' width="50"/>
<img src='media/icons/github.svg' width="50"/>
<img src='media/icons/intellij.svg' width="50"/>

---
### Реализованные проверки
- Проверка работы:
  - "Каталог продукции"
  - "Оставить заявку"
  - "Поиск"
- Проверка работы кнопок меню:
  - "Лицензии и сертификаты"
  - "Производство"
  - "Пресс-центр"
  - "Применение".

---
### <img src='media/icons/gradle.svg' width="50"/> Запуск из терминала

Локальный запуск:

>gradle clean test
>
Удаленный запуск:
```
clean test
${TASK} 
-Dremote=${SELENOID_URL}  
-Dbrowser=${BROWSER}  
-DbrowserVersion=${BROWSER_VERSION}  
-DbrowserResolution=${BROWSER_RESOLUTION}
```

---
### <img src='media/icons/jenkins.svg' width="50"/> Сборка в Jenkins

---

### <img src='media/icons/Allure_Report.svg' width="50"/>Allure отчет
[Allure отчет]()

---
### <img src='media/icons/Allure_TO.svg' width="50"/> Интеграция с Allure TestOps

---
### <img src='media/icons/telegram.svg' width="50"/> Уведомление в Telegram при помощи бота

---
### <img src='media/icons/Selenoid.svg' width="50"/> Примеры видео выполнения тестов на Selenoid
