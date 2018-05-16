package com.reno.wechat;

import cn.zhouyafeng.itchat4j.Wechat;
import cn.zhouyafeng.itchat4j.face.IMsgHandlerFace;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StringUtils;

import java.io.FileNotFoundException;

/**
 * Created by qxl19 on 2018/5/13.
 */
//@Service
public class WechatService {

    public static Logger LOGGER = Logger.getLogger(WechatService.class);

    private static String RootPath = null;

    public static String getRootPath() {
        if (StringUtils.isEmpty(RootPath)) {
            String fullClasss = WechatService.class.getClassLoader().getResource("/").getPath();
            RootPath = fullClasss.substring(0, fullClasss.length() - 16);
        }
        return RootPath;
    }

    private static String QRname = null;

    public static void setQRname(String name) {
        QRname = name;
    }

    public static String getQRname() {
        return QRname;
    }


    public WechatService() throws FileNotFoundException {
        Runnable r = () -> {
            String qrPath = null;
            qrPath = getRootPath() + "/pictures";
            // String qrPath = "F:\\GitLocal\\itchat4j"; // 保存登陆二维码图片的路径，这里需要在本地新建目录
            IMsgHandlerFace msgHandler = new WechatMsgHandler(); // 实现IMsgHandlerFace接口的类
            Wechat wechat = new Wechat(msgHandler, qrPath); // 【注入】
            wechat.start(); // 启动服务，会在qrPath下生成一张二维码图片，扫描即可登陆，注意，二维码图片如果超过一定时间未扫描会过期，过期时会自动更新，所以你可能需要重新打开图片
        };


        new Thread(r).start();
    }
}
