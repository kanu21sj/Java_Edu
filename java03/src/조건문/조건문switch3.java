package ���ǹ�;

import javax.swing.JOptionPane;

public class ���ǹ�switch3 {

	public static void main(String[] args) {
		String food = "�����";
		switch (food) {
		case "�����": //String�̱� ������ ""�� �־�� ��, �н����� ���� �Ǹ� ������ ��
			System.out.println("�߱������� ����");
			break;
		case "���": 
			System.out.println("�н������� ����");
			break;
		case "ȸ": 
			System.out.println("����������");
			break;
		default: // if���� else�� �ش�
			System.out.println("�׳� �ȸԾ��");
			break;
		}
			
		}

	}