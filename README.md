<a href='https://gitee.com/DaLianZhiYiKeJi/xpay/stargazers'><img src='https://gitee.com/DaLianZhiYiKeJi/xpay/badge/star.svg?theme=dark' alt='star'></img></a>
<a href='https://gitee.com/DaLianZhiYiKeJi/xpay/members'><img src='https://gitee.com/DaLianZhiYiKeJi/xpay/badge/fork.svg?theme=gray' alt='fork'></img></a>

[演示地址:http://demo.ukafu.com/](http://demo.ukafu.com/)

<img src="https://images.gitee.com/uploads/images/2018/0914/141509_bf37f6ae_2525.jpeg" alt="个人支付PC页面" /> 

# 微信支付宝个人收款
 这个是客户端.安卓APP监控收款通知
 还有一个xposed的端,原理百度一下,<a href="https://gitee.com/xinyu126/xp-pay" target="_blank">查看xposed的版本</a>
 网上一大票.就是监控通知.所以手机的设置很重要.需要把各种权限打开.让你要监控的目标把通知打开.判断标准就是,听到语音播报就可以.(美丽动听的 支付宝到账100元)
## 原理:	
	监控到支付宝到账100元,然后我们拿到这个通知告诉我们的网站:我刚才收到了100元.
	最近谁下了订单?嗯.最近张三说要还我100块钱.那就是张三咯.好,标记张三还钱100成功. 完成
	
	那张三和李四都说要还100怎么办?那就张三.你还99.99;李四你还100.01 说好的数字.倒是后我收到多少钱就是谁还的.
	所以我们一个金额的二维码要多设置几张.
## 接入:
* 先APP装好 
* [APP下载地址](https://fir.im/nmc9/) , 
* [PHP接入源码](https://gitee.com/sipengcode/quick-pay/)
## 二维码识别:
	zxing 识别二维码,网上教程很多.这也是copy过来的.
	
## 收款码金额识别:
	二维码的金额需要入数据库才可以在用户订单选择5元的时候,展示5.01元的收款码,如果让客户一张张的手动输入金额.那还用程序员干啥?
	微信支付宝的收款码金额识别:
	框架是没有.但是收费API有.可以把收款码上传给API,阿里云/腾讯云/百度云 都有文字识别API.腾讯云一天1000是免费的.可以用.
	这里使用的是腾讯云的OCR,识别二维码的收款金额;
	调用API即可获取二维码上的所有文字.找到￥符号.正则匹配即可.
## 人肉核:
	不怕一万就怕万一.如果哪个订单收到钱而未触发订单完成.那么就需要手动完成一下订单咯.(比如关机,断网,都有可能导致)
	订单管理,列出了自己的所有订单.看看有没有失败的订单(收到钱,没发货).手动点一下完成即可
	
# 下单
 <a href="https://gitee.com/sipengcode/quick-pay" targe="_blank"> 下单演示,接入文档, PHP Demo </a>
	支付页面,手机,PC自适应
# QQ交流群
  153497287# XpayAlipay
