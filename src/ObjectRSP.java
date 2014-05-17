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

		// プレイヤー2（山田さん）のインスタンス生成
		Player yamada = new Player("山田さん");
		
		// 村田さんと山田さんでジャンケンを開始する。
		saito.startJanken(murata, yamada);
	}
}
