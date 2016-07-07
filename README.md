# Android-AlarmManagerClock
设置闹钟的一个封装的比较全面的demo
>前些时候，有人在我「非著名程序员」公众号的后台问我有没有设置闹钟的demo，我当时说承诺为大家写一个，一直没空，直到最近又有人跟我要，我决定抽时间写一个吧。确实设置闹钟是一个比较麻烦的东西。我在这里写的这个demo抽出来了封装了一个类库，大家直接调用其中的设置闹钟和取消闹钟的方法即可。可以设置每天的闹钟，周一到星期天之间多选的闹钟，也可以设置选择一次性闹钟，跟系统设置闹钟的方式基本差不多吧。

### 效果图
来看分析和讲解之前，先看看效果吧，效果图如下：

**设置界面**

![](https://raw.githubusercontent.com/loonggg/BlogImages/master/AlarmManager/ssdsfsdfs.gif)

**闹钟提醒界面**

![](https://raw.githubusercontent.com/loonggg/BlogImages/master/AlarmManager/Screenshot_2016-05-24-18-20-28-249_AlarmManagerCl.png)

### 使用方法介绍：

#### 设置闹钟的方法：

```
setAlarm(Context context, int flag, int hour, int minute, int id, int
            week, String tips, int soundOrVibrator)
```

参数介绍：

@param flag            周期性时间间隔的标志,flag = 0 表示一次性的闹钟, flag = 1 表示每天提醒的闹钟(1天的时间间隔),flag = 2
表示按周每周提醒的闹钟（一周的周期性时间间隔）

@param hour            时

@param minute          分

@param id              闹钟的id

@param week            week=0表示一次性闹钟或者按天的周期性闹钟，非0 的情况下是几就代表以周为周期性的周几的闹钟

@param tips            闹钟提示信息

@param soundOrVibrator 2表示声音和震动都执行，1表示只有铃声提醒，0表示只有震动提醒

#### 取消闹钟的方法：

```
canceAlarm(Context context, String action, int id) 
```
参数介绍：

action：自定义广播的action

id：设置闹钟时的id

### 微信公众号
欢迎大家关注我的微信公众号：非著名程序员（smart_android），更多好的原创文章均首发于微信订阅号：非著名程序员
![](https://raw.githubusercontent.com/loonggg/BlogImages/master/%E5%85%AC%E4%BC%97%E5%8F%B7%E4%BA%8C%E7%BB%B4%E7%A0%81/erweima.jpg)
