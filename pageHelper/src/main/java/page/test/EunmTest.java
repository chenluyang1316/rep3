package page.test;

public class EunmTest {
    public static void main(String[] args) {
        System.out.println(MsgEnum.MSG_SRC.msg+MsgEnum.MSG_SRC.code);
        System.out.println(MsgEnum.MSG_ERROR.msg+MsgEnum.MSG_ERROR.code);
    }

    //枚举类
    enum  MsgEnum{
        //为什么叫枚举？因为该类的实例可以枚举出来，比如季节：只有春夏秋冬
        //枚举类不能被继承

        //每个变量都是该枚举类的实例，（多个实例之间用逗号）以分号结束；
        MSG_ERROR("error","失败"),
        MSG_SRC("src","成功");

        //成员变量方便构造赋值
        private  String msg;
        private  String code;

        //私有的构造方法
        MsgEnum(String msg,String code){
            this.msg=msg;
            this.code=code;
        }

        //有get方法即可
        public String getMsg() {
            return msg;
        }

        public String getCode() {
            return code;
        }
    }
}
