package 그래픽;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ThreadGraphic3 extends JFrame {
	//jFrame이 가지고 있던 메서드, 멤버변수 다 가지고 태어남.
	//ThreadGraphic3에서 JFrame의 것을 다 쓸 수 있음.
	
	JLabel count, image, day; //전역(global) 변수로 사용하기 위한 변수 선언
	
	//기본 생성자
	public ThreadGraphic3() {
		//객체생성시 이 부분이 자동 호출되어 실행될 예정임.
		setSize(800, 300);
		
		count = new JLabel("counter 들어가는 부분"); //JLabel객체 사용하기 위해 생성
		image = new JLabel(); //JLabel객체 사용하기 위해 생성
		day = new JLabel("타이머 들어가는 부분"); //JLabel객체 사용하기 위해 생성
		
		add(count, BorderLayout.WEST);
		add(image, BorderLayout.EAST);
		add(day, BorderLayout.SOUTH);
		
		//Font font = new Font("고딕", Font.BOLD, 50);
		count.setFont(new Font("고딕", Font.BOLD, 50)); //count, Font 생성하기 위해 호출
		day.setFont(new Font("고딕", Font.BOLD, 45)); //day, Font 생성하기 위해 호출
		
		Count2 count2 = new Count2(); //이너클래스에서 사용하기 위한 Count2 객체 생성
		count2.start(); //count2 실행
		Day2 day2 = new Day2(); //이너클래스에서 사용하기 위한 Day2 객체 생성
		day2.start(); //day2 실행
		Image2 image2 = new Image2(); //이너클래스에서 사용하기 위한 Image2 객체 생성
		image2.start(); //image2 실행
		
		setVisible(true);
	}
		//클래스안에 전역변수를 공유할 목적으로 내부에 끼워 넣는 클래스: 내부 클래스
		//inner class
		public class Count2 extends Thread { //Thread가 가진 멤버 변수를 상속받아 사용, 클래스명은 생성자와 동일(Count2)
			//전역변수 중 count 사용하기 위해 count2를 이너클래스로 넣음 
			@Override //run 재정의 하기 위한 오버라이딩
			public void run() {
				for (int i = 0; i >= 0; i++) { //인덱스만큼 for문을 돌려 반복
					count.setText("count: " + i); //count 변수에서 i값 가져옴
					if ( i == 5 ) {
						JOptionPane.showMessageDialog(null, "카운트가 종료되었습니다.");
						System.exit(0);
					}
					try { //외부 데이터를 가져와서 실행하는 경우 try~catch문 사용
						Thread.sleep(1000); //1초에 한번의 속도로 반복(속도조절)
					} catch (InterruptedException e) {
						//인터럽트(방해, 중단): esc, ctrl+c, power-off
					}
				}
			}
		}
		
		public class Day2 extends Thread { //Thread가 가진 멤버 변수를 상속받아 사용, 클래스명은 생성자와 동일(Day2)
			//전역변수 중 day 사용하기 위해 count2를 이너클래스로 넣음 
			@Override //run 재정의 하기 위한 오버라이딩
			public void run() {
				for (int i = 0; i < 1000; i++) { //인덱스만큼 for문을 돌려 반복
					Date date = new Date(); //date 생성자 사용을 위한 호출
					day.setText("날짜: " + date); //day변수에서 date값 가져옴
					try { //외부 데이터를 가져와서 실행하는 경우 try~catch문 사용
						Thread.sleep(1000); //1초에 한번의 속도로 반복(속도조절)
					} catch (InterruptedException e) {
						//인터럽트(방해, 중단): esc, ctrl+c, power-off
					}
				}
			}
		}
		
		public class Image2 extends Thread { //Thread가 가진 멤버 변수를 상속받아 사용, 클래스명은 생성자와 동일(Image2)

			@Override //run 재정의 하기 위한 오버라이딩
			public void run() {
				String[] list = {"001.png", "002.png", "003.png", "004.png", "005.png"};
				//Java project에 저장된 이미지명 배열로 저장
				for (int i = 0; i < list.length; i++) { //list값 만큼 for문 반복
					ImageIcon icon = new ImageIcon(list[i]);//image사용하기 위해 생성자 호출
					image.setIcon(icon);//image변수내 icon값 가져와서 사용
				if (i == 4) {
					//배열의 경우 0부터 첫번째 값이 시작되므로 마지막 값인 4가 되었을때
					i = -1;
					//i++로 인하여 1추가 되므로 다시 첫번째 이미지부터 시작하기 위해 -1로 설정하여 i = 0으로 초기화 될 수 있게 설정         
				}
					try {
						//초를 설정할 때는 밀리세컨즈 , 1/1000설정.
						Thread.sleep(1000); //1초에 한번의 속도로 반복(속도조절)
					} catch (InterruptedException e) {
						//인터럽트(방해, 중단): esc, ctrl+c, power-off
					}
				}
			}
		}
	}