package common;

import java.util.Scanner;

/**
 * 文字列スキャンユーティリティ
 */
public class ScanUtil {

	/**
	 * 数値を入力する
	 *
	 * @return
	 */
	public static int inputNum() {
		Scanner scanner = new Scanner(System.in);
		String input = null;
		while (scanner.hasNext()) {
			input = scanner.next();
			break;
		}
		// scanner.close();
		return Integer.parseInt(input);
	}

}
