package test.frame;

import javax.swing.*;
import java.awt.*;

public class ThirdFrame {

	public static void main(String[] args) {
		// 상속을 받지 않고 직접 JFrame 객체 생성
		JFrame mainFrame = new JFrame("세번째 gui 애플리케이션"); //객체생성시 타이틀값 바로 넣을수있음
		mainFrame.setBounds(new Rectangle(0, 0, 400, 300));  //Rectangle에 위치와 크기를 저장해서 쓸수있음
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
}
