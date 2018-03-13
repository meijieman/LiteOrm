## 来源
 copy from [GITHUB](https://github.com/litesuits/android-lite-orm)


## 混淆配置
```
-dontwarn com.litesuits.orm.**
-keep public class com.litesuits.orm.** { *;}

#避免混淆泛型 如果混淆报错建议关掉
-keepattributes Signature
-keepattributes Exceptions

```

bak
```
-dontwarn com.litesuits.orm.**
-keep public class com.litesuits.** { *;}

#避免混淆泛型 如果混淆报错建议关掉
-keepattributes Signature
-keepattributes Exceptions

#优化时允许访问并修改有修饰符的类和类的成员
-allowaccessmodification

#将文件来源重命名为“SourceFile”字符串
-renamesourcefileattribute SourceFile
#保留行号
-keepattributes SourceFile,LineNumberTable

# 枚举类不能被混淆
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}
```