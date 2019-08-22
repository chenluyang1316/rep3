package page.enums;

public enum ResError {
    //1 枚举实例
    SYS_400("400", "无效的请求", ""),//参数设置错误，    当其它4XX代码都不适用时，可以使用400
    SYS_401("401","无权限操作","请联系在技术支持进行授权。"),
    SYS_402("402","未找到服务地址","确认REST服务是否注册，建议通过接口测试页面进行验证。"),
    SYS_403("403","rest service invoke error","确认REST服务是否注册，建议通过接口测试页面进行验证。"),
    SYS_420("420", "缺少参数%s", ""),
    SYS_424("424(", "%s参数重复。", ""),
    SYS_425("425","timeout参数非法。", ""),
    SYS_426("426", "请求参数的值与类型不匹配。", ""),
    SYS_500("500", "Internal Server Error", ""), 
    SYS_504("504", "请求超时", "");              //分号结束
    //2 成员变量
    private String code;
    private String message;
    private String solution;
    //3 私有构造方法
    ResError(String code, String message, String solution){
        this.code = code;
        this.message = message;
        this.solution = solution;
    }
    //4 get方法
    public String getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
    public String getSolution() {
        return solution;
    }
    public String toString() {
        return code + ":" + message + "  解决方案：" + solution;
    }
}
