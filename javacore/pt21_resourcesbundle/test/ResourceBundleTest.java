package maratonajava.javacore.pt21_resourcesbundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle resourceBundle = ResourceBundle.getBundle("mensagens", new Locale("pt","BR"));
        System.out.println(resourceBundle.getString("ola"));
        System.out.println(resourceBundle.getString("bom.dia"));

        resourceBundle = ResourceBundle.getBundle("mensagens", new Locale("en", "US"));
        System.out.println(resourceBundle.getString("ola"));
        System.out.println(resourceBundle.getString("bom.dia"));

        System.out.println(resourceBundle.getString("show"));
    }
}
