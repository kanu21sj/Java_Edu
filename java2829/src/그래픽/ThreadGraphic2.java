package 그래픽;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic2 extends JFrame {//JFrame으로부터 상속받아 ThreadGraphic2클래스 자체가 JFrame이 된다.
	JLabel count, image, date; //내부클래스와 변수를 같이 사용하기 위해서 전역(global)변수로 선언을 해야한다.
	
	public ThreadGraphic2() {//생성자 메서드
		setSize(800, 300);
		
		count = new JLabel("count");
		count.setFont(new Font("굴림", Font.BOLD, 30));
		getContentPane().add(count, BorderLayout.WEST);
		
		image = new JLabel();
		image.setFont(new Font("굴림", Font.BOLD, 30));
		getContentPane().add(image, BorderLayout.CENTER);
		ImageIcon icon = new ImageIcon("001.png");
		image.setIcon(icon);
		
		date = new JLabel("date");
		date.setFont(new Font("굴림", Font.BOLD, 30));
		getContentPane().add(date, BorderLayout.SOUTH);
		
		Count c = new Count();
		Day d = new Day();
		Image i = new Image();
		c.start();
		d.start();
		i.start();
		
		setVisible(true);
	}

	public static void main(String[] args) {
		ThreadGraphic2 u = new ThreadGraphic2();
		//변수를 공유해야하는 두 클래스가 있다면, 클래스안에 클래스를 낄 수 있다.
		//inner class, 내부클래스
		//내부클래스는 독립적으로 쓸 수 없다.
	}
		public class Count extends Thread { //슈퍼클래스를 변경해서 바로 생성가능

			@Override
			public void run() {
				for (int i = 500; i >= 0; i--) { //500부터 0까지 하나씩 감소하는 순서로 돌아
					count.setText("count: " + i); //cpu 처리속도가 빨라서 한번에 500개 정도는 바로 뽑는다
					try {
						Thread.sleep(1000); //1초에 한번이라는 의미!(속도조절)
						//500 -> 0.5초라는 의미
					} catch (InterruptedException e) {
						//인터럽트(방해, 중단): esc, ctrl+c, power-off
						
					}//catch
				}//for
			}//run
		}//inncer class
		
		public class Day extends Thread {
			
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					Date date2 = new Date();
					date.setText("날짜: " + date2);
					try {
						Thread.sleep(1000); 
					} catch (InterruptedException e) {
						//인터럽트(방해, 중단): esc, ctrl+c, power-off
					}
				}
			}
		}
		
		public class Image extends Thread {

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
	}