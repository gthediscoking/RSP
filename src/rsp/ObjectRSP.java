package rsp;
/**
 * オブジェクト指向によるジャンケンプログラム
 */
public class ObjectRSP {
	/**
	 * メイン処理。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 審判のインスタンス生成
		Judge saito = new Judge();
		
		// プレイヤー1（村田さん）のインスタンス生成
		Player murata = new Player("村田さん");
		
		// 村田さんに渡す戦略インスタンス生成
		Tactics murataTactics = new AskTactics();
		
		// 村田さんに戦略クラスを渡す
		murata.setTactics(murataTactics);

		// プレイヤー2（山田さん）のインスタンス生成
		Player yamada = new Player("山田さん");
		
		// 山田さんに渡す戦略インスタンス生成
		Tactics yamadaTactics = new RandomTactics();
		
		// 山田さんに戦略クラスを渡す
		yamada.setTactics(yamadaTactics);		
		
		// 村田さんと山田さんでジャンケンを開始する。
		saito.startJanken(murata, yamada);
	}
}
