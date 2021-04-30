package code15;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// 時間がかかる処理を記述
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は" + (end - start) + "ミリ秒でした");
	}

}
