package cn.sd.jrz.controller;

import cn.sd.jrz.util.DmSoft;
import com.develop.jawin.COMException;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;

/**
 * @author 江荣展
 * @date 2020/06/17
 */
public class MainController {

    public static void main(String[] args) throws COMException {
        register();
        setLibPath();
        DmSoft dmSoft = new DmSoft("dm.dmsoft");
        String ver = dmSoft.Ver();
        System.out.println(ver);
        //很人多反应说 FindPic  引用类型的值无法返回，那就是真的无法返回，
        // 但是dm提供了个FindPicEx是专门针对像java这种用不了指针类型的语言使用的
        //所以当你遇到用不了的接口的时候你应该都能找到一个Ex的增强型接口，使用它就行了
        String s = dmSoft.GetColor(100, 100);
        System.out.println(s);
        /*String str = dmSoft.FindPicEx(0, 0, 2000, 2000, "D:\\1.bmp", "000000", 0.8, 0);
        System.out.println(str);*/
    }

    private static void register() {
        try {
            URL url = MainController.class.getClassLoader().getResource("lib/3.1233/dm.dll");
            if (url == null) {
                return;
            }
            File file = new File(url.getPath());
            Runtime runtime = Runtime.getRuntime();
            runtime.exec("regsvr32 /s " + file.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void setLibPath() {
        try {
            String libraryPath = ClassLoader.class.getResource("/lib").getPath();
            Field userPathsField = ClassLoader.class.getDeclaredField("usr_paths");
            userPathsField.setAccessible(true);
            String[] paths = (String[]) userPathsField.get(null);
            StringBuilder sb = new StringBuilder();
            for (String path : paths) {
                if (libraryPath.equals(path)) {
                    continue;
                }
                sb.append(path).append(';');
            }
            sb.append(libraryPath);
            System.setProperty("java.library.path", sb.toString());
            final Field sysPathsField = ClassLoader.class.getDeclaredField("sys_paths");
            sysPathsField.setAccessible(true);
            sysPathsField.set(null, null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

}
