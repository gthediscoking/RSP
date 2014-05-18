/**
 * 
 */
package rsp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 標準入力によりジャンケンの手をユーザに聞く戦略クラス。
 *
 */
public class AskTactics implements Tactics {
	/**
	 * @see rsp.Tactics#readTactics()
	 * 
	 * @return hand ジャンケンの手
	 */
	@Override
	public int readTactics() {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nジャンケンの手を入力して下さい。");
		System.out.println("\nジャンケンの手を入力して下さい。");
		
		return 0;
	}
	

}
