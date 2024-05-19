import java.util.Scanner;
public class string_methods {
    public static void main(String[] args) {
        String st="Jahnavi";
        System.out.println(st.length());
        System.out.println(st.toUpperCase());
        System.out.println(st.toLowerCase());
        System.out.println(st.trim());
        System.out.println(st.substring(0,5));
        System.out.println(st.replace("ahn","ojd"));
        System.out.println(st.startsWith("Jah"));
        System.out.println(st.endsWith("anvi"));
        System.out.println(st.charAt(3));
        System.out.println(st.indexOf('i'));
        System.out.println(st.indexOf("anv",2));
        System.out.println(st.lastIndexOf('a'));
        System.out.println(st.lastIndexOf('a',5));
        System.out.println(st.equals("jahnavi"));//case sensitive
        System.out.println(st.equalsIgnoreCase("JahNaVi"));
        System.out.println("I am \"escape sequnce\" right here\\ ");


    }
}
