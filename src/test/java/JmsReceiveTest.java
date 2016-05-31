import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQMessage;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.commons.net.telnet.EchoOptionHandler;

import javax.jms.*;

/**
 * Created by yinyuxia on 2016/5/23.
 */
public class JmsReceiveTest {
    public static void main(String[] args) {
        ConnectionFactory factory = new ActiveMQConnectionFactory("tcp://127.0.0.1:61616");
        Connection conn = null;
        Session session = null;
        try {
            conn = factory.createConnection();
            session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
            Destination destination = new ActiveMQQueue("yin.queue");
            MessageConsumer consumer = session.createConsumer(destination);
            System.out.println("我要开始接收了");
            conn.start();
            Message message = consumer.receive();
            TextMessage textMessage = (TextMessage) message;
            System.out.println("我是消费者，我接收到的消息时：：：" + textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
