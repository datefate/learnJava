package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * java 核心卷一的示例
 * 无用不要看
 * @author datefate
 * @site create 2020-10-04-下午8:33
 */
public class TimeTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(10000,listener);//arg1:发出通告的时间间隔，arg2：监听器对象
        t.start();//t 为定时器，启动定时器
        JOptionPane.showMessageDialog(null,"quit program");
        System.exit(0);
    }

    static class TimePrinter implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("???:"+new Date());
            Toolkit.getDefaultToolkit().beep();
        }
    }
}
