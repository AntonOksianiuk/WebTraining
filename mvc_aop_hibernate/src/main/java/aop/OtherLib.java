package aop;

import org.springframework.stereotype.Component;

@Component("otherLib")
public class OtherLib {
	public void getBook() {
		System.out.println("Мы получаем книгу из OtherLib");
		System.out.println("-------------------------");
	}

	public String returnBook() {
		int a = 10/0;
		System.out.println("Мы вовращаем книгу в OtherLib");
		return "\"Война и мир\"";
	}

	public void getMagazine() {
		System.out.println("Мы берем журнал из OtherLib");
		System.out.println("-------------------------");

	}

	public void returnMagazine() {
		System.out.println("Мы возвращаем журнал в OtherLib");
		System.out.println("-------------------------");

	}

	public void addMagazine() {
		System.out.println("Мы добавляем журнал в OtherLib");
		System.out.println("-------------------------");

	}

	public void addBook(String person_name, Book book) {
		System.out.println("Мы добавляем книгу в OtherLib");
		System.out.println("-------------------------");
	}
}
