package 그래픽;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Date;

import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;

public class ThreadGraphic extends JFrame{ //JFrame으로부터 상속받아 ThreadGraphic클래스 자체가 JFrame이 된다.
	JLabel counter, image, day; //내부클래스와 변수를 같이 사용하기 위해서 전역(global)변수로 선언을 해야한다.
	   // 메인이 static 이므로 변수도 static으로 만들어야 한다
	   // static 변수 -> 객채생성 없이 언제든지 static 메서드에서 사용가능.
	
	public ThreadGraphic() { //생성자 메서드
		getContentPane().setBackground(Color.GREEN);
		setSize(800, 800);
		setTitle("나의 스레드들");
		getContentPane().setLayout(null);
		
		day = new JLabel("day");
		day.setHorizontalAlignment(SwingConstants.CENTER);
		day.setFont(new Font("굴림", Font.BOLD, 30));
		day.setBounds(24, 334, 583, 64);
		getContentPane().add(day);
		
		image = new JLabel();
		image.setHorizontalAlignment(SwingConstants.CENTER);
		image.setFont(new Font("굴림", Font.BOLD, 20));
		image.setBounds(375, 81, 232, 164);
		getContentPane().add(image);
		ImageIcon icon = new ImageIcon("001.png");
		image.setIcon(icon);
		
		counter = new JLabel("count: 500");
		counter.setHorizontalAlignment(SwingConstants.CENTER);
		counter.setFont(new Font("굴림", Font.BOLD, 40));
		counter.setBounds(24, 97, 262, 111);
		getContentPane().add(counter);
		
		//Count Thread
		Count2 c = new Count2();
		c.start();
		Day2 d = new Day2();
		d.start();
		Image2 i = new Image2();
		i.start();
		
		setVisible(true);
	}
	public static void main(String[] args) {
		ThreadGraphic t = new ThreadGraphic();
		
	}//main
	
	//변수를 공유해야하는 두 클래스가 있다면, 클래스안에 클래스를 낄 수 있다.
	//inner class, 내부클래스
	//내부클래스는 독립적으로 쓸 수 없다.
	public class Count2 extends Thread { //슈퍼클래스를 변경해서 바로 생성가능

		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) { //500부터 0까지 하나씩 감소하는 순서로 돌아
				counter.setText("count: " + i); //cpu 처리속도가 빨라서 한번에 500개 정도는 바로 뽑는다
				try {
					Thread.sleep(1000); //1초에 한번이라는 의미!(속도조절)
					//500 -> 0.5초라는 의미
				} catch (InterruptedException e) {
					//인터럽트(방해, 중단): esc, ctrl+c, power-off
					
				}//catch
			}//for
		}//run
	}//inncer class
	
	public class Day2 extends Thread {
		
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date = new Date();
				day.setText("날짜: " + date);
				try {
					Thread.sleep(1000); 
				} catch (InterruptedException e) {
					//인터럽트(방해, 중단): esc, ctrl+c, power-off
				}
			}
		}
	}
	
	public class Image2 extends Thread {

		@Override
		public void run() {
			String[] list = {"001.png", "002.png", "003.png", "004.png", "005.png"};
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
			if (i == 4) {
				i = -1;
			}
				try {
					//초를 설정할 때는 밀리세컨즈 , 1/1000설정.
					Thread.sleep(1000); 
				} catch (InterruptedException e) {
					//인터럽트(방해, 중단): esc, ctrl+c, power-off
				}
			}
		}
	}
}//class
