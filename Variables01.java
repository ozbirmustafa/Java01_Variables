package day01variables;

public class Variables01 {

    /*variable nasil olusturulur?

    ==> 1)access modifier 2)data type 3)variable name 4)= 5)value 6);
    ==>Java'da ";" ing.deki nokta gibidir
    ==>ing.de cümle deriz Java'da "statement" deriz
    ==>"=" ASSIGMENT OPERATOR olarak adlandırılır
    sağdaki değeri alıp soldakinin içerisine koyar
    */
    public int age = 13;
    public int height = 183;

    //Types of DATAs on JAVA
    /*
               Primitive Data Types ( tek bir değer olacak)

    1)int:     INTEGER tam sayı demektir.   32 bit
               JAVA'da tam sayıların başı ve sonu vardır matematiğin aksine.

    2)byte:    tam sayılar için kullanılır  8 bit
               en küçük byte = -128
               en büyük byte = 127

    3)short:   tam sayılar için             16 bit
               En küçük short = -32768
               En büyük short =  32767

    4)long:    tam sayılar için             64 bit
               Integerların yetersiz kaldığı yerlerde kullanılır
               *dünyanın nüfusu gibi

    5)float:   ondalıklı sayılar içindir.   32 bit
               "float" virgülden sonra 7 basamak içerebilir. (fiyatlar)
               "float" değerlerinde sona "f" ya da "F" koyulur.

    6)double:  ondalıklı sayılar içindir.   64 bit
               "double" virgülden sonra 16 basamak içerebilir. (hassas ölçüler)
               "GENELDE DOUBLE KULLANIRIZ

    7)boolean: true ya da false değerleri için kullanılır. 1 bit kullanır.

    8)char:    tek karakterler için kullanılır.  16 bit kullanır
               A, c, 2, ?, _, =,
               Note: charlara değer verirken değeri tek tırnak içine alırız.

               Note: Java büyük ve küçük harflere duyarlıdır.

               Note: Numeric Data Types==> byte < short < int < long < float < double


               Non-Primitive Data Types (değer ve method-aksiyon- olacak)

               String: isim, adres , ^^^kimlik no^^^ gibi bir veya birden fazla karakter içeren değerler için kullanılır.
                       çift tırnak kullanılır.

               PRIMATIVE ile NON PRIMITIVE arasındaki farklar

     1) Non-Primative data tiplerinde değerin yanında methodlar vardır.
        Primative data tiplerinde ise sadece değer vardır, method yoktur.

     2) Primative data tipleri java tarafından oluşturulmuştur. Toplam 8 tanedeir. Biz oluşturamayız.
        Non-Primative data tipleri java tarafından oluşturulmuştur biz de oluşturabiliriz.
        Non-Primative data tipleri sayılamayacak kadar çoktur. Çünkü her dev. np data type oluşturabilir.

     3) Primative data tip isimleri KÜÇÜK harfle başlar.
        Non-Primative data tip isimleri BÜYÜK harfle başlar.

     4) Primative data tipleri memoryde FARKLI büyüklükte yerler kullanırlar.
        Non-Primative data tipleri memoryde AYNI büyüklükte yerler kullanırlar.




     */
    public byte price = 12;

    public short populationOfVillage = 23000;

    public float priceOfShirt = 15.5f;

    public double weightOfCell = 0.000012045;

    // long yazmamıza rağmen java verilen sayıyı "int" kabul eder.
    // O yüzden değerin sonuna L koyarız (int değeri dışındaysa)
    public long populationOfWorld = 7000000000L;

    public long x = 123456789;

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial = 'S';

    public String name = ("Tom Hanks");

    //"main method" arabanın motoru gibidir.
    // "main method" çalışmadan hiçbir şey çalışmaz.


}





