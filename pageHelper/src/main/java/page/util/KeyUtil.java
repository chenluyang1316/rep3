package page.util;

import java.util.UUID;

/**
 * @author 赵东波
 * @date 2018/7/13 下午2:40
 */
public class KeyUtil {

    /**
     * 生成编号
     * @return
     */
    public static String genUniqueKey() {
        return System.currentTimeMillis()+"";
    }
    
    /**
	 * 获取uuid
	 * 
	 * @return String
	 */
	public static String getUuid() {
		return
			UUID.randomUUID()
				.toString()
				.replace("-", "") //将字符串中的"-",替换为""
				.toLowerCase();
	}
}
