package chapter02;

import com.github.jdbc.MyDriver;

import java.util.ServiceLoader;


/**
 * @author kongyaolang
 * @date 2018/10/26
 */
public class Main {

    public static void main(String[] args) {
        ServiceLoader<MyDriver> myDrivers = ServiceLoader.load(MyDriver.class);
        for (MyDriver myDriver : myDrivers) {
            myDriver.getConnection("mysql://127.0.0.1");
        }

        ServiceLoader<MyDriver> myDrivers2 = ServiceLoader.load(MyDriver.class);
        for (MyDriver myDriver : myDrivers2) {
            myDriver.getConnection("mysql://127.0.0.1");
        }
    }
}
