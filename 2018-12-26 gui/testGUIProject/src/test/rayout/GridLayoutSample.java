package test.rayout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutSample extends JFrame{
	public GridLayoutSample() {
		super("GridLayout Test");
		this.setBounds(100, 100, 400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new GridLayout(5, 5)); //그리드레이아웃으로 정함
		//줄수 칸수 지정 가능
		
		//컴포넌트 객체 생성하고 배치 처리
		for(int k = 1; k < 26; k++) {
			this.add(new JButton(String.valueOf(k)));
		}
				
		this.setVisible(true);
	}
}	
