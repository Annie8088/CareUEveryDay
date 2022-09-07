package cn.ofpp;

import cn.hutool.core.util.StrUtil;
import cn.ofpp.core.Wx;

/**
 * 引导配置
 *
 * @author DokiYolo
 * Date 2022-08-22
 */
public class Bootstrap {

    /**
     * 公众号AppID
     */
    public static final String APP_ID = "wxa457284c808c6a81";

    /**
     * 公众号秘钥
     */
    public static final String SECRET = "13eaeffffb40d3b4768120750528f449";

    /**
     * 全局模板ID  也可针对单个Friend指定模板
     */
    public static final String TEMPLATE_ID = "_GVA7yl4K9Lvlf4CrrdAt0XpbzAFZRTDIQdboyGQWfE";

    /**
     * 初始化
     */
    public static void init() {
        if (StrUtil.hasEmpty(APP_ID, SECRET, TEMPLATE_ID)) {
            throw new IllegalArgumentException("请检查配置");
        }
        Wx.init();
    }

}
