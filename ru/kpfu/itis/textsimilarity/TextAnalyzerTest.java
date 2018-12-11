package ru.kpfu.itis.textsimilarity;

import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class TextAnalyzerTest {
    TextAnalyzer a;
    TextAnalyzer b;

    @Before
    public void setUp() {
        a = new CosTextAnalyzer();
        b = new JaccardTextAnalyzer();
    }

    @Test
    public void TestSimplTextProvider() {
        String s = "aaaaaa";
        TextProvider a = new SimpleTextProvider(s);
    }

    @Test
    public void TestFileTextProvider() {
        File f1 = new File("D:\\files\\Videos\\f1.txt");
        TextProvider a = new FileTextProvider(f1);
    }

    @Test
    public void TestJaccardAnalyzer() {
        String s1 = "aaaaaa";
        String s2 = "AAAAAA";
        TextProvider a = new SimpleTextProvider(s1);
        TextProvider b = new SimpleTextProvider(s2);
        TextAnalyzer te = new JaccardTextAnalyzer();
        te.analyze(a, b);
    }

    @Test
    public void TestCosAnalyzer() {
        String s1 = "aaaaaa";
        String s2 = "AAAAAA";
        TextProvider a = new SimpleTextProvider(s1);
        TextProvider b = new SimpleTextProvider(s2);
        TextAnalyzer te = new CosTextAnalyzer();
        te.analyze(a, b);
    }

    @Test
    public void TestCosSerchEngine() {
        TextProvider tp = new SimpleTextProvider("мама");
        String dirWay = "D:\\files\\Videos";
        GetTextProvidesList getTextProvidesList = new GetTextProvidesList(dirWay);
        SearchEngine searchEngineCOS = new SearchEngineCOS();
        searchEngineCOS.getSortedByRelevanceList(tp, getTextProvidesList.List());
    }

    @Test
    public void TestJaccardSerchEngine() {
        TextProvider tp = new SimpleTextProvider("мама");
        String dirWay = "D:\\files\\Videos";
        GetTextProvidesList getTextProvidesList = new GetTextProvidesList(dirWay);
        SearchEngine searchEngineJAC = new SearchEngineJAC();
        searchEngineJAC.getSortedByRelevanceList(tp, getTextProvidesList.List());
    }
}

