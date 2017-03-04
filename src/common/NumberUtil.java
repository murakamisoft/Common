package common;

import java.util.Random;

/**
 * 数値ユーティリティ
 */
public class NumberUtil {

	/**
	 * 乱数を取得する
	 *
	 * @param i
	 * @return 1から引数までの整数
	 */
	public static int getRndNo(int i) {
		Random r = new Random();
		return r.nextInt(i) + 1;
	}

}
