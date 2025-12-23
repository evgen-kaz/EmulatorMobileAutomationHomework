# Проект по автоматизации тестирования для мобильного приложения [Wikipedia](https://ru.wikipedia.org)
<a href="https://github.com/wikimedia/apps-android-wikipedia/releases/tag/latest"><img src='media/icons/Wikipedia-logo.png' width="25%"/></a>

## Структура

* <a href="#tools">Стек</a>
* <a href="#cases">Реализованные проверки</a>
* <a href="#console">Запуск из терминала</a>
* <a href="#jenkins">Сборка в Jenkins</a>
* <a href="#allure_TestOps">Интеграция с Allure TestOps</a>
* <a href="#video">Видео примера запуска теста</a>
---

<a id="tools"></a>
## Стек

<p align="center">  
<a href="https://www.java.com/"><img src='media/icons/java.svg' width="50"/></a> 
<a href="https://junit.org/junit5/"><img src='media/icons/junit.svg' width="50"/></a> 
<a href="https://www.browserstack.com/"><img src='media/icons/browserstack-icon.svg' width="50"/></a> 
<a href="https://appium.io/"><img src='media/icons/appium.svg' width="50"/></a>
<a href="https://selenide.org/"><img src='media/icons/Selenide.svg' width="50"/></a>
<a href="https://qameta.io/"><img src='media/icons/Allure_TO.svg' width="50"/></a>
<a href="https://allurereport.org/"><img src='media/icons/Allure_Report.svg' width="50"/></a>
<a href="https://gradle.org/"><img src='media/icons/gradle.svg' width="50"/></a> 
<a href="https://www.jenkins.io/"><img src='media/icons/jenkins.svg' width="50"/></a>
<a href="https://github.com/"><img src='media/icons/github.svg' width="50"/></a> 
<a href="https://www.jetbrains.com/idea/"><img src='media/icons/intellij.svg' width="50"/></a> 
</p>

---
<a id="cases"></a>
## Реализованные проверки
- Проверка всех экранов онбординга
---
<a id="console"></a>
## <img src='media/icons/gradle.svg' width="25"/> Запуск из терминала

Локальный запуск на эмуляторе:
```
./gradlew clean emulatorOrReal -DdeviceHost=emulation
```
Локальный запуск на реальном устройстве:
```
./gradlew clean emulatorOrReal -DdeviceHost=real
```
Запуск на Browserstack:
```
./gradlew clean browserstack -DuserName=${userName} -DaccessKey=${accessKey}
```
где параметры ```userName``` и ```accessKey``` это креды для аккаунта Browserstack.

---
<a id="jenkins"></a>
## <img src='media/icons/jenkins.svg' width="25"/> Сборка в Jenkins

[Сборка в Jenkins](https://jenkins.autotests.cloud/job/EmulatorMobileAutomationHomework/)

<img src='media/icons/mobile_emulation.jpg'/>

---
<a id="allure_TestOps"></a>
## <img src='media/icons/Allure_TO.svg' width="25"/> Интеграция с Allure TestOps
[Ссылка на Allure TestOps](https://allure.autotests.cloud/project/5056/test-cases?treeId=0)

* ### Главный экран запуска
<img src='media/icons/Allure_testOps_Kosar.jpg'/>

* ### Dashboard прогонов
<img src='media/icons/Дашборд_прогонов_korsar.jpg'/>

---
<a id="video"></a>
## <img src='media/icons/appium.svg' width="25"/> Пример видео выполнения теста на эмуляторе андроид

<p align="center">    
<img src='media/gif/Запись_теста2.gif' width="300"/>
</p>