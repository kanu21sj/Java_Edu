package 그래픽;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.SwingConstants;

public class ThreadPractice extends JFrame{
	JLabel time, picture, day, count;
	Day2 day2;
	Picture2 picture2;
	Count2 count2;
	Time2 time2;
	
	public ThreadPractice() {
		
		setSize(1000, 500);
		
		time = new JLabel("time 들어가는 부분");
		time.setFont(new Font("굴림", Font.BOLD, 30));
		getContentPane().add(time, BorderLayout.EAST);
		
		picture = new JLabel();
		picture.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(picture, BorderLayout.CENTER);
		
		day = new JLabel("date 들어가는 부분");
		day.setHorizontalAlignment(SwingConstants.CENTER);
		day.setFont(new Font("굴림", Font.BOLD, 25));
		getContentPane().add(day, BorderLayout.SOUTH);
		
		count = new JLabel("count 들어가는 부분");
		count.setFont(new Font("굴림", Font.BOLD, 30));
		getContentPane().add(count, BorderLayout.WEST);

		Time2 time2 = new Time2();
		time2.start();
		Picture2 picture2 = new Picture2();
		picture2.start();
		Day2 day2 = new Day2();
		day2.start();
		Count2 count2 = new Count2();
		count2.start();
		
		setVisible(true);
	}
	
	//클래스안에 전역변수를 공유할 목적으로 내부에 끼워 넣는 클래스: 내부 클래스
	//inner class
	public class Count2 extends Thread { //Thread가 가진 멤버 변수를 상속받아 사용, 클래스명은 생성자와 동일(Count2)
		//전역변수 중 count 사용하기 위해 count2를 이너클래스로 넣음 
		@Override //run 재정의 하기 위한 오버라이딩
		public void run() {
			for (int i = 100; i >= 0; i--) { //인덱스만큼 for문을 돌려 반복
				count.setText("minus: " + i); //count 변수에서 i값 가져옴
				try { //외부 데이터를 가져와서 실행하는 경우 try~catch문 사용
					Thread.sleep(1000); //1초에 한번의 속도로 반복(속도조절)
				} catch (InterruptedException e) {
					//인터럽트(방해, 중단): esc, ctrl+c, power-off
				}
			}
		}
	}
	
	public class Time2 extends Thread { //Thread가 가진 멤버 변수를 상속받아 사용, 클래스명은 생성자와 동일(Time2)
		//전역변수 중 count 사용하기 위해 count2를 이너클래스로 넣음 
		@Override //run 재정의 하기 위한 오버라이딩
		public void run() {
			
			for (int i = 0; i >= 0; i++) { //인덱스만큼 for문을 돌려 반복
				time.setText("plus: " + i); //count 변수에서 i값 가져옴
				
				try { //외부 데이터를 가져와서 실행하는 경우 try~catch문 사용
					Thread.sleep(1000); //1초에 한번의 속도로 반복(속도조절)
				} catch (InterruptedException e) {
					//인터럽트(방해, 중단): esc, ctrl+c, power-off
				}
				if (i == 5) {
					JOptionPane.showMessageDialog(null, "카운트가 종료되었습니다."); 
					//count 숫자가 5가 되었을 때 메세지 팝업
					System.exit(0);
					picture2.interrupt();
					count2.interrupt();
					day2.interrupt();
					//메세지창의 확인 눌렀을 경우 JFrame창 종료
				}
			}
		}
	}
	
	public class Picture2 extends Thread { //Thread가 가진 멤버 변수를 상속받아 사용, 클래스명은 생성자와 동일(Picture2)

		@Override //run 재정의 하기 위한 오버라이딩
		public void run() {
			String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png", "6.png"};
			//Java project에 저장된 이미지명 배열로 저장
			for (int i = 0; i < list.length; i++) { //list값 만큼 for문 반복
				ImageIcon icon = new ImageIcon(list[i]);//image사용하기 위해 생성자 호출
				picture.setIcon(icon);//image변수내 icon값 가져와서 사용
			if (i == 5) {
				//배열의 경우 0부터 첫번째 값이 시작되므로 마지막 값인 5가 되었을때
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
	
}
