public class substring{

    public static String substring(String str,int si,int ei)
    {
        String sub = "";
        for(int i=si;i<ei;i++)
        {
            sub += str.charAt(i);
        }
        return  sub;
    }
    public static void main(String[] args) {
        String str="hello world";
        System.out.println(substring(str, 0, 3));
    }
}
