package ders12_StringManipulation;

public class C05_repeat_trim {
    public static void main(String[] args) {

        String str="java guzeldir\n "; // alt alta yazsin diye \n yaptik

        System.out.println(str.repeat(4));
        // istediginiz metni istediginiz kadar tekrar ediyor
        // 4 seçtik ; java guzeldir java guzeldir java guzeldir java guzeldir

        str="   Java guzeldir   ";

        System.out.println(str.length());//19
        str=str.trim();

        System.out.println(str);// Java guzeldir
        System.out.println(str.length());// 13

    }
}
