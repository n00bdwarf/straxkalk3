package pack;

import static org.junit.Assert.*;

import org.junit.Test;

import kalk.klient;

public class test {
	
	@Test
	public void test3() {
		// Грузовой автомобиль < 16 т.
		// От 120 до 150 л.с.
		// Свыше 22 лет, стаж свыше 3 лет
		// Без ограничения
		float k1=(float)1.4,k2=1,k3=2025,k4=(float)1.8;
		int s;
		//s - значение из функции sums, расположенной в классе klient
		s=klient.sums(k1,k2,k3,k4);
		// tests - итоговое значение
		int tests=9185;
		// итоговая сверка
		assertEquals((int)tests,s);
	}
	
	}
