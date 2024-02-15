    //Возможно сделать ручными тестами
    //1)Редирект  с сleben-arbeiten на https://formatberlin.de/
    //  1.Открыть страницу leben-arbeiten https://www.aerticket.de/de/ueber-uns/leben-arbeiten
    //  2. Кликнуть на ссылку "Olaf Schroeder Industrial Design"
    //  3. Открылась страница без ошибок (На странице не должно быть текста Fatal error)
    //2) Редирект с  Unsere AERKANTINA на на https://formatberlin.de/
    // https://www.aerticket.de/de/ueber-uns/die-aerkantina-gutes-essen-haelt-leib-und-seele-zusammen
    //  1. Открыть страницу Unsere AERKANTINA
    //  2. Кликнуть на ссылку "Olaf Schroeder Industrial Design"
    //  3. Открылась страница без ошибок (На странице не должно быть текста Fatal error)
    //
    //3) Подача заявки на вакансию "Travel Agent"
    //  1.Открыть страницу вакансии https://www.aerticket.de/de/jobs-und-ausbildung/consolidator-sucht-tarifspezialisten/travel-agent-m-w-d-gruppenreisen
    //  2.Кликнуть на кнопку подать заявку
    //  3.Открылась страница вакансии, 404 отсутствует на странице
    //4) Подача заявки на вакансию "Kaufmännischer Angestellter"
    //  1.Открыть страницу вакансии https://www.aerticket.de/de/jobs-und-ausbildung/kaufleute-und-buchhalter-innen-gesucht/kaufmaennischer-angestellter-m-w-d
    //  2.Кликнуть на кнопку подать заявку
    //  3.Открылась страница вакансии, 404 отсутствует на странице

 Тесты из файла Tests

    /* *Automated 1)Проверка переключения на  английскую версию сайта, а затем снова на немецкую:
               1. Открываем главную страницу https://www.aerticket.de/,

            2. переключаем язык на английский
            3. проверяем наличие слогана на английском: // "Professional to professional airline tickets"

       2) Проверка наличия контактов:
       Checking contact information on the contact page
            1. открываем главную страницу https://www.aerticket.de/
            2. кликаем на кнопку Kontakt
            3. открывается страница контакты https://www.aerticket.de/de/rechtliches/kontakt
            4. Проверяем что на странице контактов присутствуют контактные данные:
        AERTiCKET
      Boppstr. 10, 10967 Berlin

      Tel.: +49-30-69802-144

      E-Mail: vertrieb(at)aer.de bzw. global-sales(at)aer.de (für Agenturen mit Sitz außerhalb Deutschlands)
      Mit Fragen und Feedback zu AERHOTELS wenden Sie sich bitte an: hotelvertrieb(at)aer.de

      ок 3) Проверка открытия страницы jobs
          1. Открыть страницу вакансий https://www.aerticket.de/de/jobs-und-ausbildung
          2. Проверка наличия Текста "Wir suchen dich!"

      ок 4) Проверка редиректа с  на главную с Presse при клике на логотип
          1) открыть страницу https://www.aerticket.de/de/presse
          2) кликнуть на логотип в хедере
          3) проверить что произошел редирект на главную страницу https://www.aerticket.de/

       5) Проверка открытия страницы about us https://www.aerticket.de/de/ueber-uns
          1. перейти на страницу https://www.aerticket.de/de/ueber-uns
          2. проверить наличие текста "Wir sind AERTiCKET"


       6) Проверка перехода на страницу Cocpit  (добавить teg Skiped Сделать статус)
          1. Открыть главную страницу
          2. Кликнуть на кнопку "Cocpit"
          3. Проверка, что на странице "Cocpit": https://cockpit.aerticket.de/en/ отображается надпись "Login"

          Manual
          1. Check banner image
          2. Check the buttons on the banner (color and hover/click effects)
          2. Check the buttons on the banner (color and hover/click effects)

     */