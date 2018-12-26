package test.frame;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		super("두번째 프레임 애플리케이션"); //부모생성자쪽에 타이틀값을 넘김
		this.setBounds(0, 0, 400, 300);  //위치와 크기를 한방에 설정
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		this.setVisible(true);
	}
}
