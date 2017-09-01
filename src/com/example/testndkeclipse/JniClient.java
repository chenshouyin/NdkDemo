package com.example.testndkeclipse;

import android.R.integer;

public class JniClient {
	//编译头文件命令 
	//1.先切换到项目目录
	//2.再输入 javah -classpath bin/classes -d jni com.example.testndkeclipse.JniClient 
	
	
	//1.底层返回字符串拼接后的结果
	public static  native String AddStr(String strA, String strB);
	//2.java中的数据类型和Jni层的数据对应关系
	public static  native void TestDataTypeJ2C(short s, int i, long l, float f,
			double d, char c, boolean z, byte b, String str,int[] array, Object obj,
			MyJavaClass mMyJavaClass);
	//3.底层操作基本数组 数据并返回数组
	public static   native int[] sumArray(int[] javaArray);
	//4.底层操作数组对象 底层返回一个size大小的二维数组
	public static  native int[][] getArrayObjectFromC(int size); 
	
	//5.java中的静态方法供C调用 也称c给java的回调
	public static native void callJavaStaticMethod();   
	//6.java中的对象方法供C调用 也称c给java的回调
    public static native void callJavaInstaceMethod();  
    //7.C/C++ 访问 Java实例变量
    public native static void accessInstanceField(ClassField obj);  
    //8.C/C++ 访问 Java静态变量
    public native static void accessStaticField();  
    //JNI 调用构造方法和父类实例方法
    public native static void callSuperInstanceMethod(); 

}