/**
 * 
 */
package rsp;

/**
 * 「グーが大好き！」戦略クラス。
 *
 */
public class StoneOnlyTactics implements Tactics {

	/**
	 * @see rsp.Tactics#readTactics()
	 * 
	 */
	@Override
	public int readTactics() {
		// TODO Auto-generated method stub
		// 必ずグーを出す
		return Player.STONE;
	}
}
