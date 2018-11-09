package com.zhiyi.onepay.data;

/**
 *  二维码的识别数据
 */

public class QrCodeData {
    public static final int TYPE_WX = 1;
    public static final int TYPE_ALI = 2;
    public static final String NAME_WX = "WXPAY";
    public static final String NAME_ALI = "ALIPAY";
    public int type;
    public String name;
    public String money;
}
