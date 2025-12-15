# <img src='media/icons/gradle.svg' width="50"/> Запуск из терминала

### Команда для локального запуска:
```
./gradlew clean emulatorOrReal -DdeviceHost=emulation
```
Параметр ``deviceHost``может быть ```emulation``` либо ```real```.

### Команда для запуска на Browserstack:
Для запуска тестов удаленно на Browserstack, где в параметрах ```userName``` и ```accessKey``` будет переданы учетные данные пользователя на Browserstack.

```
./gradlew clean browserstack -DdeviceHost=browserstack -DuserName=ИМЯ_ПОЛЬЗОВАТЕЛЯ -DaccessKey=КЛЮЧ_ДОСТУПА
```

---