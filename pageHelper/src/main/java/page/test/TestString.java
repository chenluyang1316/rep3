package page.test;

public class TestString {
    public static void main(String[] args) {
        String name="tom";
//        if (!"".equals(name) && name!=null){
//            System.out.println("---");
//        }
//        if (name!=null && !name.equals("")){
//            System.out.println("---");
//        }

//        String s1 = new String();
//        char[] chars={'a','b'};
//        String s2 = new String(chars);
//        byte[] bytes={65,66,67};
//        String s3 = new String(bytes);
//
//        System.out.println(s1+"-s1-");
//        System.out.println(s2+"-s2-");
//        System.out.println(s3+"-s3-");

        // 字符串是一个对象，
        // 创建的方式 ：1 直接创建 ，2 通过字符数组， 3 通过字节数组 ，4 空参构造

//        String s="abcdefg";
//        System.out.println(s.length());
//        //将指定的字符串连接到该字符串的末尾
//        System.out.println(s.concat("11"));
//        System.out.println(s.charAt(2));
//        //返回子字符串在该字符串首次出现的位置索引，没有返回-1
//        System.out.println(s.indexOf("ff"));


        //String s="a-b-c-d-e-f-g";

//        char[] chars = s.toCharArray();
//        for (char c : chars) {
//            System.out.println(c);
//        }
//        byte[] bytes = s.getBytes();
//        for (byte aByte : bytes) {
//            System.out.println(aByte);
//        }

      //  System.out.println(s.replace("-","").toUpperCase());

//        String s="a-b-c-d-e-f-g";
//        String[] split = s.split("-");
//        System.out.println(split.length);
//        for (String s1 : split) {
//            System.out.println(s1);
//        }

        String s="aa.bb.cc";
        String[] split = s.split("\\.");
        for (String s1 : split) {
            System.out.println(s1);
        }

        //[word1#word2#word3]
        int[] arrays={1,2,3};
        String toStr = toStr(arrays);
        System.out.println(toStr);

    }

    public static  String toStr(int[] arrays){
        //[word1#word2#word3]
        String str="[";
        for (int i = 0; i < arrays.length; i++) {
           if (i==arrays.length-1){
               str+="word"+arrays[i]+"]";
           }
           else {
             str+="word"+arrays[i]+"#";
           }
        }

        return str;
    }
}
