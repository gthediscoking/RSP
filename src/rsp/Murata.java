/**
 * ジャンケンプログラム用package。
 */
package rsp;

/**
 * "Player"クラスを継承した"Murata"クラス。
 *
 */
public class Murata extends Player {

	/**
	 * コンストラクタ。
	 * 
	 * @param name 名前
	 */
	public Murata(String name) {
		// スーパークラスのコンストラクタを呼び出す。
		super(name);
	}

	/**
	 * @see rsp.Player#showHand()
	 * ジャンケンの手を出す。
	 * スーパークラスの同名メソッドをオーバーライドしている。
	 * 
	 */
	@Override
	public int showHand() {
		// 必ずグーを出す。
		return STONE;
	}
}
