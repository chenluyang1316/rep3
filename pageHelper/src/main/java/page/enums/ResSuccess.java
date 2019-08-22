package page.enums;

/**
 * 返回成功状态
 * 
 * @author yansunbao
 * @date 2018年8月20日
 */
public enum ResSuccess {

//以逗号隔开的，(枚举实例以分号结尾)最后以分号结尾的，这部分叫做，这个枚举类的实例。
// 也可以理解为，class new 出来的实例对象。
// 只是，class，new对象，可以自己随便new，想几个就几个，
// 而这个enum关键字，他就不行，他的实例对象，只能在这个enum里面体现。
// 也就是说，他对应的实例是有限的。这也就是枚举的好处了，
// 限制了某些东西的范围，比如：四季，只能有春夏秋冬，//枚举类限制了此类的实例对象。个数有限，可以枚举

//枚举类的实例对象必须在最前面先定义，而且必须每个实例对象都必须维护上成员变量
//每一个枚举变量都是枚举类实例
	SYS_200("200", "操作成功");

//添加成员变量的原因是，方便为构造方法赋值，使用ResSuccess.SYS_200.getMessage();就能获取对应的值
	private String code;
	private String message;

//	enum是没有构造函数的，准确的来说是没有public类型的构造函数，
//	它的构造函数只能是private类型的；
	ResSuccess(String code, String message) {

		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
