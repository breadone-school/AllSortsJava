import java.util.Arrays;
import java.util.Random;

import org.omg.CORBA.Current;

public class App {

    public static int GenerateRandom(int bound) {

        Random rint = new Random();

        return rint.nextInt(bound);
    }

    public static void main(String[] args) throws Exception {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i]=GenerateRandom(50);
         }

        //BinarySearch(array);


        SearchStr();
    }

    public static void BinarySearch(int[] array) throws IndexOutOfBoundsException{
        boolean found = false, searchfailed = false;
        int first = 0, middle = 0, last = array.length;
        String searchitem;

        System.out.print("what to search: ");
        searchitem = System.console().readLine();

        try {
            while (found == false && searchfailed == false) {
                middle =(first + last) / 2;
    
                if (array[middle] == Integer.parseInt(searchitem)) {
                    found = true;
                } else if (first >= last) {
                    searchfailed = true;
                } else if (array[middle] > Integer.parseInt(searchitem)) {
                    last = middle - 1;
                } else {
                    first = middle + 1;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ok u dum dum");
        }



        if (found == true) {
            System.out.println(middle);
        } else{
            System.out.println("no");
        }
    }


    public static void IncredibleSort(int[] array){
        String[] ok = new String[20];

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            
        }

    }


    public static String randomString() {
        Random onechr = new Random();
        String rString = "";
        int chr;

            for (int j = 0; j < onechr.nextInt(9) + 1; j++) {
                chr = onechr.nextInt(26) + 97;
                rString += (char) chr;
            }

        return rString;    
    }


    public static void SearchStr() {
        String StrArr[] = new String[20], TempString;
        int CurrentChar, NextChar;
        boolean Sorted = true;

        for (int i = 0; i < StrArr.length; i++) {
            StrArr[i] = randomString();
        }

        //Arrays.sort(StrArr);

        System.out.println("UNSORTED");
        for (int i = 0; i < StrArr.length; i++) {
            System.out.print(StrArr[i] +  " ");
        }


        do {
            Sorted = true;

            for (int i = 0; i < StrArr.length - 1; i++) {
                CurrentChar = (int) StrArr[i].charAt(0);
                NextChar = (int) StrArr[i + 1].charAt(0);
        
                if (CurrentChar > NextChar) {
                    Sorted = false;
                    TempString = StrArr[i];
                    StrArr[i] = StrArr[i + 1];
                    StrArr[i + 1] = TempString;
                } else if (CurrentChar < NextChar) {
                    //epic
                } else if (CurrentChar == NextChar) {
                    //also epic but idk    
                }
            }           
        } while (Sorted == false);


        System.out.println();
        System.out.println("SORTED");
        for (int i = 0; i < StrArr.length; i++) {
            System.out.print(StrArr[i] +  " ");
        }

    }
}
