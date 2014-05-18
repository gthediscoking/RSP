/**
 * 
 */
package rsp;

/**
 * ランダムに手を決める戦略クラス。
 *
 */
public class RandomTactics implements Tactics {
	/**
	 * @see rsp.Tactics#readTactics()
	 * 戦略を読み、ジャンケンの手を得る。
	 * 
	 * @return hand ジャンケンの手
	 */
	@Override
	public int readTactics() {
		int hand = 0;

		// 0以上3未満の小数として乱数を得る
		double randomNum = Math.random() * 3;
		if (randomNum < 1)
		{
			// randomNum が 0.0以上1.0未満の場合、"グー"
			hand = Player.STONE;
		}else if (randomNum < 2) {
			// randomNum が 1.0以上2.0未満の場合、"チョキ"
			hand = Player.SCISSORS;
		} else if (randomNum < 3) {
			// randomNum が 2.0以上3.0未満の場合、"パー"
			hand = Player.PAPER;
	    }
		
		// 決定した手を戻り値として返す
		return hand;
	}
}
