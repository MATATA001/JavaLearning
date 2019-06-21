package com.cx.java.stringProgramming;

/**
 * 要分割.和| 转义字符，必须在前面加\\
 */
public class SplitLearning {
    public static void main(String[] args){
        String init = "home/myb/argus/apks/app1.apk";
        String splitApk = init.split("apk")[0];
        String splitPot = init.split("\\.apk")[0];
        String splitdotApk = init.split(".apk")[0];
        System.out.println("split.apk = "+splitApk+"\n"+"split . = "+splitPot+"\n"+splitdotApk);

    }

}
