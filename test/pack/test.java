package pack;

import static org.junit.Assert.*;

import org.junit.Test;

import kalk.klient;

public class test {
	
	@Test
	public void test3() {
		// �������� ���������� < 16 �.
		// �� 120 �� 150 �.�.
		// ����� 22 ���, ���� ����� 3 ���
		// ��� �����������
		float k1=(float)1.4,k2=1,k3=2025,k4=(float)1.8;
		int s;
		//s - �������� �� ������� sums, ������������� � ������ klient
		s=klient.sums(k1,k2,k3,k4);
		// tests - �������� ��������
		int tests=9185;
		// �������� ������
		assertEquals((int)tests,s);
	}
	
	}
