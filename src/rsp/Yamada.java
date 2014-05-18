/**
 * ジャンケンプログラム用package。
 */
package rsp;

/**
 * "Player"クラスを継承した"Yamada"クラス。
 *
 */
public class Yamada extends Player {

	/**
	 * コンストラクタ。
	 * 
	 * @param name 名前
	 */
	public Yamada(String name) {
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
		// 必ずパーを出す。
		return PAPER;
	}
}
