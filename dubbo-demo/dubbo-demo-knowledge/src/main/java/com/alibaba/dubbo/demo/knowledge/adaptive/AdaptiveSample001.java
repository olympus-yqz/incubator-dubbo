package com.alibaba.dubbo.demo.knowledge.adaptive;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class AdaptiveSample001 {
    public static void main(String[] args) {

        ExtensionLoader<AdaptiveExt001> loader = ExtensionLoader.getExtensionLoader(AdaptiveExt001.class);

        AdaptiveExt001 ext001 = loader.getAdaptiveExtension();

        /*
         * URL为总线的模式。而自适应即是根据这些信息来决定调用哪一个插件的实现 ?
         * */
        URL url = URL.valueOf("test://localhost/test");
        String result01 = ext001.echo01("d", url);

        System.out.println(result01);
    }
}
