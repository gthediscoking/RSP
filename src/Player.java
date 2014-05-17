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
  private int winCount_ = 0;

  //プレイヤークラスの操作
  
  /**
   * プレイヤークラスのコンストラクタ。
   * 
   * @param name
   */
  public Player(String name)
  {
	  this.name_ = name;
  }
  
  /**
   * ジャンケンの手を出す。
   *
   * @return ジャンケンの手
   */
  public int showHand()
   {
    int hand = 0;

		// 0以上3未満の小数として乱数を得る
		double randomNum = Math.random() * 3;
		if (randomNum < 1)
    {
			// randomNum が 0.0以上1.0未満の場合、"グー"
			hand = STONE;

			// プレイヤーの手を表示する
			// System.out.print("グー");
		}else if (randomNum < 2) {
			// randomNum が 1.0以上2.0未満の場合、"チョキ"
			hand = SCISSORS;

			// プレイヤーの手を表示する
			// System.out.print("チョキ");
		} else if (randomNum < 3) {
			// randomNum が 2.0以上3.0未満の場合、"パー"
			hand = PAPER;

			// プレイヤーの手を表示する
			// System.out.print("パー");
    }
      return hand;
   }

   /**
    * 審判から勝敗を聞く。
    *
    * @param result true:勝ち,false:負け
    */
  public void notifyResult(boolean result)
    {
      if (true == result) {
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

   /**
    * 自分の名前を答える。
    * 
    * @return the name_（名前）
    */
   public String getName() {
	   return name_;
   }
}
