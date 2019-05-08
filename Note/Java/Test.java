class Test {
    public static void main(String[] args) {
        String str1="LittleControl";
        String str2="LittleControl";
        System.out.println(str1==str2);//true
        System.out.println(str1.equals(str2));//true
        String str3=new String("LittleControl");
        String str4=new String("LittleControl");
        System.out.println(str3==str4);//false
        System.out.println(str3.equals(str4));//true
    }
}
/*烟火里的尘埃
今朝有酒今朝醉，明日散发弄扁舟
这个城市的风很大，孤独的人总是晚回家*/