package common;

import java.math.BigDecimal;
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

	public static BigDecimal getRndNoBigDecimal(BigDecimal rnd) {
		Random r = new Random();
		BigDecimal b = new BigDecimal(r.nextDouble());
		return b.multiply(rnd);
	}

	/**
	 * b1がb2より大きいか
	 * @param b1
	 * @param b2
	 * @return
	 */
	public static boolean isGreater(BigDecimal b1, BigDecimal b2) {
		return (b1.compareTo(b2) == 1);
	}

}
