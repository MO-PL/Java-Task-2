# Java-Task-2
EN:

Use app to read selected parameters of cadastral register in XML file

To run app from command prompt first run cmd,
find dictionary Java-Task-2/src/main/java/,
compile Main.java:
"javac Main.java"
To run app properly you should add right 2 arguments:
First argument is format of xml database, choose: aaa or nas,
Second argument is name of xml file, examples are: parcel_aaa.xml or parcel_nas.xml
Call should look like this:
"java Main aaa parcel_aaa.xml"


PL:

Aplikacja służy do odczytania wybranych danych z rejestru katastralnego zapisanego w fliku XML

Aby uruchomić aplikację w wierszu poleceń otwórz cmd,
znajdź folder Java-Task-2/src/main/java/,
skompiluj Main.java:
"javac Main.java"
Aby poprawnie uruchomić aplikację należy podać 2 argumenty:
Pierwszy argument to format danych, wybierz: aaa lub nas
Drugi argument to nazwa pliku xml z danymi, przykładem są: parcel_aaa.xml lub parcel_nas.xml
Wywołanie powinno wyglądać tak:
"java Main aaa parcel_aaa.xml"

Stosunkowo łatwo można dodać inne formaty rejestrów np angielski,
wystarczy dodać listę słów kluczowych do klasy StorageOfKeywords, 
zmienić funkcję if na switch w klasie PrintAllHandlerSax,
oraz dodać nowy format do validacji danych wejściowych w klasie InputValidation.
