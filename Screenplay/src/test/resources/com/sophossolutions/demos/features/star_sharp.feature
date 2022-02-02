Feature: Crear un tipo de Business Unit y reunion en la pagina de StarSharp
  Yo como automatizador de pruebas
  Necesito crear una reunion y un tipo de Business Unit en la pagina de StarSharp
  Para demostrar mis habilidades como automatizador en Choucair testing

  Scenario Outline: Iniciar sesion de forma exitosa
    Given "Daniel" desea ir a la pagina de <url>
    And Realizar la autenticacion en la pagina
      | user   | password   |
      | <user> | <password> |
    When Crear un tipo de Business Unit
      | nameBusinnesUnit | <nameBusinnesUnit> |
    And Programar una nueva reunion
      | meetingName   | meetingNumber   | Location   | Latitud   | Longitude   | Address   | nameBusinnesUnit   | title   | identityNo   | firstName            | lastName   | Email   | starDateMeeting   | endDateMeeting   | starDateTimeMeeting   | endDateTimeMeeting   |
      | <meetingName> | <meetingNumber> | <Location> | <Latitud> | <Longitude> | <Address> | <nameBusinnesUnit> | <title> | <identityNo> | <firstNamefirstName> | <lastName> | <Email> | <starDateMeeting> | <endDateMeeting> | <starDateTimeMeeting> | <endDateTimeMeeting> |
    Then validar que la reunion sea creada correctamente

    Examples:
      | url                         | user  | password | nameBusinnesUnit     | meetingName | meetingNumber | Location | Latitud | Longitude | Address   | firstNamefirstName | lastName | Email          | starDateMeeting | endDateMeeting | starDateTimeMeeting | endDateTimeMeeting | title | identityNo |
      | "https://serenity.is/demo/" | admin | serenity | Bussines Unit Daniel | Reunion 1   | R1234         | Bogota   | 100     | 101       | carrera 1 | firstName          | lastName | test@gmail.com | 00:25           | 11:20          | 02/03/2022          | 02/04/2022         | title | identityNo |
