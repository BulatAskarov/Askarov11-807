package ru.kpfu.itis.textsimilarity;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextAnalyzer a = new JaccardTextAnalyzer();
        TextAnalyzer b = new CosTextAnalyzer();
        System.out.println("Из консоли(0) или из файла(1)? 0/1");
        int choice1 = sc.nextInt();
        sc.nextLine();
        if (choice1 == 0) {
            System.out.println("Введите текст №1");
            String s1 = sc.nextLine();
            System.out.println("Введите текст №2");
            String s2 = sc.nextLine();
            double coef1 = a.analyze(new SimpleTextProvider(s1), new SimpleTextProvider(s2));
            double coefCos1 = b.analyze(new SimpleTextProvider(s1), new SimpleTextProvider(s2));
            System.out.println("Жаккард(0)/Косинус(1)?");
            int choice3 = sc.nextInt();
            sc.nextLine();
            if (choice3 == 0) {
                System.out.println("Жаккард для просто строк: " + coef1);
            }
            else {

                System.out.println("Косинусная мера для просто строк: " + coefCos1);
            }

        }
        else {
            System.out.println("Жакард(0)/Косинус(1)");
            int choice2 = sc.nextInt();
            sc.nextLine();
            System.out.println("Введите путь к файлу №1");
            File f1 = new File(sc.nextLine());
            System.out.println("Введите путь к файлу №2");
            File f2 = new File(sc.nextLine());
            if (choice2 == 0) {
                double coef2 = a.analyze(new FileTextProvider(f1), new FileTextProvider(f2));
                System.out.println("Жаккард для содержимого файлов: " + coef2);
            }
            else {
                double coefCos2 = b.analyze(new FileTextProvider(f1), new FileTextProvider(f2));
                System.out.println("Косинусная мера для просто строк: " + coefCos2);
            }
        }
        System.out.println("Введите поисковый запрос");
        String search = sc.nextLine();
        TextProvider tp = new SimpleTextProvider(search);
        System.out.println("Введите каталог");
        String dirWay = sc.next();
        GetTextProvidesList getTextProvidesList = new GetTextProvidesList(dirWay);
        SearchEngine searchEngineCOS = new SearchEngineCOS();
        searchEngineCOS.getSortedByRelevanceList(tp, getTextProvidesList.List());
    }
}
