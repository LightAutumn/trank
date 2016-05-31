package com.yin.controller;

/**
 * COPYRIGHT NOTICE: 2010-2011 www.core.com
 * 该产品或程序归 core.com 所有，任何人不得未经授权使用或传播该程序。通过授权的用户在使用
 * 该产品或程序时必须保证其完整性及其版权信息。
 */



import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * @author Andy Yin(andy@core.com)
 */
public class CheckCodeImageServlet extends HttpServlet {

    private static final long serialVersionUID = 4270611773617934545L;
    private static final int WIDTH = 50;
    private static final int HEIGHT = 20;
    private static final int LENGTH = 4;

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        OutputStream out = response.getOutputStream();

        BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Font mFont = new Font("Arial", Font.TRUETYPE_FONT, 18);
        Graphics g = image.getGraphics();
        Random random = new Random();
        // 设置背景颜色
        g.setColor(getRandColor(100, 200));
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // 设置字体
        g.setFont(mFont);

        //设置字体颜色
        g.setColor(getRandColor(180, 250));
        for (int i = 0; i < 555; i++) {
            int x = random.nextInt(WIDTH - 1);
            int y = random.nextInt(HEIGHT - 1);
            int xl = random.nextInt(6) + 1;
            int yl = random.nextInt(12) + 1;
            g.drawLine(x, y, x + xl, y + yl);
        }
        for (int i = 0; i < 450; i++) {
            int x = random.nextInt(WIDTH - 1);
            int y = random.nextInt(HEIGHT - 1);
            int xl = random.nextInt(12) + 1;
            int yl = random.nextInt(6) + 1;
            g.drawLine(x, y, x - xl, y - yl);
        }

        String sRand = "";
        for (int i = 0; i < LENGTH; i++) {
            String tmp = getRandomChar();
            while (tmp.equalsIgnoreCase("0") || tmp.equalsIgnoreCase("o") || tmp.equalsIgnoreCase("1") || tmp.equalsIgnoreCase("i") || tmp.equalsIgnoreCase("l") || tmp.equalsIgnoreCase("z") || tmp.equalsIgnoreCase("2")) {
                tmp = getRandomChar();
            }
            sRand += tmp;
            g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
            g.drawString(tmp, 12 * i + 1, 16);
        }

        HttpSession session = request.getSession(true);
        String checkCode="checkCode";
        session.setAttribute(checkCode, sRand);
        g.dispose();
        JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
        encoder.encode(image);
        out.close();
    }

    private String getRandomChar() {
        int rand = (int) Math.round(Math.random() * 2);
        long itmp = 0;
        char ctmp = '\u0000';
        switch (rand) {
            case 1:
                itmp = (long) Math.round(Math.random() * 25 + 97);
                ctmp = (char) itmp;
                return String.valueOf(ctmp);
            default:
                itmp = (long) (Math.random() * 9);
                return String.valueOf(itmp);
        }
    }

    // 设置颜色
    Color getRandColor(int fc, int bc) {
        Random random = new Random();
        fc = fc > 255 ? 255 : fc;
        bc = bc > 255 ? 255 : bc;
        int r = fc + random.nextInt(bc - fc);
        int g = fc + random.nextInt(bc - fc);
        int b = fc + random.nextInt(bc - fc);
        return new Color(r, g, b);
    }
}

