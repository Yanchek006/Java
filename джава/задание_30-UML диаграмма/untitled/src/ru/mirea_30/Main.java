package ru.mirea_30;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {

        //создаем наш объект
        String[] territoryInfo = {"Customer: Miratov Calidarh ,35Adress: Moscow 1119923,Arbat 68a-50"};
        String[] resourcesInfo = {"Dish: Salad - 390 good dish "};
        String[] diplomacyInfo = {"Dish: Ice cream,0 Chocolate"};
        String[] diplomacyInfos = {"Drink:WATER - Martini -1234,Alcohol0.0% -good product"};
        String[] diplomacyInfoss = {"Drink:WINE - Super Wine - -432,Alcohol12.4% -red"};
        String[] diplomacyInfosss = {"Table order:4"};
        SaveRestaraunt savedGame = new SaveRestaraunt(territoryInfo, resourcesInfo, diplomacyInfo,diplomacyInfos,diplomacyInfoss,diplomacyInfosss);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Яна\\Desktop\\джава\\задание_30-UML диаграмма\\Menu.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем игру в файл
        objectOutputStream.writeObject(savedGame);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();
    }
}