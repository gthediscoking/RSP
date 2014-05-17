/**
  * ジャンケンのプレイヤーを表すクラス。
  */
public class Player {
  // ジャンケンの手を表す定数
	public static final int STONE = 0;    //グー
	public static final int SCISSORS = 1; //チョキ
	public static final int PAPER = 2;    //パー

  //プレイヤークラスの属性
  /** プレイヤーの名前 */
  private String name_;

  /** プレイヤーの勝った回数 */
  private int winCount_;

  //プレイヤークラスの属性
  /**
   * ジャンケンの手を出す。
   *
   * @return ジャンケンの手
   */
  public int showHand()
   {
    playerHand = 0;

		// 0以上3未満の小数として乱数を得る
		randomNum = Math.random() * 3;
		if (randomNum < 1)
    {
			// randomNum が 0.0以上1.0未満の場合、"グー"
			playerHand = STONE;

			// プレイヤーの手を表示する
			// System.out.print("グー");
		}else if (randomNum < 2) {
			// randomNum が 1.0以上2.0未満の場合、"チョキ"
			playerHand = SCISSORS;

			// プレイヤーの手を表示する
			// System.out.print("チョキ");
		} else if (randomNum < 3) {
			// randomNum が 2.0以上3.0未満の場合、"パー"
			playerHand = PAPER;

			// プレイヤーの手を表示する
			// System.out.print("パー");
    }
      return playerHand;
   }

   /**
    * 審判から勝敗を聞く。
    *
    * @param result true:勝ち,false:負け
    */
  public void notifyResult(boolean result)
    {
      if (result == true) {
        winCount_++;
      }
    }

  /**
   * 自分の勝った回数を答える。
   *
   * @return 勝った回数
   */
   public int getWinCount()
   {
         return winCount_;
   }
