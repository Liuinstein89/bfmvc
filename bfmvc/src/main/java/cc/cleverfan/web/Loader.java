package cc.cleverfan.web;

import cc.cleverfan.web.bean.BeanContainer;
import cc.cleverfan.web.helper.ClassHelper;
import cc.cleverfan.web.helper.ControllerHelper;
import cc.cleverfan.web.helper.IocHelper;
import cc.cleverfan.web.utils.ClassUtil;

import java.util.Arrays;

/**
 * 初始化框架
 */
public class Loader {

    public static void init() {
        Class<?>[] cs = {ClassHelper.class,
                BeanContainer.class,
                IocHelper.class,
                ControllerHelper.class};

        Arrays.stream(cs)
                .forEach(c -> ClassUtil.loadClass(c.getName(),true));

    }
}
