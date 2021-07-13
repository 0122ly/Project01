import com.atly.bean.Customer;
import com.sun.org.apache.xerces.internal.dom.PSVIDocumentImpl;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ly0122
 * @data 2021/7/10 -19:03
 * 1、IDEA中代码模板所处位置：settings-Editor-live Templates可以自定义 （主要关注：遍历、other、plain、output）/Postfix Completion不可以自定义
 * 2、常用模板
 */
public class TemplatesTest {
    //    模板六:prsf:可生成private static final   私有静态全局常量
    private static final Customer CUST = new Customer();

    //变形:psf
    public static final int NUM = 1;
    //变形:psfi
    public static final int NUM2 = 2;
    //变形:psfs
    public static final String NATION = "china";

    //    模板一:psvm
    public static void main(String[] args) {
//    模板二:sout
        System.out.println("Hello!");
//    变形:soutp / soutm / soutv / xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Test.main");

        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);

//    模板三:fori
        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei", "LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//    变形:iter
        for (String s : arr) {
            System.out.println(s);

        }
//变形:itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
//    模板四:list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {

        }
//    变形:list.fori
        for (int i = 0; i < list.size(); i++) {

        }
//    变形:list.forr 逆序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
//    模板五:ifn
        ArrayList tt = new ArrayList();
        tt.add(123);
        tt.add(345);
        tt.add(567);

        if (list == null) {

        }
//    变形:inn
        if (list != null) {

        }
//    变形:xxx.nn /xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }


}
