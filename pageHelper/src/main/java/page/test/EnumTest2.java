package page.test;

public class EnumTest2 {
    public static void main(String[] args) {
//        System.out.println( ResultAndMsg.MSG_ERROR.getMsg());
//        System.out.println( ResultAndMsg.MSG_SUCCESS.getMsg());

//        System.out.println(Jj.SPRING.time+"--"+Jj.SPRING.desc);
//        System.out.println(Jj.FALL.time+"--"+Jj.FALL.desc);

        System.out.println(Jj.SPRING);
        System.out.println(Jj.FALL);
    }

    enum ResultAndMsg{
        //1 变量是枚举的实例，可以枚举
        //2 每个变量用逗号分隔，以分号结尾
        //只有私有的构造方法，实例变量中有几个值，声明几个成员变量

        MSG_SUCCESS("200","执行成功"),
        MSG_ERROR("406","执行失败");

        private  String msg;
        private  String code;

        ResultAndMsg(String msg,String code){
            this.msg=msg;
            this.code=code;
        }

        public String getMsg() {
            return msg;
        }

        public String getCode() {
            return code;
        }
    }

    enum Jj{
        SPRING("春天","万物复苏"),
        SUMMER("夏天","绿意盎然"),
        FALL("秋天","硕果累累"),
        WINTER("冬天","雪花飘飘");

        private String time;
        private  String desc;

        Jj( String time,String desc){
            this.time=time;
            this.desc=desc;
        }

        public String getTime() {
            return time;
        }

        public String getDesc() {
            return desc;
        }

        @Override
        public String toString() {
            return   time + ':' +  desc ;
        }
    }
}
