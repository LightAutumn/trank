package com.yin.controller;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by yinyuxia on 2016/5/23.
 */
@Controller
@RequestMapping("/send")
public class EmailSendController {
   @Autowired
   JavaMailSender mailSender;
    @RequestMapping(value = "/email")
    public void sendEmail(){
        MimeMessage message=mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper=new MimeMessageHelper(message,true);
            helper.setFrom("gzbjyinyuxia@163.com");
            String[] tos={"gzbjyinyuxia@163.com","1915538176@qq.com"};
            helper.setTo(tos);
            helper.setSubject("发送带附件的邮件");
            helper.setText("请看附件");

                File file=new File("f:/a.JPG") ;
                helper.addAttachment("smail.jpg",file);

            mailSender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }


    }
}
