package com.reno.wechat;

import cn.zhouyafeng.itchat4j.beans.BaseMsg;
import cn.zhouyafeng.itchat4j.face.IMsgHandlerFace;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

/**
 * Created by qxl19 on 2018/5/13.
 */
public class WechatMsgHandler implements IMsgHandlerFace {

    private static Logger logger = Logger.getLogger(WechatMsgHandler.class);

    @Override
    public String textMsgHandle(BaseMsg msg) {
        logger.info(msg.getFromUserName()+":"+msg.getContent());
        return null;
    }

    @Override
    public String picMsgHandle(BaseMsg msg) {
        return null;
    }

    @Override
    public String voiceMsgHandle(BaseMsg msg) {
        return null;
    }

    @Override
    public String viedoMsgHandle(BaseMsg msg) {
        return null;
    }

    @Override
    public String nameCardMsgHandle(BaseMsg msg) {
        return null;
    }

    @Override
    public void sysMsgHandle(BaseMsg msg) {

    }

    @Override
    public String verifyAddFriendMsgHandle(BaseMsg msg) {
        return null;
    }

    @Override
    public String mediaMsgHandle(BaseMsg msg) {
        return null;
    }
}
