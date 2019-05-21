# app_autotest_zys

/Users/yongsong/Library/Android/sdk/tools/bin

./uiautomatorviewer 启动uiautomatorviewer 

1. 找到Android SDK的安装目录，默认为~/Library/Android/sdk/ 
2. 命令行
cd ~/Library/Android/sdk/tools/

//查看模拟设备列表
./emulator -list-avds

//启动某个模拟设备
./emulator @AVD_name
./emulator @Pixel_API_23

* AVD模拟设备所在的目录~/.android./avd/ 
* 每个设备会有一个name.ini文件，和一个name.avd目录
* name.avd目录，包含：
    * system.img
    * cache.img
    * userdata.img
    * sdcard.img
    * 等


uiautomatorviewer


https://blog.csdn.net/maxjuxain/article/details/80447210

