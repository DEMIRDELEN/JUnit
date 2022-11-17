package Junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class J05TestPractice {

    @ParameterizedTest
    @ValueSource(strings={"qwert","wert","null","qwe"})
    void testLength(String str){
        assertTrue(str.length()>0);
    }
    @ParameterizedTest
    @CsvSource(value={"true,junit,u","false, mvc,z" })//comma-separated values annjotations
    //csv annotu 3 degeri contains methodu mantigi ile test eder
    @DisplayName(" csv   DisplayName ile verildi")
    void testCsvSource(Boolean b,String s1,String s2){
        assertEquals(b,s1.contains(s2));
    }
    @RepeatedTest(10)
    @Disabled
    void testRepeat(){
        String[] arr={"hibernate", "hibernate" ,"wdw", "wdwq" ,"dwqd"};
       // assertEquals("mvc","mvc spring bir framework".substring(0,3));
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[0],arr[i]);
        }

    }



}
